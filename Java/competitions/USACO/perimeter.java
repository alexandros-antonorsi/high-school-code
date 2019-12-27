import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeSet;

class Blob implements Comparable{
	public int x, y, area, perim;
	public Blob(int xFirst, int yFirst){
		x=xFirst;
		y=yFirst;
	}
	public int compareTo(Object o) {
		Blob a = (Blob)o;
		int x = this.area-a.area;
		if(x==0)
			return 1;
		else 
			return x;
	}
}
public class perimeter {
	public static int area, perim;
	public static void flood(int r, int c, char[][] board, boolean[][] visited){
		area++;
		visited[r][c]=true;
		if(r<board.length-1 && board[r+1][c]=='#' && !visited[r+1][c])
			flood(r+1,c,board,visited);
		if(r>0 && board[r-1][c]=='#' && !visited[r-1][c])
			flood(r-1,c,board,visited);
		if(c<board[0].length-1 && board[r][c+1]=='#' && !visited[r][c+1])
			flood(r,c+1,board,visited);
		if(c>0 && board[r][c-1]=='#' && !visited[r][c-1])
			flood(r,c-1,board,visited);
	}
	public static void findP(int r, int c, char[][] board, boolean[][] visited){
		visited[r][c]=true;
		if(r<board.length-1 && board[r+1][c]=='.')
			perim++;
		if(r>0 && board[r-1][c]=='.')
			perim++;
		if(c<board[0].length-1 && board[r][c+1]=='.')
			perim++;
		if(c>0 && board[r][c-1]=='.')
			perim++;
		if(r==board.length-1 || r==0)
			perim++;
		if(c==board[0].length-1 || c==0)
			perim++;
		if(r<board.length-1 && board[r+1][c]=='#' && !visited[r+1][c])
			findP(r+1,c,board,visited);
		if(r>0 && board[r-1][c]=='#' && !visited[r-1][c])
			findP(r-1,c,board,visited);
		if(c<board[0].length-1 && board[r][c+1]=='#' && !visited[r][c+1])
			findP(r,c+1,board,visited);
		if(c>0 && board[r][c-1]=='#' && !visited[r][c-1])
			findP(r,c-1,board,visited);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("perimeter.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("perimeter.out")));
		int n = Integer.parseInt(f.readLine());
		char[][] map = new char[n][n];
		boolean[][] visited = new boolean[n][n];
		for(int i=0;i<n;i++){
			char[] line = f.readLine().toCharArray();
			map[i]=line;
		}
		if(n==1){
			out.println("1 4");
			out.close();
			return;
		}
		TreeSet<Blob> blobs = new TreeSet<Blob>();
		for(int r=0;r<n;r++){
			for(int c=0;c<n;c++){
				if(!visited[r][c] && map[r][c]=='#'){
					Blob a = new Blob(r,c);
					area=0;
					flood(r,c,map, visited);
					a.area = area;
					blobs.add(a);
				}
			}
			
		}
		Blob last = blobs.pollLast();
		perim = 0;
		visited = new boolean[n][n];
		findP(last.x, last.y, map, visited);
		last.perim=perim;
		while(blobs.last().area==last.area){
			Blob a = blobs.pollLast();
			perim = 0;
			findP(a.x, a.y, map, visited);
			if(perim<last.perim){
				last = a;
				last.perim = perim;
			}
		}
		out.println(last.area+" "+last.perim);
		out.close();

	}
}
