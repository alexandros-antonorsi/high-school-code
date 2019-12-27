import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class springs {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		for(int i=0;i<n;i++){
			String dimensions = in.nextLine();
			char[][] ground = new char[Integer.parseInt(dimensions.split(" ")[1])][Integer.parseInt(dimensions.split(" ")[0])];
			ArrayList<int[]> springLocations = new ArrayList<int[]>();
			for(int r =0;r<ground.length;r++){
				ground[r] = in.nextLine().toCharArray();
			}
			for(int r=0;r<ground.length;r++)
				for(int c=0;c<ground[0].length;c++){
					if(ground[r][c]=='s'){
						int[] loc = {r,c};
						springLocations.add(loc);
					}
				}
			int springs = 0;
			for(int[] location: springLocations){
				springs++;
				fillSpace(ground, location[0], location[1]);
			}
			for(int r=0;r<ground.length;r++)
				for(int c=0;c<ground[0].length;c++){
					if(ground[r][c]=='w'){
						springs++;
						fillSpace(ground, r, c);
					}
				}
			System.out.println(springs);
		}
	}
	public static void fillSpace(char[][] ground, int row, int col){
		ground[row][col] = 'e';
		if(row+1<ground.length && ground[row+1][col]=='w')
			fillSpace(ground,row+1,col);
		if(row>0 && ground[row-1][col]=='w')
			fillSpace(ground,row-1,col);
		if(col+1<ground[0].length && ground[row][col+1]=='w')
			fillSpace(ground,row,col+1);
		if(col>0 && ground[row][col-1]=='w')
			fillSpace(ground,row,col-1);
	}
}
