import java.util.Scanner;
public class Methods {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num = input.nextInt();
		int d = dogYears(num);
		System.out.println(d);
		calcHours(num);
		System.out.println(funny(num));
	}
	
	public static int dogYears(int n){
		int dog =n*7;
		return dog;
	}
	
	public static void calcHours(int sec){
		int h = sec/3600;
		System.out.println(h);
	}
	
	public static int funny(int a){
		int d = a%10;
		return d*111;
	}
}

