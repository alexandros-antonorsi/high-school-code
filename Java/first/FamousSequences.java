
public class FamousSequences {
	public static void main(String args[]){
		int n = 15;
		hailstone(n);
		int m=11;
		double calculatePi = calculatePi(m);
		System.out.println(calculatePi);
		int l = 8;
		fibonacci(l);
	}
	public static void hailstone(int n){
		if(n<1){
			
		}else{
			while(n!=1){
				System.out.print(n+"\t");
				if(n%2==0){
					n=n/2;
				}else{
					n=n*3+1;
				}
				
			}
			System.out.println(n+"\t");
		}
	}
	public static double calculatePi(int m){
		int count = 0;
		double calc = 0;
		int denominator = 1;
		for(int i = 1; i<=m;i++){
			if(count%2==0){
				calc = calc + ((double)4/denominator);
				count++;
				denominator = denominator+2;
			}else{
				calc = calc - ((double)4/denominator);
				count++;
				denominator = denominator+2;
			}
		}
		return calc;
	}
	public static void fibonacci(int l){
		int n1 = 1, n2 = 1, temp;
		if(l<1){
			System.out.println("error");
		}else{
			for(int i = 1; i<=l-1;i++){
				System.out.print(n1+", ");
				temp = n2;
				n2 = n1+n2;
				n1=temp;
			}
			System.out.println(n1);
		}
		
	}
}
