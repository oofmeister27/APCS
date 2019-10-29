/**
 * 
 * @author Aarav Navani
 * period 3
 */
public class Car {		
		//initalize instance variables 
		private int startOdometer = 0;
		private int currentOdometer = 0;
		private double gallonsConsumed;
		
		//default Constructor 
		public Car (int odometerReading) {
			startOdometer = odometerReading;
		}
		//method to simulate the filling up of a car
		public void fillUp(int currentOdometer1, double gallonsConsumed1) {
			currentOdometer = currentOdometer1;
			gallonsConsumed = gallonsConsumed1;
		}
		//method to calculate and return the miles per gallon 
		public double calculateMPG() {
			return (currentOdometer - startOdometer) / gallonsConsumed; 
		}
		//sets the startOdometer to the currentOdometer reading and sets the gallons consumed equal to 0
		public void resetMPG() {
			startOdometer = currentOdometer;
			gallonsConsumed = 0;
		}
		
}


