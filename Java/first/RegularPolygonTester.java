import java.util.Arrays;

public class RegularPolygonTester {
	public static void main(String[] args){
		RegularPolygon s = new Square(3);
		RegularPolygon e = new EquilateralTriangle(3);
		Square s2 = new Square(9);
		EquilateralTriangle e2 = new EquilateralTriangle(6);
		RegularPolygon[] polys = {s,e,s2,e2};
		for(int i=0;i<4;i++){
			System.out.println(polys[i]);
		}
		RegularPolygon largest = polys[0];
		for(int i=0;i<polys.length;i++){
			if(polys[i].getArea()>largest.getArea()){
				largest = polys[i];
			}
		}
		System.out.println("I have the largest area and "+largest);
		//RegularPolygon.sort(polys);
		Arrays.sort(polys);
		for(int i=0;i<4;i++){
			System.out.println(polys[i].getArea());
		}
		RegularPolygon other = new Square(40);
		int r = (int)(Math.random()*polys.length);
		polys[r].duplicate1(other);
		System.out.println(other.getArea());
		polys[r].duplicate2(other);
		System.out.println(other.getArea());
	}
}
