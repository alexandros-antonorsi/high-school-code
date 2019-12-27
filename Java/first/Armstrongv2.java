import java.util.Scanner;
public class Armstrongv2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			int x = input.nextInt();
			if(isArmstrong(x)){
				System.out.println("ARMSTRONG");
			}else{
				System.out.println("NOT AN ARMSTRONG");
			}
		}
	}
	public static int numOfDigits(int n){
		String s = ""+n;
		return s.length();
	}
	public static boolean isArmstrong(int n){
		int digits = numOfDigits(n);
		int sum = 0, temp = n;
		while(temp>0){
			sum = sum + (int)Math.pow(temp%10, digits);
			temp = temp/10;
		}
		if(sum==n){
			return true;
		}
		return false;
	}
	
}
