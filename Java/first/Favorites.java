import java.util.Scanner;
public class Favorites {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("What is your favorite fruit?");
		String fruit = input.nextLine();
		System.out.println("Favorite vegetable?");
		String vegetable = input.nextLine();
		String halfF = fruit.substring(0, (fruit.length()/2));
		String halfV = vegetable.substring(vegetable.length()/2, vegetable.length());
		System.out.print("I bet you'd like to eat "+halfF+halfV+". Would you?");
	}
}
