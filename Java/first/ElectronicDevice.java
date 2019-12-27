
public class ElectronicDevice {
	private String type, owner;
	private double price;
	private static int count;
	public ElectronicDevice(String t, String o, double p){
		type = t;
		owner = o;
		price = p;
		count++;
	}
	public String getType(){
		return type;
	}
	public String getOwner(){
		return owner;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(int p){
		price = p;
	}
	public void setOwner(String o){
		owner = o;
	}
	public static int getDeviceNumber(){
		return count;
	}
	public String toString(){
		return type+","+owner+","+price;
	}
	
}
