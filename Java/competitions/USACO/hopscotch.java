import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class hopscotch {
	public static int r, c, count;
	public static void jump(int rr, int cc, char curr, char[][] map){
		if(rr==r-1 && cc==c-1){
			count++;
			return;
		}
		for(int i=rr+1;i<r;i++){
			for(int j=cc+1;j<c;j++){
				if(map[i][j]!=curr){
					jump(i,j,map[i][j],map);
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new FileReader("hopscotch.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("hopscotch.out")));
		String[] line = input.readLine().split(" ");
		count = 0;
		r = Integer.parseInt(line[0]); c = Integer.parseInt(line[1]);
		char[][] map = new char[r][c];
		for(int i=0;i<r;i++){
			map[i] = input.readLine().toCharArray();
		}
		jump(0,0, map[0][0], map);
		out.print(count);
		out.close();
	}
}
