import java.util.Scanner;

public class troll {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = Integer.parseInt(input.next());
		for(int i=0;i<t;i++){
			long s = Integer.parseInt(input.next());
			long v = Integer.parseInt(input.next());
			long total = 0;
			while(s>0){
				if(s%2==1){
					total += v;
				}
				s/=2;
				v*=2;
			}
			System.out.println("Situation #"+i+":"+total);
		}
	}
	
}
