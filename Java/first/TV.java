
public class TV extends ElectronicDevice{
	private String kind;
	private double size;
	private boolean isON;
	public TV(String o, double p, String k, double s, boolean i){
		super("TV", o, p);
		kind = k;
		size = s;
		isON = i;
	}
	public String getKind(){
		return kind;
	}
	public double getSize(){
		return size;
	}
	public boolean getIsON(){
		return isON;
	}
	public void togglePower(){
		isON= !isON;
	}
	public String toString(){
		return super.toString()+","+kind+","+size+","+isON;
	}
	
	
}
