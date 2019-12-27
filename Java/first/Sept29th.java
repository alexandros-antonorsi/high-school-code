import java.util.Scanner;
public class Sept29th {
	public static void main(String args[]){
		playDice();
		int n = 1;
		bizzBuzz(n);
		guessingGame();
	}
	public static int roll2Dice(){
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
		System.out.println(a);
		System.out.println(b);
		return a+b;
	}
	public static void playDice(){
		int sum = roll2Dice();
		if(sum==4){
			System.out.println("you get 10 dorra");
		}
		else if(sum==7){
			System.out.println("you rose 7 dorra");
		}
		else if(sum==5){
			System.out.println("you get 6 dorra");
		}else{
			System.out.println("lorr again");
		}
	}
	public static void bizzBuzz(int n){
		if(n<1){
			System.out.println("GONG");
		}else{
			for(int i=1;i<=n;i++){
				if(i%3==0 && i%5==0){
					System.out.println("bizzbuzz");
				}
				else if(i%3==0){
					System.out.println("bizz");
				}
				else if(i%5==0){
					System.out.println("buzz");
				}else{
					System.out.println(i);
				}
			}
		}
	}
	public static void guessingGame(){
		Scanner input = new Scanner(System.in);
		int r = (int)(Math.random()*200)+1;
		int guesses=0;
		System.out.println("guess a number BOI");
		int g = input.nextInt();
		guesses++;
		while(g!=r && guesses<6){
			if(g>r){
				System.out.println("too high, guess again BOI");
			}else{
				System.out.println("too low, guess again BOI");
			}
			g = input.nextInt();
			guesses++;
		}
		if(g==r){
			System.out.println("YA DONE IT");
		}else{
			System.out.println("REPORTED GGWP FF@20, FAKER WOULD HAVE GOTTEN "+r);
		}
	}
}
