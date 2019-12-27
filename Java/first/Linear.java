
public class Linear implements Function{
	private double m, b;
	public Linear(double slope, double yInt){
		m = slope;
		b = yInt;
	}
	public double getY(double x){
		return m*x+b;
	}
	public double getX(double y){
		return (y-b)/m;
	}
	public double getRoot(){
		return getX(0);
	}
	public double getSlope(){
		return m;
	}
	public double getYInt(){
		return b;
	}
}
