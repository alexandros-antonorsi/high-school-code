import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class city {
	public static void main(String[] args) throws IOException{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		int dogger = kb.read();
		ArrayList<Place> cities = new ArrayList<Place>();
		for(int i = 0; i<dogger; i++){
			int pupper = kb.read();
			for(int j = 0; j<pupper; j++){
				String city = kb.readLine();
				cities.add(new Place(city));
			}
			for(int j = 0; j<pupper; j++){
				ArrayList<Integer> costs = new ArrayList<Integer>();
				for(int k = 0; k<pupper; k++){
					int a = kb.read();
					costs.add(a);
				}
				cities.get(j).setCosts(costs);
			}
		}
		//System.out.println(processInfo(cities));
	}
	public String processInfo(ArrayList<Place> a){
		return a.get(0).getName();
	}
}
	class Place{
		private int numTeachers, costHotel;
		private String name;
		private static int num;
		private ArrayList<Integer> costs;
		public Place(String x){
			String fSplit = x.substring(x.indexOf(" ")+1);
			name = x.substring(0, x.indexOf(" ")+1);
			numTeachers = Integer.parseInt(fSplit.substring(0, fSplit.indexOf(" ")));
			costHotel = Integer.parseInt(fSplit.substring(fSplit.indexOf(" ")+1));
			num++;
		}
		public String getName(){
			return name;
		}
		public int getTeachers(){
			return numTeachers;
		}
		public int getHCost(){
			return costHotel;
		}
		public void setCosts(ArrayList<Integer> c){
			costs = c;
		}
		public ArrayList<Integer> getCosts(){
			return costs;
		}
		public int getNum(){
			return num;
		}
	}
