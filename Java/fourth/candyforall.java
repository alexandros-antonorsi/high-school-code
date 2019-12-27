import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class candyforall {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			int k = input.nextInt();
			int[] piles = new int[n];
			for(int i=0;i<n;i++){
				piles[i]=input.nextInt();
			}
			Arrays.sort(piles);
			int total = 0;
			while(k>0){
				int x = piles[n-1];
				total+=x/2;
				piles[n-1]=x-x/2;
				Arrays.sort(piles);
				k--;
			}
			System.out.println(total);
		
	}
	
}
