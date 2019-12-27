
public class Sept24th {
	public static void main(String args[]){
		int a = 13;
		int b = 2;
		boolean isFactor = isFactor(a, b);
		System.out.println(isFactor);
		int n = 16;
		int numFactors = numFactors(n);
		System.out.println(numFactors);
		int x = 1;
		boolean isPrime = isPrime(x);
		System.out.println(isPrime);
		int y = 0;
		int primeFactor = primeFactor(y);
		System.out.println(primeFactor);
		int z = 8;
		String classify = classify(z);
		System.out.println(classify);
	}
	public static boolean isFactor(int a, int b){
		if(a%b==0){
			return true;
		}
		return false;
	}
	public static int numFactors(int n){
		int a=1;
		int factors = 0;
		while(a<=n){
			if(n%a==0){
				factors++;
			}
			a++;
		}
		return factors;
	}
	public static boolean isPrime(int x){
		if(numFactors(x)==2){
			return true;
		}
		return false;
	}
	public static int primeFactor(int y){
		int a = y;
		while(a>=1){
			if(y%a==0 && isPrime(a)==true){
				return a;
			}
			a--;
		}
		return a;
	}
	public static String classify(int z){
		int a = 1;
		int sum = 0;
		while(a<z){
			if(z%a==0){
				sum = sum + a;
			}
			a++;
		}
		if(sum>z){
			return "abundant";
		}
		if(sum<z){
			return "deficient";
		}
		return "perfect";
	}
}
