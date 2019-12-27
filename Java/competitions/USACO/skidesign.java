/*
ID: alexand131
LANG: JAVA
TASK: skidesign
*/
import java.io.*;
import java.util.*;

public class skidesign {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("skidesign.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("skidesign.out")));
		int N = Integer.parseInt(f.readLine());
		List<Integer> elevations = new ArrayList<Integer>();
		for(int i=0;i<N;i++){
			elevations.add(Integer.parseInt(f.readLine()));
		}
		Collections.sort(elevations);
		int totalcost = 0;
		boolean even = N%2==0;
		int a = even?N/2:N/2+1;
		ArrayList<Integer> newHeights = new ArrayList<Integer>();
		for(int i=0;i<a;i++){
			int cost = 0;
			if(elevations.get(N-(1+i))-elevations.get(i)>17){//diff between ith and N-ith terms(opposite sides of array) >17
				int num1 = elevations.get(i);
				int num2 = elevations.get(N-(1+i));
				while(num2-num1>17){
					num1++;//increment one
					if(num2-num1>17)//diff still greater
						num2--;//so decrement the other
				}
				newHeights.add(num1);
				newHeights.add(num2);
//total cost for this change is the sum of the squares of the differences in heights from the new to the original heights
				cost = (int)Math.pow(num1-elevations.get(i), 2) + (int)Math.pow(elevations.get(N-(1+i))-num2, 2);
			}
			totalcost +=cost;
		}
		//22946
		Collections.sort(newHeights);
		System.out.println(newHeights);
		out.println(totalcost);
		out.close();
	}
}
