import java.util.Scanner;
public class Keyboard {
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		/*System.out.println("Enter a number.");
		int n = kb.nextInt();
		System.out.println("Twice the number is "+ 2*n);
		for(int i =1; i<=n; i++)
		{
			
			System.out.print(i+" ");
			if(i%2 == 0)
			{
				System.out.print("is even, ");
			}else{
				System.out.print("is odd, ");
			}
		}
		System.out.print(" etc.");*/
		System.out.println("What's your favorite meme?");
		String name = kb.nextLine();
		for(int i = 0; i < name.length(); i++)
		{
			System.out.println(name.substring(i, (i+1)));
		}
	}
}
