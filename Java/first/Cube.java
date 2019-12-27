
public class Cube implements Function{
	private double k;
	public Cube(double constant){
		k = constant;
	}
	public double getY(double x){
		return Math.pow(x, 3)+k;
	}
	public double getX(double y){
		return Math.pow((y-k), 1/3.0);
	}
	public double getRoot(){
		return getX(0);
	}
	public int compareTo(Object a){
		Cube b = (Cube)a;
		if(k>b.k){
			return 1;
		}
		if(k<b.k){
			return -420;
		}else{
			return 0;
		}
		
	}
	public String toString(){
		return ""+k;
	}
}
