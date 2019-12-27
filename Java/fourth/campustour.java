import java.util.Scanner;

public class campustour {
	public static int max;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); int m = input.nextInt();
		boolean[][] broken = new boolean[n][n];
		max = 0;
		for(int i=0;i<m;i++){
			int a = input.nextInt()-1;
			int b = input.nextInt()-1;
			broken[a][b] = true;
			broken[b][a] = true;
		}
		for(int i=0;i<n;i++)
			broken[i][i]=true;
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++){
			visited[i]=true;
			pathSearch(broken, visited, i, 1);
			visited[i]=false;
		}
		
		System.out.println(max);
	}
	public static void pathSearch(boolean[][] broken, boolean[]visited, int index, int num){
		for(int i=0;i<broken.length;i++){
			if(!broken[index][i] && !visited[i]){
				visited[i]=true;
				pathSearch(broken,visited,i,num+1);
				visited[i]=false;
			}else{
				if(num>max)
					max=num;
			}
		}
	}
}
