import java.util.Scanner;

public class throwaway {
	public static int c=0;
	public static void main(String[] args){
		if(c==10)
			System.out.println("stop");
		else{
			c++;
			main(new String[3]);
		}
		
	}
}
