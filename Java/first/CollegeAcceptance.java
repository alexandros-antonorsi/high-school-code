import java.util.Scanner;
public class CollegeAcceptance {
	public static void main(String[] args){
		System.out.println(containsA("cat"));
		System.out.println(scholarshipAmt());
		System.out.println(findCost());
		gettingAccepted();
	}
	public static boolean containsA(String s){
		for(int i=1;i<=s.length();i++){
			if(s.substring(i-1,i).equals("a")){
				return true;
			}
		}
		return false;
	}
	public static int scholarshipAmt(){
		int x = (int)(Math.random()*29001)+1000;
		if(x%1000==0){
			return x;
		}
		
		return 100;
	}
	public static int findCost(){
		int x = (int)(Math.random()*101)+200;
		int y = (int)(Math.random()*501)+1000;
		int sum=0;
		for(int i=x;i<=y;i++){
			sum=sum+i;
		}
		return sum;
	}
	public static void gettingAccepted(){
		Scanner input = new Scanner(System.in);
		System.out.println("Which college would you like to attend?");
		String college = input.nextLine();
		if(containsA(college)&&college.length()<10){
			System.out.println("You will definitely get in");
		}
		else if(containsA(college)==false&&college.length()<10){
			System.out.println("Don't waste your money applying there");
		}
		else{
			System.out.println("You have a small chance of getting in");
		}
		System.out.println("It would cost $"+ findCost() +" to get in to "+ college +".");
		final int luck = 5;
		System.out.println("Enter a number from 1-10");
		if(input.nextInt()==luck){
			System.out.println("You got into "+ college+ " and you got a scholarship of $"+ scholarshipAmt());
		}else{
			System.out.println("You did not get a scholarship");
		}
	}
}
