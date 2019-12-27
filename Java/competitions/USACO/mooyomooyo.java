import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class mooyomooyo {
	public static int n, k;
	public static char[][] map;
	public static boolean[][] visited;
	
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("mooyomooyo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mooyomooyo.out")));
		String[] line = f.readLine().split(" ");
		n = Integer.parseInt(line[0]);
		k = Integer.parseInt(line[1]);
		map = new char[n][10];
		for(int i=0;i<n;i++)
			map[i]=f.readLine().toCharArray();
		int a = eraseBoard();
		while(a>0){
			a= eraseBoard();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<10;j++)
				out.print(map[i][j]);
			out.println();
		}
		out.close();
	}
	public static int eraseBoard(){
		int numChanged = 0; // if this remains 0, nothing else to do, while loop in main stops
		visited = new boolean[n][10];
		for(int i=0;i<n;i++){
			for(int j=0;j<10;j++){
				if(map[i][j]!='0' && !visited[i][j]){
					char color = map[i][j];
					int a = groupColor(i,j, color);
					if(a>=k){
						numChanged+=a;
						eraseColor(i,j,color);
					}
					
				}
			}
		}
		shiftBoard();	
		return numChanged;
	}
	public static void eraseColor(int r, int c, char color){
		map[r][c]='0';
		if(r-1>-1 && map[r-1][c]==color)
			eraseColor(r-1,c,color);
		if(r+1<n && map[r+1][c]==color)
			eraseColor(r+1,c,color);
		if(c-1>-1 && map[r][c-1]==color)
			eraseColor(r,c-1,color);
		if(c+1<10 && map[r][c+1]==color)
			eraseColor(r,c+1,color);
	}
	public static int groupColor(int r, int c, char color){//returns the size of the group of a certain color that includes map[r][c]
		int total = 1;
		visited[r][c]=true;
		if(r-1>-1 && !visited[r-1][c] && map[r-1][c]==color)
			total += groupColor(r-1,c,color);
		if(r+1<n && !visited[r+1][c] && map[r+1][c]==color)
			total += groupColor(r+1,c,color);
		if(c-1>-1 && !visited[r][c-1] && map[r][c-1]==color)
			total += groupColor(r,c-1,color);
		if(c+1<10 && !visited[r][c+1] && map[r][c+1]==color){
			total += groupColor(r,c+1,color);
		}
		return total;
		
	}
	public static void shiftBoard(){
		for(int i=n-1;i>=0;i--){
			for(int j=9;j>=0;j--){
				if(map[i][j]=='0'){
					int first = i;
					while(first-1>=0 && map[first][j]=='0')
						first--;
					map[i][j]=map[first][j];
					map[first][j]='0';
				}
			}
		}
	}
}
