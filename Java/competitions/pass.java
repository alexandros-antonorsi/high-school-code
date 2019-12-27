import java.util.ArrayList;
import java.util.Scanner;

public class pass {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<String> kappa = new ArrayList<String>();
		for(int i=0;i<n;i++){
			int a = input.nextInt();
			if(a>=6){
				kappa.add("PASS");
			}else{
				kappa.add("FAIL");
			}
		}
		for(String b: kappa){
			System.out.println(b);
		}
	}
}
