import java.util.HashMap;
import java.util.Scanner;

public class longestprefix {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i=0;i<t;i++){
			String a = input.next();
			String b = input.next();
			int[] letB = new int[123];
			for(int x=0;x<b.length();x++){
				letB[(int)b.charAt(x)]+=1;
			}
			int total = 0;
			for(int x=0;x<a.length();x++){
				if(letB[(int)a.charAt(x)]>0){
					total++;
					letB[(int)a.charAt(x)]-=1;
				}else{
					break;
				}
			}
			System.out.println(total);
		}
	}
}
