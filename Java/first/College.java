import java.util.Scanner;
public class College {
	public static void main(String args[]){;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name?");
		String name = input.nextLine();
		System.out.println("What year will you graduate in?");
		int year = input.nextInt();
		System.out.println(name + ", you will graduate in " + (year - 2015) + " years.");
	}
}
