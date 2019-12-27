import java.io.*;
import java.util.*;
class Point{
	public int x,y, distance;
	public Point paired;
	public boolean alreadyPaired;
	public Point(int X, int Y){
		x = X;
		y = Y;
		distance = -1;
		paired = null;
		alreadyPaired = false;
	}
}
public class box {
	public static ArrayDeque<Point> queue;
	public static char[][] land;
	public static Point[][] grid;
	public static void assignPairs(ArrayList<Point> teleporters){
		for(int x=0;x<teleporters.size();x++)
			for(int y=x+1;y<teleporters.size();y++){
				Point a = teleporters.get(x);
				Point b = teleporters.get(y);
				if(land[a.x][a.y]==land[b.x][b.y]){
					a.paired = teleporters.get(y);
					b.paired = teleporters.get(x);
				}
			}
	}
	public static boolean isValid(int x, int y){
		if(-1<x && x<grid.length && -1<y && y<grid[0].length && land[x][y] != 'W' && grid[x][y].distance==-1)
			return true;
		return false;
	}
	public static void addNeighbors(Point point, int distance){
		if(isValid(point.x, point.y-1)){
			Point left = grid[point.x][point.y-1];
			left.distance = distance+1;
			queue.add(left);	
		}
		if(isValid(point.x, point.y+1)){
			Point right= grid[point.x][point.y+1];
			right.distance = distance+1;
			queue.add(right);	
		}
		if(isValid(point.x-1, point.y)){
			Point up= grid[point.x-1][point.y];
			up.distance = distance+1;
			queue.add(up);	
		}
		if(isValid(point.x+1, point.y)){
			Point down= grid[point.x+1][point.y];
			down.distance = distance+1;
			queue.add(down);	
		}
		if(point.paired!=null && !point.alreadyPaired){
			point.alreadyPaired = true;
			addNeighbors(point.paired, distance);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String nums = in.readLine();
		while(!(Integer.parseInt(nums.split(" ")[0])==0 && Integer.parseInt(nums.split(" ")[1])==0)){
		queue = new ArrayDeque<Point>();
		land = new char[Integer.parseInt(nums.split(" ")[0])][Integer.parseInt(nums.split(" ")[1])];
		ArrayList<Point> thisonlyexiststocheckforpairs = new ArrayList<Point>();
		for(int r = 0;r<land.length;r++)
			land[r] = in.readLine().toCharArray();
		grid = new Point[land.length][land[0].length];
		Point bob = null;
		for(int r=0;r<land.length;r++)
			for(int c=0;c<land[0].length;c++){
				Point x = new Point(r,c);
				if(land[r][c]!='W' && land[r][c]!='B' && land[r][c]!='X' && land[r][c]!='.')
					thisonlyexiststocheckforpairs.add(x);
				grid[r][c] = x;
				if(land[r][c]=='B'){
					bob = new Point(r,c);
					bob.distance=0;
				}
			}
		queue.add(bob);
		assignPairs(thisonlyexiststocheckforpairs);
		int distance = 0;
		while(!queue.isEmpty()){
			Point a = queue.remove();
			if(land[a.x][a.y]=='X'){
				System.out.println(a.distance);
				break;
			}
			if(a.distance!=distance)
				distance++;
			addNeighbors(a, distance);
		}
		nums = in.readLine();
		}
	}
}