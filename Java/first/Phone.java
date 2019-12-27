
public class Phone extends ElectronicDevice{
	private String brand;
	private double size;
	private boolean isON;
	public Phone(String o, double p, String b, double s){
		super("phone", o, p);
		brand = b;
		size = s;
	}
	public String getBrand(){
		return brand;
	}
	public double getSize(){
		return size;
	}
	public String toString(){
		return super.toString()+","+brand+","+size;
	}
	public void togglePower(){
		isON = !isON;
	}

}
