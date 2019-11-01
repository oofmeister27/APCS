/**
* @author Aarav Navani
* Period #3
* 
* A class that produces Koch Curves and Koch Snowflakes
*/
import gpdraw.*; // import DrawingTool class

public class KochCurve
{
	public static DrawingTool marker; 
	public SketchPadWithNoDelay paper;

	
	/**
	 * constructor KochCurve - initializes length and width of SketchPad, 
	 * as well as position where SketchPad is created
	 * @param length - length of SketchPad
	 * @param width - width of SketchPad
	 * @param x - x coordinate of top left corner
	 * @param y - y coordinate of top left corner
	 */
	public KochCurve(int length, int width, int x, int y)
	{
		paper = new SketchPadWithNoDelay(length, width, x, y);
		marker = new DrawingTool(paper);
	}
	
	/**
	 * Method to produce Koch Curve
	 * @param numberOfLevels - number of levels of replacemnt of lines
	 * @param size - length of starting line for Koch curve
	 */
	public void drawKochCurve(int numberOfLevels, double size)
	{
		if (numberOfLevels < 1)
		{
			marker.down();
			marker.forward(size);
		}
		else
		{
			marker.down();
			drawKochCurve(numberOfLevels - 1, size / 3);
			marker.turnLeft(60);
			drawKochCurve(numberOfLevels - 1, size / 3);
			marker.turnRight(120);
			drawKochCurve(numberOfLevels - 1, size / 3);
			marker.turnLeft(60);
			drawKochCurve(numberOfLevels - 1, size / 3);
		}
	}
	
	/**
	 * Method to produce Koch Snowflake
	 * @param numberOfLevels - number of levels of replacemnt of lines
	 * @param size - length of starting line for Koch curve
	 */
	public void drawSnowflake(int numberOfLevels, int size)
	{
		marker.up();
       marker.forward(size/3);
       marker.turnLeft();
       marker.forward(size/2);
       marker.turnRight(180);
       marker.down();
       drawKochCurve(numberOfLevels, size);
       marker.turnRight(120);
       drawKochCurve(numberOfLevels, size);
       marker.turnRight(120);
       drawKochCurve(numberOfLevels, size);
	}

} // end class