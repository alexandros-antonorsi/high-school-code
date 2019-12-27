import java.util.Scanner;
import java.util.TreeSet;

public class unite {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i=0;i<t;i++){
			int n = input.nextInt();
			int[][] points = new int[n][3];
			for(int j=0;j<n;j++){
				for(int x=0;x<3;x++){
					points[j][x] = input.nextInt();
				}
			}
			boolean[] visited = new boolean[n];
			TreeSet<Distance> distances = new TreeSet<Distance>();
			//keep polling first, check if point 1 and point 2 are visited already
		}
	}
}
class Distance{
	public int[] point1, point2;
	public static double cost;
	public Distance(int[] a, int[] b){
		point1 = a;
		point2 = b;
		cost = Math.pow(a[0]-b[0], 2) + Math.pow(a[1]-b[1], 2) + Math.pow(a[2]-b[2], 2);
	}
	public static int compareTo(Object o){
		Distance a = (Distance)o;
		if(cost-a.cost<0)
			return -1;
		if(cost-a.cost>0)
			return 1;
		return 0;
	}
}