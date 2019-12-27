import java.util.Scanner;
public class PlayMasterMind {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name summoner?");
		MasterMind dong = new MasterMind(input.nextLine());
	}
}
