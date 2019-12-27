import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class watchingtv {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i=0;i<t;i++){
			int[] freqs = new int[100000];
			int n = input.nextInt();
			for(int j=0;j<n;j++){
				input.next();
				int freq = input.nextInt();
				freqs[freq] +=1;
			}
			int max = 0; int maxFreq = 0;
			for(int x=0;x<100000;x++){
				if(freqs[x]>max){
					max = freqs[x];
					maxFreq = x;
				}
			}
			System.out.println(maxFreq);
		}
	}
}
