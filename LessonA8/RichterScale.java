/**
 * 
 * @author Aarav Navani
 * period 3
 */

public class RichterScale {
	/**
	 * method that determines the effect on the buildings given the number on the richter scale
	 * @param richter - stores value on richter scale
	*/
	public static void getEffect(double richter)
	{
		if (richter >= 8) {
			System.out.println("Most structures fall");
		}
		else {
			if (7 < richter && richter < 8) {
				System.out.println("Many buildings destroyed");
			}
			if (6 < richter && richter < 7) {
				System.out.println("Many buildings considerably damaged, some collapse");
			}
			if (4.5 < richter && richter < 6) {
				System.out.println("Damage to poorly constructed buildings");
			}
			if (richter < 4.5) {
				System.out.println("No destruction of buildings");
			}
		}
	}
}