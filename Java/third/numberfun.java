import java.util.Scanner;

public class numberfun {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			double a = Double.parseDouble(input.next()); double b = Double.parseDouble(input.next()); double c = Double.parseDouble(input.next());
			if(a+b==c || a-b==c || a*b==c || a/b==c || b-a==c || b/a==c){
				System.out.println("possible");
			}else{
				System.out.println("impossible");
			}
		}
	}
}
