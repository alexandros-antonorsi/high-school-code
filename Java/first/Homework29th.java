public class Homework29th {
 	public static void main (String args[]) {
 		int a = 6;
 		int b = 1234;
 		int biggestLoser = biggestLoser(a,b);
 		System.out.println(biggestLoser);
 		String d = "sundae";
 		int e = 2;
 		String addPounds = addPounds(d,e);
 		System.out.println(addPounds);
 	}
 	
	public static int biggestLoser(int a, int b) {
		if(a<1000 || b<1000) {
			if(a<b)
				return a;
			else if(b<a)
				return b;
			else
				return a;
		}
		int aTh = a/1000;
		int bTh = b/1000;
		int aH = a/100%10;
		int bH = b/100%10;
		int aT = a/10%10;
		int bT = b/10%10;
		int aO = a%10;
		int bO = b%10;
		int smallTh = 0;
		int smallH = 0; 
		int smallT = 0;
		int smallO=0;
		if(aTh<bTh)
			smallTh = aTh;
		else if(bTh<aTh)
			smallTh = bTh;
		
		if(aH<bH)
			smallH = aH;
		else if(bH<aH)
			smallH = bH;
		
		if(aT<bT)
			smallT = aT;
		else if(bT<aT)
			smallT = bT;
		
		if(aO<bO)
			smallO = aO;
		else if(bO<aO)
			smallO = bO;
		
		return (smallTh*1000 + smallH*100 + smallT*10 + smallO);
	}
 
	public static String addPounds(String a, int n) {
		int len = a.length();
		String s = "";
		for(int i = 1; i<=len; i++) {
			s = s + a.substring(i-1,i);
			if(i%n==0)
				s = s + "#";
		}
		return s;
	}
 
}