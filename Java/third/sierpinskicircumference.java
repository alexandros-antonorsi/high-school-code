import java.io.IOException;
import java.util.Scanner;

public class sierpinskicircumference{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int count = 1;
		while(input.hasNext()){
			int n = input.nextInt();
			//double c = Math.floor(3*(Math.pow(1.5, n)));
			int digits = (int)(Math.floor(Math.log10(3)+n*Math.log10(1.5)) + 1);
			System.out.println("Case "+count+": "+digits);
			count++;
		}
	}
}
