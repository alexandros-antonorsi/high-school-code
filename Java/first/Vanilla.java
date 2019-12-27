
public class Vanilla extends Cupcake implements Comparable{
	private boolean hasSprinkles;
	public Vanilla(boolean s){
		hasSprinkles = s;
	}
	public double getPrice(){
		if(hasSprinkles){
			return super.getPrice()+.75;
		}
		return super.getPrice();
	}
	public String toString(){
		if(hasSprinkles){
			return "Yummy, yummy, vanilla cupcake!";
		}
		return super.toString();
	}
	public int compareTo(Object other){
		Cupcake c = (Cupcake)other;
		if(getPrice()>c.getPrice()){
			return 4;
		}
		if(getPrice()<c.getPrice()){
			return -84;
		}
		return 0;
	}
	
}
