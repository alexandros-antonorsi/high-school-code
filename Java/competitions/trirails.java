import java.util.Scanner;

public class trirails {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			int x = input.nextInt();
			if(0<=x && x<5)
				System.out.println(x);
			else if(x>=5 && 15>=x)
				System.out.println(x+10);
			else
				System.out.println(x+20);
		}
	}
}
