import java.util.Scanner;

public class peg {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char[][] board = new char[7][7];
		for(int i=0;i<7;i++){
			board[i] = input.nextLine().toCharArray();
		}
		int count = 0; 
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				
				if(board[i][j]=='o'){
					if(j>1 && board[i][j-1]=='o')
						if(board[i][j-2]=='.')
							count++;
					if(j<5 && board[i][j+1]=='o')
						if(board[i][j+2]=='.')
							count++;
					if(i>1 && board[i-1][j]=='o')
						if(board[i-2][j]=='.')
							count++;
					if(i<5 && board[i+1][j]=='o')
						if(board[i+2][j]=='.')
							count++;
				}
				
			}
		}
		System.out.println(count);
	}
}
