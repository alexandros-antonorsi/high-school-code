import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class babelfish {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		HashMap<String, String> a = new HashMap<String,String>();
		String line = input.nextLine();
		while(line.indexOf(" ")>-1){
			a.put(line.substring(line.indexOf(" ")+1), line.substring(0, line.indexOf(" ")));
			line = input.nextLine();
		}
		Collection<String> keys = a.keySet();
		while(input.hasNext()){
			line = input.next();
			if(line==null) break;
			if(keys.contains(line))
				System.out.println(a.get(line));
			else
				System.out.println("eh");
		}
		
			
	}
}
