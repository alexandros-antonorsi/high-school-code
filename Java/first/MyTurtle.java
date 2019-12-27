import java.awt.Color;


public class MyTurtle {
	
	public static void main(String[] args){
		
		int h = 30;
		int w = 50;
		int box = 0;
		
		World pond = new World();
		Turtle sabrina = new Turtle(pond);
		/*
		sabrina.setPenWidth(3);
		sabrina.setPenColor(Color.MAGENTA);
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnLeft();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnLeft();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.penUp();
		sabrina.moveTo(100, 100);
		sabrina.penDown();
		sabrina.setPenColor(Color.CYAN);
		sabrina.setPenWidth(10);
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.forward(w);
		sabrina.turnRight();
		sabrina.forward(h);
		sabrina.turnRight();
		sabrina.forward(w); 
		*/
		sabrina.penUp();
		sabrina.moveTo(0, 0);
		Picture p = new Picture("SWAGDADDY.png");
		sabrina.drop(p);
		
		
	}
}
