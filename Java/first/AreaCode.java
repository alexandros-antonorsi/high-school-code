import java.util.Scanner;
public class AreaCode {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("What is your full phone number?");
		String phone = input.nextLine();
		String area = phone.substring(1,4);
		System.out.println(name+", your area code is "+area);
	}
}
