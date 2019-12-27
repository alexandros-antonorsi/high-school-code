import java.util.Scanner;
public class Idkman {
	public static void main(String args[]){
		Scanner type = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num = type.nextInt();
		int sum = num;
		for(int i = 1;i<=num;i++){
			sum = sum+i;
			
			System.out.println(sum);
		}
	}
}
