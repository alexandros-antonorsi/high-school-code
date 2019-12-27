import java.util.Scanner;
public class MethodsGalore {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = input.nextInt();
		System.out.println("Enter a number");
		int num2 = input.nextInt();
		boolean diff30 = diff30(num1, num2);
		System.out.println(diff30);
		System.out.println("Enter 3 doubles");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		boolean equal2 = equal2(a, b ,c);
		System.out.println(equal2);
		System.out.println("Enter a number");
		int n = input.nextInt();
		input.nextLine();
		System.out.println("Enter a string");
		String str = input.nextLine();
		String missingChar = missingChar(str, n);
		System.out.println(missingChar);
		System.out.println("Enter a string");
		String back = input.nextLine();
		String backString = backString(back);
		System.out.println(backString);
		System.out.println("Enter a string");
		String looped = input.nextLine();
		System.out.println("Enter a number");
		int looper = input.nextInt();
		loopy(looped, looper);
		
	}
	public static boolean diff30(int num1, int num2){
		if(Math.abs(num1-num2)==30){
			return true;
		}
		if(Math.abs(num2-num1)==30){
			return true;
		}
		return false;
	}
	public static boolean equal2(double a, double b, double c){
		if(a==b && a!=c){
			return true;
		}
		if(b==c && b!=a){
			return true;
		}
		if(c==a && c!=b){
			return true;
		}
		return false;
	}
	public static String missingChar(String str, int n){
		if(n>str.length()){
			return str;
		}
		String first = str.substring(0,n-1);
		String second = str.substring(n,str.length());
		return first+second;
	}
	public static String backString(String back){
		String last;
		if(back.length()<3){
			last = back;
		}else{
			last = back.substring(back.length()-3,back.length());
		}
		return last+last+last;
		
	}
	public static void loopy(String looped, int looper){
		int letter = 0;
		for(int d=0;d<looped.length();d++){
			for(int i=0;i<looper;i++){
				System.out.print(looped.substring(letter,letter+1));
			}
			letter++;
		}
		
	}
}
