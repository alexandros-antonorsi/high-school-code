public class PrivateSchool extends School{
	private int price;
	public PrivateSchool(String n, String a, String p, String pn, int students, int staff, int cost){
		//must be done first
		super(n,a,p,pn,students,staff);
		price = cost;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int p){
		price=p;
	}
	//Ex. of overwriting
	public String toString(){
		return super.toString()+","+price;
	}
}
