import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
class cow{
	public int time;
	public int seniority;
	public int duration;
}
public class convention2 {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("convention2.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("convention2.out")));
		int n = Integer.parseInt(f.readLine());
		ArrayList<cow> cows = new ArrayList<cow>();
		for(int i=0;i<n;i++){
			String[] line = f.readLine().split(" ");
			cow a = new cow();
			a.time = Integer.parseInt(line[0]);
			a.duration = Integer.parseInt(line[1]);
			a.seniority = i;
			cows.add(a);
		}
		ArrayList<cow> waiting = new ArrayList<cow>();
		ArrayList<Integer> waits = new ArrayList<Integer>();
		cow next = getSoonest(cows);
		cows.remove(next);
		cow curr = next;
		int newT = curr.time+curr.duration;
		while(cows.size()!=1){
			for(int i=0;i<cows.size();i++){
				cow a = cows.get(i);
				if(a.time<newT){
					cows.remove(a);
					waiting.add(a);
				}
			}
			if(waiting.size()!=0){
				next = getSenior(waiting);
				waits.add(newT-next.time);
				curr=next;
				waiting.remove(next);
				newT += curr.duration;
			}else{
				next=getSoonest(cows);
				waits.add(newT-next.time);
				curr=next;
				waiting.remove(next);
				newT=curr.time+curr.duration;
			}
		}
		int max = 0;
		for(Integer x: waits)
			if(x>max)
				max=x;
		out.println(max);
		out.close();
	}
	public static cow getSoonest(ArrayList<cow> cows){
		int min = Integer.MAX_VALUE;
		cow a = cows.get(0);
		for(cow x: cows)
			if(x.time<min){
				min=x.time;
				a=x;
			}else if(x.time==min && x.seniority<a.seniority){
				min=x.time;
				a=x;
			}
					
		return a;
	}
	public static cow getSenior(ArrayList<cow> cows){
		int min = Integer.MAX_VALUE;
		cow a = cows.get(0);
		for(cow x: cows)
			if(x.seniority<min){
				min=x.seniority;
				a=x;
			}	
		return a;
	}
}
