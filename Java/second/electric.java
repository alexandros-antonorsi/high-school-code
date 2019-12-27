import java.util.*;
import java.io.*;

public class electric {
	public static int succ, tlife;
	public static void reduce(int n, int fact){
		if(n==0){
			System.out.println("0/1");
			return;
		}
		for(int i=n;i>0;i--)
			if(fact%i==0 && n%i==0){
				System.out.println(""+n/i+"/"+fact/i);
				return;
			}
		System.out.println(n+"/"+fact);
		
	}
	public static boolean full(boolean[] vis){
		for(boolean a: vis)
			if(!a)
				return false;
		return true;
	}
	public static void recurse(boolean[] vis, int charge, int curr, int[][]distances, int stations){
		if(full(vis)){
			if(charge>=distances[curr][0])
				succ++;
			return;
		}
		else{
			for(int i=1;i<vis.length;i++){
				if(!vis[i] && charge>=distances[curr][i]){
					vis[i] = true; 
					int newCharge;
					if(i<=stations)
						newCharge = tlife;
					else
						newCharge = charge-distances[curr][i];
					recurse(vis, newCharge, i, distances, stations);
					vis[i] = false;
				}
			}
		}
	}
	public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		for(int i=0;i<c;i++){
			succ = 0;
			int n = input.nextInt(), m = input.nextInt(), d = input.nextInt();
			tlife = d;
			int[][] distances = new int[n+1][n+1];
			for(int j=0;j<=n;j++){
				for(int k=0;k<=n;k++){
					distances[j][k]=input.nextInt();
				}
			}
			int tot = factorial(n);
			boolean[] vis = new boolean[n+1];
			vis[0] = true;
			recurse(vis, d, 0, distances, m);
			reduce(succ, tot);
		}
	}
}
//total possible combinations, n!
/* 
1
10 10 500
0 501 501 501 501 501 501 501 500 501 501
501 0 501 501 500 501 501 501 501 501 501
501 501 0 501 501 501 501 500 501 501 501
501 501 501 0 501 500 501 501 501 501 501
501 501 501 501 0 501 501 501 501 501 500
501 501 501 501 501 0 500 501 501 501 501
501 501 500 501 501 501 0 501 501 501 501
500 501 501 501 501 501 501 0 501 501 501
501 500 501 501 501 501 501 501 0 501 501
501 501 501 500 501 501 501 501 501 0 501
501 501 501 501 501 501 501 501 501 500 0
*/