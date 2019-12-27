
public class Sept25th {
	public static void main(String args[]){
		String a =  "fantastic";
		String b = "as";
		String removeW = removeW(a, b);
		System.out.println(removeW);
	}
	public static String removeW(String a, String b){
		int pos=a.indexOf(b);
		if(pos==-1){
			return a;
		}
		int len=b.length();
		String s = a.substring(0,pos)+a.substring(pos+len);
		return s;
	}
	
	/*public static void findPerfects(int a, int b){
		for(int i=a;i<=b;i++){
			if(classify(i).equals("perfect")){
				System.out.println(i);
			}
		}
	}*/
	
}
