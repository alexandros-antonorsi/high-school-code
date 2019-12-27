import java.util.Scanner;
public class FridayStuff {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Mary said");
		System.out.println("\"Susie said\"");
		System.out.println("enter 4 numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		double avg = (a+b+c+d)/4.0;
		System.out.println(avg);
		input.nextLine();
		int k=1;
		System.out.println("Enter a word");
		String w= input.nextLine();
		int n = w.length();
		for(int i=1;i<=n;i++){
			for(int f=1;f<=k;f++){
				System.out.print(w.substring(i-1, i));
			}
			System.out.println();
			k++;
		}
		System.out.println("Enter a word");
		String kappa = input.nextLine();
	}
	public static void time3(String kappa){
		int i;
		for(i=0;i<kappa.length();i=i+3){
			System.out.println(kappa.substring(i,i+3));
		}
		System.out.println(kappa.substring(i));
	}

}
