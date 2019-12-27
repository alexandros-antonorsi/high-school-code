
public abstract class Box implements Dimensions{
	private double length, width, height;
	public Box(){
		length = 12;
		width = 12;
		height = 12;
	}
	public Box(double l, double w, double h){
		length = l;
		width = w;
		height = h;
	}
	public abstract String purpose();
	public double getVolume(){
		return height*width*length;
	}
	public String toString(){
		return "The purpose of this box is " + purpose() + ". The dimensions are: " + height + " x " + length + " x " + width;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
}
