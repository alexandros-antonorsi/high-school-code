import java.util.Scanner;
import java.util.TreeSet;

public class dancerecital {
	public static TreeSet<Integer> changes = new TreeSet<Integer>();
	public static int perms(int[][] adj, int[] perm, int n, boolean[] visited){
		if(n==adj.length){
			changes.add(num(adj, perm));
		}
		for(int i=0; i<perm.length; i++){
			if(!visited[i]){
				visited[i]=true;
				perm[n]=i;
				perms(adj, perm,n+1,visited);
				visited[i]=false;
				perm[n]=0;
			}
		}
		return -1;
	}
	public static int num(int[][] adj, int[] perm){
		int c = 0;
		for(int i=1;i<perm.length;i++){
			c+=adj[perm[i-1]][perm[i]];
		}
		return c;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int r = Integer.parseInt(input.nextLine());
		char[][] lines = new char[r][];
		for(int i=0;i<r;i++){
			lines[i]= input.nextLine().toCharArray();
		}
		int[][] adj = new int[r][r];
		for(int i=0;i<r;i++){
			for(int j=i+1;j<r;j++){
				char[] line1 = lines[i];
				char[] line2 = lines[j];
				boolean[] d1 = new boolean[26];
				boolean[] d2 = new boolean[26];
				for(char x: line1){
					d1[(int)x-65] = true;
				}
				for(char x: line2){
					d2[(int)x-65] = true;
				}
				int c = 0;
				for(int z=0;z<26;z++){
					if(d1[z] && d2[z]){
						c++;
					}
				}
				adj[i][j]=c;
				adj[j][i]=c;
			}
		}
		perms(adj, new int[r], 0, new boolean[r]);
		System.out.println(changes.pollFirst());
	}
}
