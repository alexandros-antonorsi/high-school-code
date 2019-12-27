import java.util.Scanner;

public class hoo {
	public int[] primes = {};
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int p = Integer.parseInt(input.next());
		for(int i=0;i<p;i++){
			int r = Integer.parseInt(input.next());
			int count = 0;
			for(int k=2;k<=r;k++){
				while(r%k==0){
					r=r/k;
					count++;
				}
			}
			System.out.print("Pop #"+(i+1)+": ");
			if(count<=3){
				System.out.println(""+count+" licks? Your goose is cooked!");
			}else{
				System.out.println("A-one... A-two-HOO... A-"+count+".");
			}
		}
		
	}
}
