import java.util.Scanner;
public class Thursday2 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER A 4-DIGIT NUMBER");
		int num = input.nextInt();
		int d = num%10;
		int c = (num/10)%10;
		int b = (num/100)%10;
		int a = num/1000;
		if(d==0){
			System.out.println("That isn't a 4-digit number");
		}
		int back = d*1000  + c*100 + b*10 + a;
		System.out.println(back);
		System.out.println("The difference between " + num + " and " + back + " is " + (num-back));
	}
}
