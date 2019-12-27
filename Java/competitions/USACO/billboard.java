import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class billboard {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new FileReader("billboard.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
		String[] b1 = input.readLine().split(" ");
		String[] b2 = input.readLine().split(" ");
		String[] t = input.readLine().split(" ");
		int[] board1 = new int[4];
		int[] board2 = new int[4];
		int[] truck = new int[4];
		boolean[][] fov = new boolean[2001][2001];
		for(int i=0;i<4;i++){
			board1[i] = Integer.parseInt(b1[i])+1000;
			board2[i] = Integer.parseInt(b2[i])+1000;
			truck[i] = Integer.parseInt(t[i])+1000;
		}
		for(int y=board1[1];y<board1[3];y++){
			for(int x=board1[0];x<board1[2];x++){
				fov[2000-y][x] = true;
			}
		}
		for(int y=board2[1];y<board2[3];y++){
			for(int x=board2[0];x<board2[2];x++){
				fov[2000-y][x] = true;
			}
		}
		for(int y=truck[1];y<truck[3];y++){
			for(int x=truck[0];x<truck[2];x++){
				fov[2000-y][x] = false;
			}
		}
		int c = 0;
		for(int i=0;i<2001;i++){
			for(int j=0;j<2001;j++){
				if(fov[i][j])
					c++;
			}
		}
		out.println(c);
		out.close();
	}
}
