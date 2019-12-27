
class Transformations{
	public static double scale(double a, double f){
		return a*f;
	}
	public static double translate(double a, double diff){
		return a+diff;
	}
	public static double rotateX(double x,double y, double angle){
		return x*Math.cos(angle)-y*Math.sin(angle);
	}
	public static double rotateY(double x,double y, double angle){
		return y*Math.cos(angle)+x*Math.sin(angle);
	}
}
public class Transform2D {

// Returns a new array object that is an exact copy of the given array.
// The given array is not be mutated.
	public static double[] copy(double[] array){
		double[] n = new double[array.length];
		for(int i=0;i<n.length;i++)
			n[i]=array[i];
		return n;
	}

	    // Scales the polygon by the factor alpha.
	    public static void scale(double[] x, double[] y, double alpha){
	    	for(int i=0;i<x.length;i++){
	    		x[i] *= alpha;
	    		y[i] *= alpha;
	    	}
	    }

	    // Translates the polygon by (dx, dy).
	    public static void translate(double[] x, double[] y, double dx, double dy){
	    	for(int i=0;i<x.length;i++){
	    		x[i] += dx;
	    		y[i] += dy;
	    	}
	    	
	    }

	    // Rotates the polygon theta degrees counterclockwise, about the origin.
	    public static void rotate(double[] x, double[] y, double theta){
	    	for(int i=0;i<x.length;i++){
	    		double nx = x[i];
	    		x[i] = Transformations.rotateX(x[i], y[i], theta);
	    		y[i] = Transformations.rotateY(nx, y[i], theta);
	    	}
	    }
	    

	    // Tests each of the API methods by directly calling them.
	    public static void main(String[] args){
	    	// Scales polygon by the factor 2.
	    	/*StdDraw.setScale(-5.0, +5.0);
	    	double[] x = { 0, 1, 1, 0 };
	    	double[] y = { 0, 0, 2, 1 };
	    	double alpha = 2.0;
	    	StdDraw.setPenColor(StdDraw.RED);
	    	StdDraw.polygon(x, y);
	    	scale(x, y, alpha);
	    	StdDraw.setPenColor(StdDraw.BLUE);
	    	StdDraw.polygon(x, y);*/
	    	
	    	// Translates polygon by (2, 1).
	    	/*StdDraw.setScale(-5.0, +5.0);
	    	double[] x = { 0, 1, 1, 0 };
	    	double[] y = { 0, 0, 2, 1 };
	    	double dx = 2.0, dy = 1.0;
	    	StdDraw.setPenColor(StdDraw.RED);
	    	StdDraw.polygon(x, y);
	    	translate(x, y, dx, dy);
	    	StdDraw.setPenColor(StdDraw.BLUE);
	    	StdDraw.polygon(x, y);*/
	    	
	    	// Rotates polygon 45 degrees.
	    	
	    	StdDraw.setScale(-5.0, +5.0);
	    	double[] x = { 0, 1, 1, 0 };
	    	double[] y = { 0, 0, 2, 1 };
	    	double theta = 45.0;
	    	StdDraw.setPenColor(StdDraw.RED);
	    	StdDraw.polygon(x, y);
	    	rotate(x, y, theta);
	    	StdDraw.setPenColor(StdDraw.BLUE);
	    	StdDraw.polygon(x, y);
	    }
	
}
