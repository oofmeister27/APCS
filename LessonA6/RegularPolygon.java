/**
    * class RegularPolygon - class to model any regular polygon
    * @author Aarav Navani
    * @period 3
    *
    */

/**
 * class initialization
 */
public class RegularPolygon {
	private int myNumSides;
	private double mySideLength;
	private double myR;
	private double myr;

	/**
	 * constructor to initialize values
	 * 
	 * @param numSides   variable to hold the number of sides in the polygon
	 * @param sideLength variable to hold the side length
	 */
	public RegularPolygon(int numSides, double sideLength) {
		myNumSides = numSides;
		mySideLength = sideLength;
		calcR();
		calcr();
	}

	/**
	 * default constructor to initialize values
	 */
	public RegularPolygon() {
		myNumSides = 3;
		mySideLength = 0;
		calcR();
		calcr();
	}

	/**
	 * method to calculate r
	 */
	private void calcr() {
		myr = (1.0 / 2.0) * mySideLength * (1.0 / Math.tan(Math.PI / myNumSides));
	}

	/**
	 * method to calculate R
	 */
	private void calcR() {
		myR = (1.0 / 2.0) * mySideLength * (1.0 / Math.sin(Math.PI / myNumSides));
	}

	/**
	 * method to calculate vertex angle
	 * 
	 * @return vertex angle of polygon
	 */
	public double vertexAngle() {
		double vertexAngle = ((myNumSides - 2.0) / myNumSides) * 180;
		return vertexAngle;
	}

	/**
	 * method to find perimeter
	 * 
	 * @return perimeter of polygon
	 */
	public double Perimeter() {
		return (myNumSides * mySideLength);
	}

	/**
	 * method to find area
	 * 
	 * @return area of polygon
	 */
	public double Area() {
		return (1.0 / 2.0) * myNumSides * Math.pow(myR, 2) * Math.sin(2 * Math.PI / myNumSides);
	}

	/**
	 * method to get the number of sides of the polygon
	 * 
	 * @return the number of sides of the polygon
	 */
	public int getNumside() {
		return myNumSides;
	}

	/**
	 * method to get the side length of the polygon
	 * 
	 * @return the side length of the polygon
	 */
	public double getSideLength() {
		return mySideLength;
	}

	/**
	 * method to get R
	 * 
	 * @return value of R
	 */
	public double getR() {
		return myR;
	}

	/**
	 * method to get r
	 * 
	 * @return value of r
	 */
	public double getr() {
		return myr;
	}
}
