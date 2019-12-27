import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class measurement {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new FileReader("measurement.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("measurement.out")));
		int n = Integer.parseInt(input.readLine());
		String[] days = new String[100];
		for(int i=0;i<n;i++){
			String line = input.readLine();
			days[Integer.parseInt(line.substring(0, line.indexOf(" ")))-1] = line.substring(line.indexOf(" ")+1);
			
		}
		int[] cows = {7,7,7}; //Bessie, Elsie, Mildred
		int count = 0;
		boolean[] currDisplay = new boolean[3];
		for(int i=0;i<100;i++){
			if(days[i]!=null){
				String cow = days[i].substring(0, days[i].indexOf(" "));
				int add = Integer.parseInt(days[i].substring(days[i].indexOf(" ")+1));
				if(cow.equals("Bessie"))
					cows[0]+=add;
				else if(cow.equals("Elsie"))
					cows[1]+=add;
				else
					cows[2]+=add;
				int nextMax = cows[0];
				boolean[] nextDisplay = new boolean[3];
				for(int x=0;x<3;x++){
					if(cows[x]>nextMax)
						nextMax=cows[x];
				}
				for(int x=0;x<3;x++){
					if(cows[x]==nextMax)
						nextDisplay[x]= true;
				}
				for(int x=0;x<3;x++)
					if(nextDisplay[x]!=currDisplay[x]){
						count++;
						break;
					}
				currDisplay = nextDisplay;
			}
		}
		out.println(count);
		out.close();
	}
}
