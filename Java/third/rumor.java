import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class rumor {
	public static ArrayList<TreeSet<Integer>> groupList;
	public static void generateFriendGroup(boolean[][] friendgrid, boolean[] ingroup, int i, TreeSet<Integer> group){
		if(!ingroup[i]){
			ingroup[i] = true;
			group.add(i);
			for(int j=0;j<friendgrid.length;j++){
				if( i!=j && friendgrid[i][j])
					generateFriendGroup(friendgrid, ingroup, j, group);
			}	
		}
	}
	public static int getMin(TreeSet<Integer> group, int[] prices){
		int min = Integer.MAX_VALUE;
		for(int i=0;i<group.size();i++){
			int a = group.pollFirst();
			if(prices[a]<min)
				min = prices[a];
		}
		return min;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int prices[] = new int[n];
		for(int i=0;i<n;i++){
			prices[i] = input.nextInt();
		}
		boolean[][] friendgrid = new boolean[n][n];
		for(int i=0;i<n;i++){
			friendgrid[i][i] = true;
		}
		for(int i=0;i<m;i++){
			int a = input.nextInt();
			int b = input.nextInt();
			friendgrid[a-1][b-1] = true;
			friendgrid[b-1][a-1] = true;
		}
		boolean[] ingroup = new boolean[friendgrid.length];
		groupList = new ArrayList<TreeSet<Integer>>();
		for(int i=0;i<friendgrid.length;i++){
			TreeSet<Integer> group = new TreeSet<Integer>();
			generateFriendGroup(friendgrid, ingroup, i, group);
			if(group.size()!=0)
				groupList.add(group);
		}
		long sum = 0;
		for(int i=0;i<groupList.size();i++){
			sum += getMin(groupList.get(i), prices);
		}
		System.out.println(sum);
	}
}
