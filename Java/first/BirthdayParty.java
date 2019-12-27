
public class BirthdayParty {
	public static void main(String[] args){
		Cupcake a = new Cupcake();
		Vanilla b = new Vanilla(true);
		Chocolate c = new Chocolate();
		System.out.println("How many cupcakes are there?");
		System.out.println(Cupcake.getNumCupcakes());
		System.out.println("MAKE SURE YOU PAY ATTENTION TO THE COMMENTS IN THE CLASSES");
		System.out.println("MAKE SURE YOU PAY ATTENTION TO HOW I MADE THE ARRAY BELOW");
		Cupcake[] list = {new Chocolate(), new Vanilla(false), new Chocolate(), new Chocolate(), a, b, c};
		System.out.println("Now how many cupcakes are there?");
		System.out.println(Cupcake.getNumCupcakes());
		double sum = 0;
		for(Cupcake cupcake: list){
			sum = sum+cupcake.getPrice();
			System.out.println(cupcake);
		}
		System.out.println("The total cost for all of the cupcakes is $"+sum);
	}
}
