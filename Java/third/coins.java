import java.util.Scanner;

public class coins {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			int c = input.nextInt();
			int k = input.nextInt();
			String first = input.next();
			System.out.print("Game #"+(i+1)+": ");
			if(c%(k+1)==0){
				if(first.equals("Matthew"))
					System.out.println("Bill");
				else
					System.out.println("Matthew");
			}		
			else{
				System.out.println(first);
			}
			
		}
	}
}
