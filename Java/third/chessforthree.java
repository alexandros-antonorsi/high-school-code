import java.util.ArrayList;
import java.util.Scanner;

public class chessforthree {
	public static boolean[] playing;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		playing = new boolean[3];
		playing[0] = true; playing[1] = true;
		for(int i=0;i<n;i++){
			int x = input.nextInt();
			if(playing[x-1]){
				update(x-1);
			}else{
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
	public static void update(int x){
		for(int i=0;i<3;i++)
			if(i!=x){
				if(!playing[i])
					playing[i] = true;
				else
					playing[i] = false;
			}
	}
}
