
public class Square extends RegularPolygon{
	public Square(double len){
		super(4,len);
	}
	public String getType(){
		return "square";
	}
	public double getArea(){
		return Math.pow(getSideLength(), 2);
	}
}
