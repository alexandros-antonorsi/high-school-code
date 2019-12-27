import java.util.HashMap;
import java.util.Scanner;

public class lindenmayorsystem {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.next()); int m = Integer.parseInt(input.next());
		HashMap<String, String> rules = new HashMap<String, String>();
		for(int i=0;i<n;i++){
			String a = input.next();
			input.next();
			String b = input.next();
			rules.put(a, b);
		}
		String start = input.next();
		for(int i=0;i<m;i++){
			for(int j=0;j<start.length();j++){
				String let = start.substring(j,j+1);
				if(rules.containsKey(let)){
					String replace = rules.get(let);
					start = start.substring(0, j) + replace + start.substring(j+1);
					j+=replace.length()-1;
				}
			}
		}
		System.out.println(start);
	}
}
