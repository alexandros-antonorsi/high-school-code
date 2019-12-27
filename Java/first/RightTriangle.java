public class RightTriangle {
	private double leg1;
	private double leg2;
	private double hyp;
	public RightTriangle(double leg1, double b){
		this.leg1=leg1;
		leg2=b;
		hyp = getHypotenuse();
	}
	public double getHypotenuse(){
		double h = (leg1*leg1)+(leg2*leg2);
		h= Math.sqrt(h);
		return h;
	}
	public double getArea(){
		double area = (leg1*leg2)/2;
		return area;
	}
	public double getPerimeter(){
		double p = leg1+leg2+hyp;
		return p;
	}
	public String toString(){
		return leg1+","+leg2+","+hyp;
	}
			
}