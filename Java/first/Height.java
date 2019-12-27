import java.util.Scanner;
public class Height {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		int height = input.nextInt();
		int feet = height/12;
		int inches = height%12;
		System.out.println("You are "+feet+"'"+inches+"\".");
				
	}
}
