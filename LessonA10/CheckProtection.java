
import java.util.Scanner;
/**
 * initialization of class
*/
public class CheckProtection {
	
	private String amount;
	private final int MAX_LENGTH;

	/**
	 * Constructor prompts For the amount, rounds the amount to two
	 * decimal places checks if the amount entered has a length less than
	 * MAX_LENGTH If the amount exceeds the MAX_LENGTH, prints an error message
	 * If the amount is within range prints the check amount with commas and
	 * spaces filled with *
	 * @param max - maximum length FOR the amount string
	 */
	public CheckProtection(int max) 
	{
		MAX_LENGTH = max;
      Scanner in = new Scanner(System.in);
		System.out.print("Enter the check amount: ");
	   double amountD = in.nextDouble();
	   amountD = Math.round(amountD * 100.00) / 100.0;
	   amount = amountD + "";
	   if ((amount.length() - 1) - amount.indexOf(".") != 2) {
	      amount = amount + "0";
	   }
	   if (amount.length() > MAX_LENGTH) {
	      System.out.println("Error: Number is too big");
	   }
	   else {
	      printAmount();
	   }
	   
	}

	/**
	 * Adds commas to the number recursively
	 * 
	 * @param s - number as a string
	 * @return - number with commas inserted
	 */
	public String addCommas(String s) 
	{
		if(s.length() <= 6){
         return s;
      }
      return addCommas(s.substring(0, s.length() - 6)) + "," + s.substring(s.length() - 6, s.length());
   }

	/**
	 * Adds the stars to fill in leading spaces recursively
	 * 
	 * @param s - number as a string
	 * @return - number with leading stars
	 */
	public String addAsterisks(String s) 
	{
	   //System.out.println("max: " + MAX_LENGTH);
	   //System.out.println("s: " + s.length());
	   //System.out.println("string: " + s);
	   if (MAX_LENGTH == s.length()) {
		   return s;
		}
		else {
		   return addAsterisks("*"+s);
		}    
		//Your code goes here
	}

	/**
	 * Prints the amount with leading stars and commas in the between
	 */
	public void printAmount() 
	{
	   amount = addCommas(amount);
      amount = addAsterisks(amount);
	   System.out.println("amount = $" + amount);
	}
}