/**
 * 
 * @author Aarav Navani
 * period 3
 */
import java.util.Scanner;
/**
 * initialize class Elevator
*/
public class Elevator {
	private final int MAX_FLOORS = 20;
	/**
	 * method to simulate an elevator
   */
   public void simulate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Floor: ");
		if (sc.hasNextInt()) {
			int elevatorFloor = sc.nextInt();
			if (elevatorFloor == 13) {
				System.out.println("Error: There is no thirteenth floor");
			}
			if (elevatorFloor < 1 || elevatorFloor > MAX_FLOORS) {
				System.out.println("Error: The floor must be between 1 and 20");
			} 
			if (elevatorFloor > 1 && elevatorFloor < 13) {
				System.out.println("Thank you, I will take you to the actual floor " + elevatorFloor);
			}
			if (elevatorFloor > 13 && elevatorFloor < MAX_FLOORS) {
				System.out.println("Thank you, I will take you to the actual floor " + (elevatorFloor - 1));
			}
		}
		else {
			System.out.println("Error: Not an integer");
		}
		
			
	}
}
