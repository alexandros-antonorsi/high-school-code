import java.util.Scanner;
public class Wednesday {
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		String n1;
		String n2;
		System.out.println("What is your first name?");
		n1 = kb.nextLine();
		System.out.println("What is your last name?");
		n2 = kb.nextLine();
		String first = n1.substring(0,1);
		String last = n2.substring(0,1);
		String rest1 = n1.substring(1,n1.length());
		String rest2 = n2.substring(1,n2.length());
		System.out.println("Your innitials are: " + first + "." + last);
		String backwards = ("AND YOUR NAME IS " + last + rest1 + " " + first + rest2 );
		System.out.println("GIVE ME A NUMBER");
		double num = kb.nextDouble();
		for(int i=0;i<num; i++){
			
			for(int n=0;n<num; n++){
				System.out.print(backwards +"\t");
			}
			System.out.println();
		}

		
	}
}
