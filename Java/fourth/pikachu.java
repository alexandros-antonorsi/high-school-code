import java.util.Scanner;

public class pikachu {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		char[] word1 = input.nextLine().toCharArray();
		char[] word2 = input.nextLine().toCharArray();
		int d = 0;
		for(int i=0;i<n;i++){
			int diff = (int)word2[i]-(int)word1[i];
			if(diff<0)
				diff+=26;
			d+=diff/13;
			d+=diff%13;
		}
		System.out.println(d);
	}
}
