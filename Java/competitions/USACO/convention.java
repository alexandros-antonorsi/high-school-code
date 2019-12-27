import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class convention {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("convention.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("convention.out")));
		String[] line = f.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		int c = Integer.parseInt(line[2]);
		int[] times = new int[n];
		line = f.readLine().split(" ");
		for(int i=0;i<n;i++){
			times[i] = Integer.parseInt(line[i]);
		}
		Arrays.sort(times);
		int[] diffs = new int[n-1];
		for(int i=0;i<n-1;i++){
			diffs[i]=times[i+1]-times[i];
		}
		int max = 0;
		for(int i=0;i<n-1;i++){
			if(diffs[i]>max)
				max=diffs[i];
		}
		System.out.println(max);
	}
}
