import java.util.Scanner;
public class Thursday {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER A 3 DIGIT NUMBER");
		int num = input.nextInt();
		int c = num%10;
		int a = num/100;
		int b = (num%100-c)/10;
		if(a==0){
			System.out.println("That isn't a 3 digit number");
		}else{
		System.out.println(a + " " + b + " " + c);
		}
	}
}