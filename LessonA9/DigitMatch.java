/**
 * 
 * @author Aarav Navani
 * period 3
 */
public class DigitMatch {
	/**
	 * Counts the number of matching digits in the two given integers
	 * @param x - first integer
	 * @param y - second integer
	 * @return number of matching digits
	 */
	public int countMatch(int x, int y) {
		if (x == 0 && y == 0) {
		   return 1;
		}
		else {
		   int result = 0;
		   if (x % 10 == y % 10) {
            result++;
		   }
		   if (x / 10 == 0 || y / 10 == 0) {
		      return result;
		   }
         return result + countMatch(x / 10, y / 10);
		}
	}
}