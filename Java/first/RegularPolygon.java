
public abstract class RegularPolygon implements Comparable{
	private int numSides;
	private double sideLength;
	public RegularPolygon(int n, double s){
		numSides = n;
		sideLength = s;
	}
	public abstract double getArea();
	public abstract String getType();
	public double getPerimeter(){
		return sideLength*numSides;
	}
	public int getNumSides(){
		return numSides;
	}
	public double getSideLength(){
		return sideLength;
	}
	public String toString(){
		return "I am a "+getType()+" with a side length of "+sideLength;
	}
	public int compareTo(Object a){
		RegularPolygon b = (RegularPolygon)a;
		if(getArea()>b.getArea()){
			return 1;
		}
		if(getArea()<b.getArea()){
			return -1;
		}
		return 0;
		
	}
	public static void sort(RegularPolygon[] h){
		for(int i=0;i<h.length-1;i++){
			double tempMin = h[i].getArea();
			int posMin = i;
			for(int j=i+1;j<h.length;j++){
				if(h[j].getArea()<tempMin){
					tempMin=h[j].getArea();
					posMin=j;
				}
			}
			RegularPolygon tempPoly = h[posMin];
			h[posMin]=h[i];
			h[i]=tempPoly;
		}
	}
	public void duplicate1(RegularPolygon other){
		other = this;
	}
	public void duplicate2(RegularPolygon other){
		other.numSides = numSides;
		other.sideLength = sideLength;
	}
}
