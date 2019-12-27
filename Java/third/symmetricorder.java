import java.util.Scanner;

public class symmetricorder {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.next());
		int a = 1;
		while(n!=0){
			String[] arr = new String[n];
			for(int i=0;i<n;i++){
				arr[i] = input.next();
			}
			String[] fin = new String[n];
			for(int i=0;i<n;i+=2){
				fin[i/2]=arr[i];
				if(i+1<n)
					fin[n-1-i/2]=arr[i+1];
			}
			System.out.println("SET "+a);
			for(String x: fin)
				System.out.println(x);
			n = Integer.parseInt(input.next());
			a++;
		}
	}
}
