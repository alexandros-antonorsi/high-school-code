import java.util.Scanner;

public class sierpinski {

    //  Height of an equilateral triangle whose sides are of the specified length.
    public static double height(double length){
    	return length*Math.sqrt(3)/2.0;
    }

    //  Draws a filled equilateral triangle whose bottom vertex is (x, y)
    //  of the specified side length.
    public static void filledTriangle(double x, double y, double length){
    	double[] xD = {x, x-length/2.0, x+length/2.0};
    	double[] yD = {y, y+height(length), y+height(length)};
    	StdDraw.filledPolygon(xD, yD);
    }

    //  Draws a Sierpinski triangle of order n, such that the largest filled
    //  triangle has bottom vertex (x, y) and sides of the specified length.
    public static void sierpinski(int n, double x, double y, double length){
    	if(n==0)
    		return;
    	else{
    		sierpinski(n-1, x-length/2.0, y, length/2.0);
    		sierpinski(n-1, x+length/2.0, y, length/2.0);
    		sierpinski(n-1, x, y+height(length), length/2.0);
    		filledTriangle(x, y, length);
    		n--;
    	}
    	
    }

    //  Takes an integer command-line argument n;
    //  draws the outline of an equilateral triangle (pointed upwards) of length 1;
    //  whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and
    //  draws a Sierpinski triangle of order n that fits snugly inside the outline.
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	StdDraw.line(0, 0, 1, 0);
    	StdDraw.line(0, 0, 0.5, height(1));
    	StdDraw.line(0.5, height(1), 1, 0);
    	int red = (int)(Math.random()*255);
    	int green = (int)(Math.random()*255);
    	int blue = (int)(Math.random()*255);
    	
    	StdDraw.setPenColor(red, green, blue);
    	sierpinski(n, 0.5, 0, 0.5);
    }
}