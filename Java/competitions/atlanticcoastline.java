import java.util.Scanner;

public class atlanticcoastline {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			int engines = input.nextInt();
			int cars = input.nextInt();
			int speed = 80;
			for(int j=0;j<cars;j++){
				speed -= (input.nextInt()/engines);
			}
			if(speed<0)
				System.out.println(0);
			else
				System.out.println(speed);
		}
	}
}
