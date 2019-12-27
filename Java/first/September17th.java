
public class September17th {
	public static void main(String args[]){
		int a = 12;
		int b = 4;
		int n = -8;
		int c = -12;
		int d = 17;
		String s = "practice";
		String st = "s";
		String str = "no";
		boolean method1 = method1(a,b);
		System.out.println(method1);
		String method2 = method2(n, s);
		System.out.println(method2);
		method3(st, c, d);
		double method4 = method4();
		System.out.println(method4);
		String front22 = front22(str);
		System.out.println(front22);
	}
	public static boolean method1(int a, int b){
		if(a<0 && b>0){
			return true;
		}
		if(b<0 && a>0){
			return true;
		}
		return false;
	}
	public static String method2(int n, String s){
		if(n<0){
			return "the String isn't big enough";
		}
		if(n>s.length()){
			return "the String isn't big enough";
		}
		return s.substring(s.length()-n);
	}
	public static void method3(String st, int c, int d){
		if(c<0){
			System.out.println("Not possible");
		}else{
			if(d>st.length()){
				System.out.println("Not possible");
			}else{
					System.out.println(st.substring(c,d));
			}
		}
	}
	public static double method4(){
		double x = (Math.random());
		return x;
	}
	public static String front22(String str){
		String front;
		if(str.length()<2){
			front = str;
		}else{
			front = str.substring(0,2);
		}
		return front + str + front;
		
	}
}
