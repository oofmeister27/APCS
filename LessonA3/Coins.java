/**
 * 
 * @author Aarav Navani
 * period  3
 */
public class Coins {
	private int cents;
	


	/**
	 * constructor to initialize the instance variables
	 * @param money - amount for which the change is to
	 * 			be computed
	 */
	
	public Coins(int money)
	{
		cents = money;
		
	}
	/**
	 * method to calculate the change
	 * @param money the amount for which the change is 
	 * 			to be computed
	 */
	public void change()
	{
		int remainingChange = cents;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		quarters = remainingChange / 25;
		remainingChange = remainingChange % 25;
		dimes = remainingChange / 10;
		remainingChange = remainingChange % 10;
		nickels = remainingChange / 5;
		remainingChange = remainingChange % 5;
		pennies = remainingChange;
		System.out.println(cents + " cents =>");
		System.out.println("  Quarter(s) \t" + quarters);
		System.out.println("  Dime(s) \t" + dimes);
		System.out.println("  Nickel(s) \t" + nickels);
		System.out.println("  Penny(s) \t" + pennies);
		
		
		
		
	}

}