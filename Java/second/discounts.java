import java.util.Scanner;

public class discounts {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i=0;i<t;i++){
			int n = input.nextInt(); int x = input.nextInt();
			double sum = 0;
			for(int j=0;j<n;j++){
				int num = input.nextInt();
				input.next();
				sum+=input.nextDouble()*num;
			}
			System.out.println(sum*(1-(x/100.0)));
		}
	}
}
