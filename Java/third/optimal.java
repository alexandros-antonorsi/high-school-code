import java.math.BigInteger;
import java.util.Scanner;

public class optimal {
	public static boolean works;
	public static String original;
	public static boolean isPrime(int x){
		for(int i=2;i*i<=x;i++){
			if(x%i==0)
				return false;
		}
		return true;
	}
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
		if(!works){
			int n = str.length();
			if (n == 0 && !prefix.equals(original)){
				if(prefix.length()==Integer.toString(Integer.parseInt(prefix)).length()){
					if(isPrime(Integer.parseInt(prefix))){
						works=true;
					}
				}
			}
	    	else {
	    		for (int i = 0; i < n; i++)
	    			permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    	}
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			works = false;
			int x = input.nextInt();
			if(x==10000000 || !isPrime(x)){
				System.out.println("Battle #"+(i+1)+": Oh no, the autobots are doomed!");
				continue;
			}
			String num = Integer.toString(x);
			original = Integer.toString(x);
			permutation(num);
			if(works)
				System.out.println("Battle #"+(i+1)+": Autobots, roll out!");
			else
				System.out.println("Battle #"+(i+1)+": Oh no, the autobots are doomed!");
		}
	}
}
