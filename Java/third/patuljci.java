import java.util.Scanner;

public class patuljci {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] dwarves = new int[9];
		int sum = 0;
		boolean[] good = new boolean[9];
		for(int i=0;i<9;i++){
			int x = Integer.parseInt(input.next());
			dwarves[i] = x;
			sum+=x;
			good[i] = true;
		}
		
		outloop:
		for(int i=0;i<9;i++){
			for(int j=i+1;j<9;j++){
				if(sum-dwarves[i]-dwarves[j]==100){
					good[i] = false;
					good[j] = false;
					break outloop;
				}
			}
		}
		for(int i=0;i<9;i++){
			if(good[i])
				System.out.println(dwarves[i]);
		}
	}
}
