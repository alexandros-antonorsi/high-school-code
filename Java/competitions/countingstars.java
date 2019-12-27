import java.util.*;
import java.io.*;

public class countingstars {
	public static int numStars =0;
	public static char[][] board;
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int z = 0;
		String nextline = in.nextLine();
		while(!nextline.equals("")){
			System.out.println(nextline);
			z++;
			numStars =0;
			String[] nums = nextline.split(" ");
			int m = Integer.parseInt(nums[0]);
			int n = Integer.parseInt(nums[1]);
			board = new char[m][n];
			
			for(int i=0;i<m;i++){
				board[i] = in.nextLine().toCharArray();
			}
			System.out.println("x");
			for(int r=0;r<m;r++){
				for(int c=0;c<n;c++){
					if(board[r][c]=='-'){
						numStars++;
						fillStar(r,c);
					}
				}
			}
			System.out.println("Case "+z+": " + numStars);
				nextline = in.nextLine();
		}
	}
	public static void fillStar(int row, int col){
		board[row][col] = '#';
		if(row+1<board.length && board[row+1][col]=='-')
			 fillStar(row+1,col);
		if(row>0 && board[row-1][col]=='-')
			 fillStar(row-1,col);
		if(col+1<board[0].length && board[row][col+1]=='-')
			 fillStar(row,col+1);
		if(col>0 && board[row][col-1]=='-')
			 fillStar(row,col-1);
	}
}
