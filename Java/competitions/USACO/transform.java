/*
ID: alexand131
LANG: JAVA
TASK: transform
*/
import java.io.*;
import java.util.*;

public class transform {
	public static char[][] start, end;
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("transform.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("transform.out")));
		int n = Integer.parseInt(f.readLine());
		start = new char[n][n];
		end = new char[n][n];
		for(int i=0;i<n;i++){
			String line = f.readLine();
			for(int j=0;j<n;j++){
				start[i][j]=line.charAt(j);
			}
		}
		for(int i=0;i<n;i++){
			String line = f.readLine();
			for(int j=0;j<n;j++)
				end[i][j]=line.charAt(j);
		}
		if(equals(rotate90(start))){//90
			out.println(1);
			out.close();
			return;
		}
		if(equals(rotate90(rotate90(start)))){//180
			out.println(2);
			out.close();
			return;
		}
		if(equals(rotate90(rotate90(rotate90(start))))){//270
			out.println(3);
			out.close();
			return;
		}
		if(equals(reflectHorizontally(start))){//flip
			out.println(4);
			out.close();
			return;
		}
		if(equals(rotate90(reflectHorizontally(start)))){//flip+90
			out.println(5);
			out.close();
			return;
		}
		if(equals(rotate90(rotate90(reflectHorizontally(start))))){//flip+180
			out.println(5);
			out.close();
			return;
		}
		if(equals(rotate90(rotate90(rotate90(reflectHorizontally(start)))))){//flip + 270
			out.println(5);
			out.close();
			return;
		}
		if(equals(start)){//no change
			out.println(6);
			out.close();
			return;
		}
		out.println(7);
		out.close();
	}
	public static char[][] rotate90(char[][] original){
		int n = original[0].length;
		char[][] transformed = new char[n][n];
		double tempDifference = (n-1)/2.0;
		for(int y=0;y<n;y++)//rows
			for(int x=0;x<n;x++)//cols
				transformed[y][x]=original[(int)((-(x-tempDifference))+tempDifference)][y];
		return transformed;
	}	
	public static char[][] reflectHorizontally(char[][] original){
		int n = original[0].length;
		char[][] transformed = new char[n][n];
		for(int y=0;y<n;y++)
			for(int x=0;x<n;x++)
				transformed[y][x]=original[y][(n-1)-x];
		return transformed;
	}	
	public static boolean equals(char[][] arr){
		int n = arr[0].length;
		for(int r=0;r<n;r++)
			for(int c=0;c<n;c++)
				if(end[r][c]!=arr[r][c])
					return false;
		return true;
	}
}
