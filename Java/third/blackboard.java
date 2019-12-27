import java.math.BigInteger;
import java.util.Scanner;

public class blackboard {
	

	/*public static boolean isPrime(int n) {
		if(n==2)
			return true;
		if(n%2==0 || n==1 || n==0) 
			return false;
	    for(int i=3;i*i<n;i+=2){
	    	if(n%i==0)
	    		return false;
	    }
	    return true;
	}
	public static boolean isPrime(long n) {
		if(n==2)
			return true;
		if(n%2==0 || n==1 || n==0) 
			return false;
	    for(long i=3;i*i<n;i+=2){
	    	if(n%i==0)
	    		return false;
	    }
	    return true;
	}*/
	public static boolean isPrime(long x){
		BigInteger y = new BigInteger(x+"");
		if(y.isProbablePrime(4))
			return true;
		return false;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		for(int i=0;i<n;i++){
			String x = input.nextLine();
			
			//hex
			int l =0;
			if(x.contains("A") || x.contains("B") || x.contains("C") || x.contains("D") || x.contains("E") || x.contains("F")){
				long hex = Long.parseLong(x, 16);
				if(isPrime(hex)){
					System.out.println("1/1");
					continue;
				}
				else{
					System.out.println("0/1");
					continue;
				}
			}else if(x.contains("8") || x.contains("9")){//hex or denary
				long hex = Long.parseLong(x, 16);
				long denary = Long.parseLong(x, 10);
				if(isPrime(hex))
					l++;
				if(isPrime(denary))
					l++;
				if(l==0)
					System.out.println("0/1");
				else if(l==2)
					System.out.println("1/1");
				else
					System.out.println("1/2");

			}else if(x.contains("2") || x.contains("3") || x.contains("4") || x.contains("5") || x.contains("6") || x.contains("7")){//hex, denary, or octal
				long hex = Long.parseLong(x, 16);
				long denary = Long.parseLong(x, 10);
				long octal = Long.parseLong(x, 8);
				if(isPrime(hex))
					l++;
				if(isPrime(denary))
					l++;
				if(isPrime(octal))
					l++;
				if(l==0)
					System.out.println("0/1");
				else if(l==3)
					System.out.println("1/1");
				else
					System.out.println(""+l+"/3");
			}else{
				long hex = Long.parseLong(x, 16);	
				long denary = Long.parseLong(x, 10);
				long octal = Long.parseLong(x, 8);
				long binary = Long.parseLong(x, 2);
				if(isPrime(hex))
					l++;
				if(isPrime(denary))
					l++;
				if(isPrime(octal))
					l++;
				if(isPrime(binary))
					l++;
				if(l==0)
					System.out.println("0/1");
				else if(l==2)
					System.out.println("1/2");
				else if(l==4)
					System.out.println("1/1");
				else
					System.out.println(""+l+"/4");
			}
			
		}
	}
}
