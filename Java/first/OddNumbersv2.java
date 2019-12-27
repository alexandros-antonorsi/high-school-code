import java.util.Scanner;
public class OddNumbersv2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			int amtOfNums = input.nextInt();
			int rowNum = getRowNum(amtOfNums);
			int firstNum = getFirstNum(rowNum);
			int sum = getSum(firstNum, amtOfNums);
			System.out.println(sum);
		}
	}
	public static int getRowNum(int amtOfNums){
		return (amtOfNums+1)/2;
	}
	public static int getFirstNum(int rowNum){
		int numToAdd = 2;
		int firstNum = 1;
		for(int i=0;i<rowNum-1;i++){
			firstNum += numToAdd;
			numToAdd += 4;
		}
		return firstNum;
	}
	public static int getSum(int firstNum, int amtOfNums){
		int[] line = new int[amtOfNums];
		for(int i=0;i<amtOfNums;i++){
			line[i] = firstNum;
			firstNum += 2;
		}
		int sum = 0;
		for(int i=0;i<3;i++){
			sum += line[(amtOfNums-i)-1];
		}
		return sum;
	}
	
}

