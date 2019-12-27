import java.util.Scanner;
public class StringMethods {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in); 
		for(int i=0; i<3; i++){ 
			String a = kb.nextLine(); 
			System.out.println(mutation(a));
		} 
		for(int i=0; i<3; i++){ 
			String a = kb.nextLine();
			System.out.println(mutation2(a));
		}
		for(int i=0; i<3; i++){ 
			String a = kb.nextLine();
			String b = kb.nextLine(); 
			System.out.println(mutation(a,b));
		} 
	}
	public static String mutation(String a){
		String temp = "";
		for(int i=a.length();i>0;i--){
			temp = temp+a.substring(i-1);
		}
		return temp;
	}
	public static String mutation2(String a){
		int len = a.length();
		if(len<=4){
			return "";
		}
		String temp = "";
		if(len%2==1){
			temp = temp+a.substring(1, len/2);
			temp = temp+a.substring((len/2)+1, len-1);
			return temp;
		}
		temp = temp+a.substring(1, (len/2)-1);
		temp = temp+a.substring((len/2)+1, len-1);
		return temp;
	}
	public static String mutation(String a, String b){
		String temp = a;
		String result = "";
		int pos = a.indexOf("fzgh");
		while(pos>-1){
			result = result+temp.substring(0,pos)+b;
			temp = temp.substring(pos+4);
			pos = temp.indexOf("fzgh");
		}
		return result+temp;
	}
}
