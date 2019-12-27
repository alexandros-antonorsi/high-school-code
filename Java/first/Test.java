import java.util.Scanner;
public class Test {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String looped = input.nextLine();
		System.out.println("Enter a number");
		int n = input.nextInt();
		loopy(looped, n);
	}
	public static void loopy(String looped, int n){
		int letter = 0;
		for(int d=0;d<looped.length();d++){
			for(int i=0;i<n;i++){
				System.out.print(looped.substring(letter,letter+1));
			}
			letter++;
		}
		
	}
}
