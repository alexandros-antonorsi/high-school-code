
public class PointTester {
	public static void main(String args[]){
		Point a = new Point(0,0);
		Point b = new Point(3,4);
		System.out.println(a);
		System.out.println(a.findSlope(b));
		System.out.println(a.distance(b));
		Line x = new Line(a, 2);
		Line y = new Line(-1/2, 4);
		System.out.println(x);
		System.out.println(y);
		Line john = new Line(2, 4);
		Line cena = new Line(-1/2, 4);
		System.out.println(john.perpendicular(cena));
	}
}
