import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class recount {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,Integer> votes = new HashMap<String,Integer>();
		String line = input.readLine();
		while(!line.equals("***")){
			if(!votes.containsKey(line)){
				votes.put(line, 1);
			}else{
				votes.put(line, (int)votes.get(line)+1);
			}
			line = input.readLine();
		}
		int max = 0;
		String name = "";
		for(String a : votes.keySet()){
			if(votes.get(a)>max){
				max = votes.get(a);
				name = a; 
			}
		}
		votes.remove(name);
		if(votes.containsValue(max)){
			System.out.println("Runoff!");
		}else{
			System.out.println(name);
		}
		
	}
}
