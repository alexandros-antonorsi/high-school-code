public class Line {
	private double m, b;
	public Line(double slope, double yint){
		m = slope;
		b = yint;
	}
	public Line(Point a, double slope){
		m = slope;
		double yint = a.getY();
		for(int i = 0; i<a.getX(); i++){
			yint = yint-slope;
		}
		b = yint;
	}
	public double getSlope(){
		return m;
	}
	public double getYInt(){
		return b;
	}
	public String toString(){
		return "y= "+m+"x + "+b;
	}
	public boolean equals(Line a){
		return m==a.m && b==a.b;
	}
	public boolean perpendicular(Line a){
		return (a.m*m)==-1;
	}
}
