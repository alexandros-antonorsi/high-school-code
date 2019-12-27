import java.util.*;
import java.io.*;
//floodfill
public class lex {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("lexInput.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lexOutput.txt")));
		int n = Integer.parseInt(f.readLine());
		for(int i=0;i<n;i++){
			String line = f.readLine();
			int rows = Integer.parseInt(line.substring(0, line.indexOf(" ")));
			int cols = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			char[][] earth = new char[rows][cols];
			int[] xPos = {0,0};
			for(int x=0;x<rows;x++){
				String row = f.readLine();
				if(row.indexOf("X")>-1){
					xPos[0] = x;
					xPos[1] = row.indexOf("X");
				}
				earth[x] = row.toCharArray();
			}
			int water = 0;
			water += spreadWater(xPos[0], xPos[1], earth, water);
			out.println(water);
		}
		out.close();
	}
	
	public static int spreadWater(int row, int col, char[][] earth, int waterAdded){
		earth[row][col] = '.';
		waterAdded+=5;
		if(row+1<earth.length && earth[row+1][col]=='~')
			waterAdded = spreadWater(row+1,col,earth, waterAdded);
		if(row>0 && earth[row-1][col]=='~')
			waterAdded = spreadWater(row-1,col,earth, waterAdded);
		if(col+1<earth[0].length && earth[row][col+1]=='~')
			waterAdded = spreadWater(row,col+1,earth, waterAdded);
		if(col>0 && earth[row][col-1]=='~')
			waterAdded = spreadWater(row,col-1,earth, waterAdded);
		
		return waterAdded;	
	}
}
