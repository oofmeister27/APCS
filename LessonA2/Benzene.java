//Aarav Navani
//Period 3
import gpdraw.*;
public class Benzene{
    private DrawingTool pen = new DrawingTool(new SketchPad(400,400));
   
    public static void main(String[] args){
        Benzene benzene = new Benzene();
        benzene.draw();
    }

    public void draw(){
        Hexagon();
        Circle();
    }
    private void Hexagon(){
        pen.up();
        pen.move(0, 100);
        pen.down();
        pen.turnRight(120);
        pen.forward(100);
        Edge();
        Edge();
        Edge();
        Edge();
        Edge();
    }
    
    private void Circle(){
        pen.up();
        pen.home();
        pen.down();
        pen.drawCircle(70);
    }
    
    private void Edge(){
        pen.turnRight(60);
        pen.forward(100);
    }
}