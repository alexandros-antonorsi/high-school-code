import java.util.HashSet;
import java.util.Scanner;

public class engineeringenglish {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		HashSet<String> used = new HashSet<String>();
		while(input.hasNext()){
			String x = input.next();
			if(used.contains(x.toLowerCase()))
				System.out.print(". ");
			else{
				System.out.print(x+" ");
				used.add(x.toLowerCase());
			}
		}
	}
}
