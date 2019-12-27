/*
ID: alexand131
LANG: JAVA
TASK: crypt1
*/
import java.io.*;
import java.util.*;

public class crypt1 {
	public static boolean inDigits(int num, String digits){//returns true if each digit of num is in the String digits
		String newNum = Integer.toString(num);
		for(int i=0;i<newNum.length();i++){
			if(!digits.contains(newNum.substring(i,i+1)))
				return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("crypt1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crypt1.out")));
		int N = Integer.parseInt(f.readLine());
		String digs = f.readLine();
		StringTokenizer st = new StringTokenizer(digs);
		int[] digits = new int[N];
		for(int i=0;i<N;i++)
			digits[i]=Integer.parseInt(st.nextToken());
		int count = 0;
		for(int a: digits)
			for(int b: digits)
				for(int c: digits)
					for(int d: digits){
						top:
						for(int e: digits){
							int product1 = e*(a*100+b*10+c);
							int product2 = d*(a*100+b*10+c);
							if(product1>999 || !inDigits(product1, digs))//partial product 1 passes tests
								continue;
							else if(product2>999 || !inDigits(product2, digs))//partial product 2 passes tests
								continue;
							else if(product1+(product2*10)>9999)
								continue;
							else{//meets the digit # requirement
								if(!inDigits(product1+(product2*10), digs))
									continue top;
								//if it makes it to this point, it has the correct # of digits and each digit of the product and partial is in the list, so it works
								count++;
							}
						}
		}
		out.println(count);
		out.close();
	}
}