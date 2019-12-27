import java.util.Scanner;
public class MoreMethods {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int method1 = input.nextInt();
		int sumOfSquares = sumOfSquares(method1);
		System.out.println(sumOfSquares);
		System.out.println("Enter another number");
		int method2 = input.nextInt();
		input.nextLine();
		int biggestDigit = biggestDigit(method2);
		System.out.println(biggestDigit);
		System.out.println("Enter a word");
		String word = input.nextLine();
		fiveOrMore(word);
		System.out.println("Enter another word");
		String method4 = input.nextLine();
		twoAtATime(method4);
	}
	
	public static int sumOfSquares(int method1){
		if(method1<=0){
			return 0;
		}
		int b = 0;
		for(int i=1; i<=method1; i++){
			b = b + (i*i);
		}
		return b;
	}
	
	public static int biggestDigit(int method2){
		int first = method2/100;
		int third = method2%10;
		int second = ((method2%100)-third)/10;	
		if(method2<=0){
			return -1;
		}
		if((method2/100)==0 || (method2/100)>9){
			return -1;
		}
		if(first>=second && first >=third){
			return first;
		}
		if(second>=third && second >=first){
			return second;
		}
		return third;
		
	}
	
	public static void fiveOrMore(String word){
		int length = word.length();
		if(length<5){
			System.out.println(word);
		}else{
		for(int i = 1;i<=length;i++){
			System.out.println(word.substring(i-1, i));
		}
		}
	}
	
	public static void twoAtATime(String method4){
		if(method4.length()%2!=0){
			System.out.println("I can't print 2 at a time");
		}else{
		for(int i = 1;i<=method4.length();i=i+2){
			System.out.println(method4.substring(i-1, i+1));
		}
		}
	}
}
