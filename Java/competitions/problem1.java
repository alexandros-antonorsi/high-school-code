import java.util.*;

public class problem1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		for(int i=0;i<n;i++){
			String equation = input.nextLine();
			int firstSpace = equation.indexOf(" ");
			String temp = equation.substring(equation.indexOf(" ")+1);
			int secondSpace = temp.indexOf(" ") + 1 + firstSpace;
			
			if(equation.substring(0, firstSpace).equals("X")){
				int num1 = Integer.parseInt(equation.substring(firstSpace+1,secondSpace));
				int num2 = Integer.parseInt(equation.substring(secondSpace+1));
				System.out.println(num2-num1);
			}
			
			else if(equation.substring(firstSpace+1,secondSpace).equals("X")){
				int num1 = Integer.parseInt(equation.substring(0,firstSpace));
				int num2 = Integer.parseInt(equation.substring(secondSpace+1));
				System.out.println(num2-num1);
			}
			
			else if(equation.substring(secondSpace+1).equals("X")){
				int num1 = Integer.parseInt(equation.substring(0,firstSpace));
				int num2 = Integer.parseInt(equation.substring(firstSpace+1, secondSpace));
				System.out.println(num1+num2);
			}
		}
	}
}
