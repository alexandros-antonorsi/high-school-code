import java.util.Scanner;
public class HomeworkOct12th {
	public static void main(String[] args){
		average();
		multiplication();
		digits(694201337);
		palindrome("TACOCAT");
		array1();
		array2();
		array3();
	}
	public static void average(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grades one by one. When you have no more grades, enter -1");
		double sum = 0;
		double counter = 0;
		double grade = input.nextDouble();
		while(grade!=-1){
			sum = sum+grade;
			counter++;
			System.out.println("Enter your next grade");
			grade = input.nextDouble();
		}
		System.out.println("Your average is " + sum/counter);
	}
	public static void multiplication(){
		for(int i=1;i<=12;i++){
			for(int j=1;j<=12;j++){
				System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	public static void digits(int n){
		int odd=0, even=0, zero=0;
		while(n>0){
			int digit = n%10;
			if(digit==0){
				zero++;
			}
			else if(digit%2==0){
				even++;
			}else{
				odd++;
			}
			n=n/10;
		}
		System.out.println("There are "+odd+" odd digits, "+even+" even digits, and "+zero+" zero digits in your number");
	}
	public static void palindrome(String s){
		String back = "";
		for(int i=s.length();i>0;i--){
			back = back+s.substring(i-1, i);
		}
		if(back.equals(s)){
			System.out.println("The word is a palindrome");
		}else{
			System.out.println("The word is not a palindrome");
		}
	}
	public static void array1(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 of your grades");
		double sum = 0;
		double grade = input.nextDouble();
		double[] array = new double[10];
		for(int i=0;i<10;i++){
			array[i]=grade;
			sum = sum+grade;
			System.out.println("Enter your next grade.");
			grade = input.nextDouble();
		}
		for(int i=9;i>=0;i--){
			System.out.println(array[i]);
		}
		double avg = sum/10;
		System.out.println("Your average is "+avg);
	}
	public static void array2(){
		double[] array = new double[50];
		for(int i=0;i<50;i++){
			array[i]= Math.sqrt(i);
			System.out.print(array[i]+"\t");
		}
		
	}
	public static void array3(){
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		for(int i=0;i<16;i=i+2){
			System.out.println(nums[i]+nums[i+1]+"\t");
		}
	}
	
}