/**
 * 
 * @author your name period
 *
 */
public class Point {
	// Place your instance variables here
	private double x;
	private double y;

	/**
	 * Default constructor initializes to origin
	 */
	public Point() {
		x = 0;
		y = 0;
		// Your code goes here
	}

	/**
	 * Parameter constructor initializes to given x and y coordinate
	 * 
	 * @param myX - x coordinate
	 * @param myY - y coordinate
	 */
	public Point(double myX, double myY) {
		x = myX;
		y = myY;
		// Your code goes here
	}

	/**
	 * Parameter constructor initializes this point to the coordinates of given
	 * point
	 * 
	 * @param p - Another point
	 * 
	 */
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
		// Your code goes here

	}

	/**
	 * Returns the x coordinate of this point
	 * 
	 * @return x coordinate
	 */
	public double getX() {
		return x;
		// Your code goes here

	}

	/**
	 * Returns the y coordinate of this point
	 * 
	 * @return y coordinate
	 */
	public double getY() {
		return y;
		// Your code goes here

	}

	/**
	 * Sets the x coordinate of this point
	 * 
	 * @param myX - x coordinate
	 */
	public void setX(double myX) {
		x = myX;
		// Your code goes here

	}

	/**
	 * Sets the y coordinate of this point
	 * 
	 * @param myY - y coordinate
	 */
	public void setY(double myY) {
		y = myY;
		// Your code goes here

	}

	/**
	 * Sets the x and y coordinate of this point
	 * 
	 * @param myX - x coordinate
	 * @param myY - y coordinate
	 */
	public void setXY(double myX, double myY) {
		x = myX;
		y = myY;
		// Your code goes here

	}

	/**
	 * Sets x and y of this point to given point
	 * 
	 * @param p - point
	 */

	public void setPoint(Point p) {
		this.x = p.x;
		this.y = p.y;
		// Your code goes here

	}

	/**
	 * Determines the quadrant 0 (origin), 1, 2, 3, or 4 where this point lies
	 * 
	 * @return quadrant number or 0 if it is the origin
	 */
	public int quadrant() {
		if (x > 0 && y > 0) {
			return 1;// Your code goes here
		}
		if (x < 0 && y > 0) {
			return 2;
		}
		if (x < 0 && y < 0) {
			return 3;
		}
		if (x > 0 && y < 0) {
			return 4;
		} else {
			return 0;
		}

	}

	/**
	 * Finds and returns the distance between this point and given x and y
	 * coordinate
	 * 
	 * @param otherX - x coordinate of other point
	 * @param otherY - y coordinate of other point
	 * @return distance between this point and other point
	 */
	public double distance(double otherX, double otherY) {
		double distance = Math.sqrt(Math.pow(otherX - x, 2) + Math.pow(otherY - y, 2));
		return distance;
		// Your code goes here
	}

	/**
	 * Finds and returns the distance between this point and other given point
	 * 
	 * @param other - other point
	 * @return distance between this point and other given point
	 */
	public double distance(Point other) {
		double distance = Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
		return distance;
		// Your code goes here

	}

	/**
	 * Determines if this point is equal to another given point
	 * 
	 * @param p another point to compare to
	 * @return true if the two points are the same, false otherwise
	 */
	public boolean equals(Point p) {
		if (p.x == x && p.y == y) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Compares the distance between this point and points p1 and p2 Returns the
	 * point that is farthest
	 * 
	 * @param p1 first point
	 * @param p2 second point
	 * @return point that is farthest away null if they are equidistant
	 */
	public Point whichIsFarther(Point p1, Point p2) {
		double distance1 = distance(p1.x - x, p1.y - y);
		double distance2 = distance(p2.x - x, p2.y - y);
		if (distance1 > distance2) {
			return p1;// Your code goes here
		} else if (distance1 == distance2) {
			return null;
		} else {
			return p2;
		}

	}

	/**
	 * Creates a formatted String of the object
	 * 
	 * @return point as a formatted string
	 */
	public String toString() {
		return "(" + String.format("%.2f", getX()) + ", " + String.format("%.2f", getY()) + ")";
	}
}