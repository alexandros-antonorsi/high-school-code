/*
ID: alexand131
LANG: JAVA
TASK: dualpal
*/
import java.io.*;
import java.util.*;

public class dualpal {
	public static boolean isPalindrome(String a){
		for(int i=0;i<a.length()/2+1;i++)
			if(a.charAt(i)!=a.charAt(a.length()-1-i))
				return false;
		return true;
	}
	public static int numPals(int a){
		int count = 0;
		for(int i=2;i<=10;i++){
			if(isPalindrome(Integer.toString(a,i)))
				count++;
		}
		return count;
	}
	public static void main(String[] main) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("dualpal.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
		String line = f.readLine();
		int N = Integer.parseInt(line.substring(0, line.indexOf(" ")));
		int S = Integer.parseInt(line.substring(line.indexOf(" ")+1))+1;
		int i = 0;
		int[] nums = new int[N];
		while(i<N){
			if(numPals(S)>1){
				nums[i]=S;
				i++;	
			}
			S++;
		}
		for(int a: nums){
			out.println(a);
		}
		out.close();
	}
}