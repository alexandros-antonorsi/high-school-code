/*
ID: alexand131
LANG: JAVA
TASK: palsquare
*/
import java.io.*;
import java.util.*;

public class palsquare {
	public static void main(String[] main) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("palsquare.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
		int B = Integer.parseInt(f.readLine());
		ArrayList<String[]> pals = new ArrayList<String[]>();
		for(int i=1;i<=300;i++){
			int sq = (int)Math.pow(i, 2);
			if(isPalindrome(Integer.toString(sq, B))){
				String[] nums = new String[2];
				nums[0]=""+(Integer.toString(i, B)).toUpperCase();
				nums[1]=""+(Integer.toString(sq, B)).toUpperCase();
				pals.add(nums);
			}
		}
		for(String[] a: pals){
			out.println(a[0]+" "+a[1]);
		}
		out.close();
	}
	public static boolean isPalindrome(String a){
		for(int i=0;i<a.length()/2+1;i++)
			if(a.charAt(i)!=a.charAt(a.length()-1-i))
				return false;
		return true;
	}
}
