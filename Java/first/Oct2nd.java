
public class Oct2nd {
	public static void main(String args[]){
		int a = 9191;
		int b = 1919;
		int bigLoser2 = bigLoser2(a, b);
		System.out.println(bigLoser2);
		String s = "breadchicken";
		String filling = filling(s);
		System.out.println(filling);
	}
	public static int bigLoser2(int a, int b){
		int num = 0;
		int mult = 1;
		while(a>0){
			int d=a%10;
			int e=b%10;
			a=a/10;
			b=b/10;
			int min = Math.min(d, e);
			num = num+min*mult;
			mult = mult*10;
		}
		return num;
	}
	public static String filling(String s){
		int breadPos = s.indexOf("bread");
		String temp = s;
		String front;
		if(breadPos>-1){
			temp = temp.substring(breadPos+1);
			front = s.substring(0,breadPos+1);
		}else
			return "";
		int breadPos2= temp.indexOf("bread");
		if(breadPos2>-1){
			return s.substring(breadPos+5,breadPos2+front.length());
		}
		return "";
	}
}
