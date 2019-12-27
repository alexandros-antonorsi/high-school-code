
public class Weekend {
	public static void main(String args[]){
		String s = "cat cat cat";
		int n = 8;
		funnyString(s, n);
		String st = "turn off the vibrator";
		String twoChars = twoChars(st);
		System.out.println();
		System.out.println(twoChars);
		prod();
	}
	public static void funnyString(String s, int n){
		String front;
		if(n>s.length()){
			front = s;
		}else{
			front = s.substring(0,n);
		}
		for(int i = front.length(); i>0; i--){
			System.out.print(front.substring(i-1, i));
		}
		
	}
	public static String twoChars(String st){
		String a = "";
		for(int i=0;i<st.length();i++){
			a = a+(st.substring(i,i+1))+(st.substring(i,i+1));
		}
		return a;
	}
	public static void prod(){
		int x = (int)(Math.random()*5)+5;
		int fac = 1;
		int n = x-1;
		for(int i=1;i<n;i++){
			fac = fac*(i+1);
		}
		System.out.println(x);
		System.out.println(n+"! is "+fac);
	}
}
