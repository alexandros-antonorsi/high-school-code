import java.util.Scanner;

public class good_messages {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		char[] msg = input.nextLine().toCharArray();
		int r = Integer.parseInt(input.nextLine());
		int bad = 0;
		for(int i=0;i<r;i++){
			for(int j=0;j<msg.length;j++){
				msg[j] = (char)(((int)msg[j]-97+n)%26+97);
			}
			int vowels = 0; int cons = 0;
			for(int j=0;j<msg.length;j++){
				if(msg[j]=='a' || msg[j]=='e' || msg[j]=='i' || msg[j]=='o' || msg[j]=='u' || msg[j]=='y')
					vowels++;
				else
					cons++;
			}
			if(vowels>=0.5*cons)
				bad++;
		}
		int good = r-bad;
		if(good>bad)
			System.out.println("Boris");
		else
			System.out.println("Colleague");
	}
}
