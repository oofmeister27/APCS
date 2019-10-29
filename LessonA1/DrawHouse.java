//Aarav Navani
//Period 3
import gpdraw.*;
public class DrawHouse {
	private DrawingTool pencil;
	private SketchPad myPaper; 
	
	public DrawHouse() {
		myPaper = new SketchPad(500, 500);
		pencil = new DrawingTool(myPaper);
	}
	
	public void draw() {

		pencil.up();

		
		pencil.turnRight(90);
		pencil.backward(100);

		pencil.turnLeft(90);
		pencil.forward(50);
		pencil.turnRight(90);

		
		pencil.down();
		pencil.forward(200);
		pencil.turnRight(90);
		pencil.forward(100);
		pencil.turnRight(90);
		pencil.forward(200);
		pencil.turnRight(90);
		pencil.forward(100);

		
		pencil.move(0, 100);
		pencil.move(100, 50);

		
		pencil.up();
		pencil.move(15, -50);
		pencil.setDirection(90);
		
		
		pencil.down();
		pencil.forward(45);
		pencil.turnLeft(90);
		pencil.forward(30);
		pencil.turnLeft(90);
		pencil.forward(45);
		
		
		pencil.up();
		pencil.move(-65, 35);
		pencil.setDirection(0);
		
		
		pencil.down();
		pencil.forward(20);
		pencil.turnRight(90);
		pencil.forward(20);
		pencil.turnRight(90);
		pencil.forward(20);
		pencil.turnRight(90);
		pencil.forward(20);
		
		
		pencil.up();
		pencil.move(35, 35);
		pencil.setDirection(0);
		
		
		pencil.down();
		pencil.forward(20);
		pencil.turnRight(90);
		pencil.forward(20);
		pencil.turnRight(90);
		pencil.forward(20);
		pencil.turnRight(90);
		pencil.forward(20);
		
		
		}
}

		



