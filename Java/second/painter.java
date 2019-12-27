import java.util.Arrays;
import java.util.Scanner;
class Shape implements Comparable{
	public int order;
	public int[] ul, br;
	public String color;
	public Shape(int[] u, int[] b, String c, int o){
		ul = u;
		br = b;
		color = c;
		order = o;
	}
	public int compareTo(Object o){
		Shape a = (Shape)o;
		return (order-a.order)*-1;
	}
}
public class painter {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t= input.nextInt();
		for(int i=0;i<t;i++){
			int n = input.nextInt(); int m = input.nextInt(); int s = input.nextInt();
			String[][] board = new String[n][m];
			for(int a=0;a<n;a++)
				for(int b=0;b<m;b++)
					board[a][b]="#";
			Shape[] list = new Shape[s];
			for(int j=0;j<s;j++){
				int[] ul = {input.nextInt(), input.nextInt()};
				int[] br = {input.nextInt(), input.nextInt()};
				String color = input.next();
				int order = input.nextInt();
				list[j] = new Shape(ul, br, color, order);
			}
			Arrays.sort(list);
			for(Shape a: list){
				for(int r = a.ul[0]; r<=a.br[0]; r++){
					for(int c = a.ul[1]; c<=a.br[1];c++){
						board[r][c] = a.color;
					}
				}
			}
			for(int a=0;a<n;a++){
				for(int b=0;b<m;b++){
					System.out.print(board[a][b]);
				}
				System.out.println();
			}
		}
	}
}
