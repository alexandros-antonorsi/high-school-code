import java.util.Scanner;
public class Emirpv2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String s = "";
		for(int i=0;i<n;i++){
			int min = input.nextInt();
			int max = input.nextInt();
			for(int j=min;j<=max;j++){
				int reverse = reverseNum(j);
				if(j!=reverse){
					if(isPrime(j) && isPrime(reverse)){
						s = s + j + " ";
					}
				}
				
			}
			if(s.equals("")){
				s = "NONE ";
			}
			System.out.println(s.substring(0, s.length()-1));
			s = "";
		}
	}
	public static int reverseNum(int n){
		int reverse = 0;
		while(n>0){
			reverse = reverse*10;
			reverse = reverse + n%10;
			n = n/10;
		}
		return reverse;
	}
	public static boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
}
