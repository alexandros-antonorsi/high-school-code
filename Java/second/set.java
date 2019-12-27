import java.util.Scanner;

public class set {
	public static boolean allSame(char a, char b, char c){
		return (a==b && b==c && a==c);
	}
	public static boolean allDifferent(char a, char b, char c){
		return (a!=b && a!=c && b!=c);
	}
	public static boolean compare(String a, String b, String c){
		char[] first = a.toCharArray();
		char[] second = b.toCharArray();
		char[] third = c.toCharArray();
		for(int i=0;i<4;i++){
			if(!(allSame(first[i], second[i], third[i]) || allDifferent(first[i], second[i], third[i]))){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] cards = new String[12];
		for(int i=0;i<12;i++)
			cards[i] = input.next();
		boolean pease = false;
		for(int i=0;i<12;i++)
			for(int j=i+1;j<12;j++)
				for(int h=j+1;h<12;h++)
					if(compare(cards[i], cards[j], cards[h])){
						System.out.println((i+1)+" "+(j+1)+" "+(h+1));
						pease = true;
					}
		if(!pease)
			System.out.println("no sets");
	}
}
