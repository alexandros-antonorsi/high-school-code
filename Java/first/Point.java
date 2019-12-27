
public class Point {
	private double xcoord;
	private double ycoord;
	public Point(double a, double b){
		xcoord = a;
		ycoord = b;
	}
	public double getX(){
		return xcoord;
	}
	public double getY(){
		return ycoord;
	}
	public String toString(){
		return "("+xcoord+","+ycoord+")";
			
	}
	public double findSlope(Point a){
		double x2 = a.getX();
		double y2 = a.getY();
		double slope = (y2-ycoord)/(x2-xcoord);
		return slope;
	}
	public double distance(Point a){
		double x2 = a.getX();
		double y2 = a.getY();
		double distance = Math.sqrt(Math.pow((x2-xcoord), 2)+Math.pow((y2-ycoord),2));
		return distance;
	}
	
}
