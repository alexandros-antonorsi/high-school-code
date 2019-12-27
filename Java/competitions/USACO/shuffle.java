import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class shuffle {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new FileReader("shuffle.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
		int n = Integer.parseInt(input.readLine());
		String[] s = input.readLine().split(" ");
		int[] shuffle = new int[n];
		for(int i=0;i<n;i++)
			shuffle[i] = Integer.parseInt(s[i])-1;
		String[] finalcows = input.readLine().split(" ");
		int[] camefrom = new int[n];//a cow in position i came from the position camefrom[i]
		for(int i=0;i<n;i++){
			camefrom[shuffle[i]] = i;
		}
		HashMap<String, Integer> cows = new HashMap<String, Integer>();//key = cow ID, value = cow position
		for(int i=0;i<n;i++){
			cows.put(finalcows[i], i);
		}
		for(int i=0;i<3;i++){
			for(int x=0;x<n;x++){
				String cow = finalcows[x];
				cows.put(cow, camefrom[cows.get(cow)]);
			}
		}
		String[] initial = new String[n];
		for(int i=0;i<n;i++){
			initial[cows.get(finalcows[i])] = finalcows[i];
		}
		for(int i=0;i<n;i++)
			out.println(initial[i]);
		out.close();
	}
}
