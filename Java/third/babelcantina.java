import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class babelcantina {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.next());
		HashMap<String, Integer> languages = new HashMap<String, Integer>();
		for(int i=0;i<n;i++){
			
			String[] line = input.nextLine().split(" ");
			for(int x=1;x<line.length;x++){
				if(languages.containsKey(line[i])){
					languages.put(line[i], languages.get(line[i])+1);
				}else{
					languages.put(line[i], 1);
				}
			}
			
		}
		Collection<Integer> nums = languages.values();
		int max = 0;
		for(Integer a: nums){
			if(a>max)
				max=a;
		}
		System.out.println(n-max);
	}
}
