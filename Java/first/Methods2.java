import java.util.Scanner;
public class Methods2 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Enter your three grades");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double average = average(a, b, c);
		double high = high(a, b ,c);
		String gradeReport = gradeReport(average, high, name);
		System.out.print(gradeReport);
		
	}
	
	public static double average(double a, double b, double c){
		double average = (a+b+c)/3;
		return average;
	}
	public static double high(double a, double b, double c){
		if(a>b && a>c){
			return a;
		}
		if(b>a && b>c){
			return b;
		}
		return c;
	}
	public static String gradeReport(double average, double high, String name){
		String gradeReport = (name + " your highest grade is a " + high + " and your average is a " + average);
		return gradeReport;
	}
}
