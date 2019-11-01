/**
 *
 * @author Aarav Navani
 * Period 3
 */

import java.util.*;
/**
 * car rental driver
 * 
*/
public class CarRentalDriver {
   /**
    * main class: car rental class
    * @param args - main class arguments
   */
	public static void main(String[] args) {
		CarRental car1 = new CarRental("Chevrolet", "Suburban", "CPR 607");
		System.out.print(car1.toString());
		
		
		CarRental car2 = new CarRental("Honda", "Civic", "RJK 492");
		System.out.print(car2.toString());
		
		CarRental car3 = new CarRental("Nissan", "Maxima", "SPT 309");
		System.out.print(car3.toString());

	}
}

