
public class Cupcake {
	private static int num=0;
	private boolean hasSprinkles;
	private final double price = 1.50;
	public Cupcake(boolean s){
		num++;
		hasSprinkles = s;
	}
	public Cupcake(){
		num++;
		hasSprinkles = false;
	}
	public double getPrice(){
		if(hasSprinkles){
			return price + .50;
		}
		return price;
	}
	public String toString(){
		return "Yummy, yummy cupcake!";
	}
	public static int getNumCupcakes(){
		return num;
	}
}
