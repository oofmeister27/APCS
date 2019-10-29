
/**
 * @author Aarav Navani
 * @period 3
*/
import java.util.Random;

/**
 * * <b>summary</b>: initialization of class coins
 */
public class Coin {
	private Random rand;

	/**
	 * <b>summary</b>: parameter constructor
	 * 
	 * @param seed - takes in the seed
	 */
	public Coin(int seed) {
		rand = new Random(seed);
		// Your code goes here
	}

	/**
	 * <b>summary</b>: method to simulate flipping a coin
	 */
	public void flip() {
		int winner = rand.nextInt(2) + 1;
		System.out.println("Flipped " + winner);
	}

	/**
	 * <b>summary</b>: method to simulate flipping a coin 5 times
	 */
	public void flip5() {
		flip();
		flip();
		flip();
		flip();
		flip();
	}

}