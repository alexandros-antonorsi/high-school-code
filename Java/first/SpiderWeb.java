import java.util.Scanner;
public class SpiderWeb {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between .5 and 10");
		int row = (int)Math.round(input.nextDouble());
		System.out.println("Enter another number from .5 to 10");
		int col = (int)(Math.round(input.nextDouble()));
		makeWeb(row, col);
	}
	public static void makeWeb(int row, int col){
		for(int j=0;j<row;j++){
			for(int i=0;i<col;i++){
				System.out.print("\\ | /");
			}
			System.out.println();
			for(int i=0;i<col;i++){
				System.out.print("- 0 -");
			}
			System.out.println();
			for(int i=0;i<col;i++){
				System.out.print("/ | \\");
			}
			System.out.println();
		}
		
	}
}
