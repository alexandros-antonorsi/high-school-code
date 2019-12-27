import java.util.Scanner;

public class bigtruck {
	public static int max = 0;
	public static int min = Integer.MAX_VALUE;
	public static int n;
	public static void calcPath(int[][] distances, boolean[] visited, int curr, int distance, int itemNum, int[] items){
		if(distance>min)//path fails
			return;
		if(curr == n-1){//finished
			if(distance<min){//new shortest distance, overrides previous max
				min = distance;
				max = itemNum;
			}else if(distance==min && itemNum>max){//same distance but new max
				max = itemNum;
			}	
		}
			
		for(int i=0;i<n;i++){
			if(i!=curr && !visited[i]){
				if(distances[curr][i]!=0){
					visited[i] = true;
					calcPath(distances, visited, i, distance + distances[curr][i], itemNum + items[i], items);
					visited[i] = false;
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		n = Integer.parseInt(input.next());
		int[] items = new int[n];
		for(int i=0;i<n;i++)
			items[i] = Integer.parseInt(input.next());
		int[][] distances = new int[n][n];
		int z = Integer.parseInt(input.next());
		for(int i=0;i<z;i++){
			int a = Integer.parseInt(input.next())-1;
			int b = Integer.parseInt(input.next())-1;
			int d = Integer.parseInt(input.next());
			distances[a][b] = d;
			distances[b][a] = d;
		}
		boolean[] visited = new boolean[n];
		visited[0] = true;
		calcPath(distances, visited, 0, 0, items[0], items);
		if(min==Integer.MAX_VALUE)
			System.out.println("impossible");
		else
			System.out.println(min+" "+max);
	}
}
