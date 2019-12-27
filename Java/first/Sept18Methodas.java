
public class Sept18Methodas {
	public static void main(String args[]){
		int n = 420;
		int first = first(n);
		int middle = middle(n);
		int last = last(n);
		System.out.println(first);
		System.out.println(middle);
		System.out.println(last);
		String s = "candy";
		candy(s);
		int mid3=mid3();
		System.out.println(mid3);
		sumDig();
		String removeChar = removeChar(s);
		System.out.println(removeChar);
	}
	public static int first(int n){
		return n/100;
	}
	public static int middle(int n){
		return (n/10)%10;
	}
	public static int last(int n){
		return (n%100)%10;
	}
	public static void candy(String s){
		int x = s.length();
		for(int j =0; j<s.length(); j++){
			for(int i =0; i<x; i++){
				System.out.print(s.substring(j, j+1));
				
			}
			x--;
			System.out.println();
		}
		
	}
	public static int mid3(){
		int c=0;
		int x=111;
		int m = middle(x);
		while(m%3!=0){
			c++;
			x = (int)(Math.random()*401)+100;
			m=middle(x);
		}
		if(c>1){
			System.out.println("it took "+c+" tries to get this number");
		}else{
		System.out.println("it took 1 try to get this number");
		}
		return x;
	}
	public static void sumDig(){
		int a = mid3();
		System.out.println("The number is "+a);
		int first = first(a);
		int middle = middle(a);
		int last = last(a);
		int sum = first+last+middle;
		System.out.println("The sum of the digits is "+sum);
		
		
	}
	public static String removeChar(String s){
		int x = (int)(Math.random()*s.length());
		String a = s.substring(0,x);
		String b = s.substring(x+1);
		return a+b;
		
	}
}
