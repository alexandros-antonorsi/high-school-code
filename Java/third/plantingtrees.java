import java.util.Arrays;
import java.util.Scanner;

public class plantingtrees {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] trees = new int[n];
		for(int i=0;i<n;i++){
			trees[i] = input.nextInt();
		}
		Arrays.sort(trees);
		int max = trees[n-1]+2;
		for(int i=1;i<=n;i++){
			max = Math.max(max, (i+1)+trees[n-i]);
		}
		
		System.out.println(max);
	}
}
