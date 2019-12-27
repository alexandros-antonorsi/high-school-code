	
public class EquilateralTriangle extends RegularPolygon{
	public EquilateralTriangle(double len){
		super(3,len);
	}
	public String getType(){
		return "equilateral triangle";
	}
	public double getArea(){
		return getSideLength()*getSideLength()*Math.sqrt(3)/4;
	}
}
