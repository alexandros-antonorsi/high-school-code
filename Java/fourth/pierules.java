import java.util.Scanner;

public class pierules {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] vals = new int[n];
		for(int i=0;i<n;i++)
			vals[i]=input.nextInt();
		int[][] dp = new int[2][n];
		dp[0][n-1]=vals[n-1];
		dp[1][n-1]=0;
		for(int i=n-2;i>=0;i--){
			dp[0][i] = Math.max(vals[i]+dp[1][i+1], dp[0][i+1]);
			dp[1][i] = Math.min(vals[i]+dp[1][i+1], dp[0][i+1]);
		}
		System.out.println(dp[1][0]+" "+dp[0][0]);
	}
}
