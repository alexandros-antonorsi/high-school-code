import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class notamused {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		HashMap<String, Double> log;
		int x=0;
		while(input.hasNext()){
			if(input.next().equals("OPEN")){
				x++;
				log = new HashMap<String, Double>();
				String word = input.next();
				while(!word.equals("CLOSE")){
					String name = input.next();
					if(word.equals("ENTER")){
						if(log.containsKey(name)){
							log.put(name, log.get(name)-Double.parseDouble(input.next()));
						}else{
							log.put(name, -Double.parseDouble(input.next()));
						}	
					}else{
						log.put(name, Double.parseDouble(input.next())+log.get(name));
					}
					word = input.next();
				}
				Object[] keyset = log.keySet().toArray();
				Arrays.sort(keyset);
				NumberFormat formatter = NumberFormat.getCurrencyInstance();

				System.out.println("Day "+x);
				for(int i=0;i<log.size();i++){
					String a = (String)keyset[i] ;
					System.out.println(a+" "+formatter.format((log.get(a)*0.1)));
				}
				System.out.println();
			}
			
			
		}
	}
}
