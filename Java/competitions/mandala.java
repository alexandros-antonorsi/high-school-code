import java.util.ArrayList;
import java.util.Scanner;
public class mandala {
	public static boolean mandalab(boolean[][] grid, int city2, int curr, int numroutes){
		if(curr==city2)
			numroutes++;
		if(numroutes==2)
			return true;
		ArrayList<Integer> toVisit = new ArrayList<Integer>();
		for(int i=0;i<grid.length;i++){
			if(grid[curr][i])
				toVisit.add(i);
		}
		for(int i=0;i<toVisit.size();i++){
			mandalab(grid, city2, toVisit.get(i), numroutes);
		}
		return false;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			int c = input.nextInt();
			int r = input.nextInt();
			int t = input.nextInt();
			boolean[][] grid = new boolean[c][c];
			for(int j=0;j<r;j++){
				int a = input.nextInt();
				int b = input.nextInt();
				grid[a-1][b-1] = true;
				grid[b-1][a-1] = true;
			}
			int sum = 0;
			for(int j=0;j<t;j++){
				int city1 = input.nextInt();
				int city2 = input.nextInt();
				if(mandalab(grid, city2, city1, 0))
					sum++;
			}
			if(sum==0)
				System.out.println(0);
			else if(sum==1)
				System.out.println(5);
			else if(sum==2)
				System.out.println(10);
			else if(sum==3)
				System.out.println(20);
			else if(sum==4)
				System.out.println(30);
			else
				System.out.println(40);
		}
	}
}
