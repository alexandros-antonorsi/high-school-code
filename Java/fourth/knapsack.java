import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class knapsack {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] line = input.readLine().split(" ");
		int s = Integer.parseInt(line[0]);
		int n = Integer.parseInt(line[1]);
		int[] weights = new int[n+1]; weights[0]=0;
		int[] vals = new int[n+1]; vals[0]=0;
		for(int i=1;i<n+1;i++){
			String[] pair = input.readLine().split(" ");
			weights[i]=Integer.parseInt(pair[0]);
			vals[i]=Integer.parseInt(pair[1]);
		}
		int[][] t = new int[n+1][s+1]; 
		for(int r=0;r<n+1;r++){
			for(int c=0;c<s+1;c++){
				if(r==0||c==0)
					t[r][c]=0;
				else if(weights[r]<=c){
					t[r][c]=Math.max(t[r-1][c-weights[r]]+vals[r],t[r-1][c]);
				}
				else{
					t[r][c]=t[r-1][c];
				}
			}
		}
		System.out.println(t[n][s]);
	}
}
