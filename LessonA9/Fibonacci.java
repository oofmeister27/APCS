/**
 *   
 * @author Aarav Navani
 * Period 3
 */
/** Fibonacci class
 */
public class Fibonacci {
	/**
	 * method to find fibonacci number at a specific position
	 * @param n - position of fibonacci number
	 * @return fibonacci number at position n
	 */

	public int fib(int n)
	{
		if (n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
		
	}//end method

}//end class