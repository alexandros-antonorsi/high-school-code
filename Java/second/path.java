import java.util.*;
import java.io.*;
public class path {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//create an arraylist of coordinates. start with 
		
		
		ArrayList<ArrayList<Boolean>> map = new ArrayList<ArrayList<Boolean>>();
		//change to hashset
		ArrayList<String> directions = new ArrayList<String>();
		int top =0, bot=0, left=0, right=0;
		int[] pos = {0,0};//row, column. down a row = +1 to [0], across a column = +1 to [1]
		while(input.ready()){
			String dir = input.readLine();
			directions.add(dir);
			if(dir.equals("left"))
				pos[1] -=1;
			else if(dir.equals("right"))
				pos[1] -=1;
			else if(dir.equals("down"))
				pos[0] +=1;
			else
				pos[0] -=1;
			if(pos[0]<top)
				top = pos[0];
			if(pos[0]>bot)
				bot = pos[0];
			if(pos[1]>right)
				right = pos[1];
			if(pos[1]<left)
				left = pos[1];
		}
		int x = right-left;
		int y = bot-top;
		boolean[][] grid = new boolean[y][x];
		//trace path starting at 0, then translate the path so that it fits in the rectangle
	}
}
