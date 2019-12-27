/*
ID: alexand131
LANG: JAVA
TASK: milk
*/
import java.io.*;
import java.util.*;
class Farmer implements Comparable{
	public int price, limit;
	public Farmer(int p, int l){
		price = p;
		limit = l;
	}
	public int compareTo(Object o) {
		Farmer a = (Farmer)o;
		return price-a.price;
	}
}
public class milk {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("milk.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
		String line = f.readLine();
		int N = Integer.parseInt(line.substring(0, line.indexOf(" ")));
		int M = Integer.parseInt(line.substring(line.indexOf(" ")+1));
		ArrayList<Farmer> farmers = new ArrayList<Farmer>();
		for(int i=0;i<M;i++){
			line = f.readLine();
			int price = Integer.parseInt(line.substring(0, line.indexOf(" ")));
			int limit = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			farmers.add(new Farmer(price, limit));
		}
		Collections.sort(farmers);
		int currentMilk = 0,price = 0;
		for(int i=0;i<M;i++){
			Farmer a = farmers.get(i);
			if(currentMilk==N)
				break;
			if(a.limit<=N-currentMilk){
				currentMilk+=a.limit;
				price+=(a.price*a.limit);
			}else{
				price+=(N-currentMilk)*a.price;
				currentMilk=N;
			}
		}
		out.println(price);
		out.close();
	}
}
