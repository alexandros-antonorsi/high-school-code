import java.text.DecimalFormat;
import java.util.*;
public class flagpoles {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<String> heights = new ArrayList<String>();
		for(int i=0;i<n;i++){
			int a = input.nextInt();
			int b = input.nextInt();
			int d = input.nextInt();
			String po = "" + findHeight(a,b);
			po = add0s(po);
			heights.add(po);
			
		}
		for(String a: heights){
			System.out.println(a);
		}
	}
	public static double findHeight(int a, int b){
		double num = (double)a*b;
		num = num/(a+b);
		num = Math.round(num*1000);
		num = num/1000;
		return num;
	}
	public static String add0s(String x){
		String y = x.substring(x.indexOf(".")+1);
		while(y.length()!= 3){
			x = x + "0";
			y = y + "0";
		}
		return x;
	}
}
