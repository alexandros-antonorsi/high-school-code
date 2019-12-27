import java.util.Scanner;

public class whitespace {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = 3*input.nextInt();
		int x = 0;
		while(n>3){
			n=(n/4)*3+n%4;
			x++;
		}
		System.out.println(x);
	}
}
