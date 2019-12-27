import java.util.Scanner;

public class jumper {
	static boolean can;

	public static void recurse(int[][] pf, int curr, boolean[] vis, int g, int p){
		if(curr==g){
			can = true;
			return;
		}
		for(int i=0;i<vis.length;i++){
			if(can)
				return;		
			if(!vis[i] && pf[curr][i]<=p){
				vis[i] = true;
				recurse(pf, i, vis, g, p);
				vis[i]=false;
			}
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i=0;i<t;i++){
			can = false;
			int n = input.nextInt(); int p = input.nextInt(); int s = input.nextInt(); int g = input.nextInt();
			int[][] pf = new int[n][n];
			for(int a=0;a<n;a++){
				for(int b=0;b<n;b++){
					pf[a][b] = input.nextInt();
				}
			}
			/*boolean[][] adj = new boolean[n][n];
			for(int a=0;a<n;a++){
				for(int b=0;b<n;b++){
					if(pf[a][b]<=p)
						adj[a][b]=true;
				}
			}*/
			boolean[] vis = new boolean[n];
			recurse(pf, s, vis, g, p);
			if(can)
				System.out.println("EASY");
			else
				System.out.println("IMPOSSIBLE");
		}
	}
}
