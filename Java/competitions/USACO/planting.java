import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class planting {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("planting.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("planting.out")));
		int n = Integer.parseInt(f.readLine());
		int[] pathNums = new int[n];
		for(int i=0;i<n-1;i++){
			String line = f.readLine();
			pathNums[Integer.parseInt(line.substring(0,line.indexOf(" ")))-1]+=1;
			pathNums[Integer.parseInt(line.substring(line.indexOf(" ")+1))-1]+=1;
		}
		int max = 0;
		for(int i=0;i<n;i++){
			if(pathNums[i]>max)
				max=pathNums[i];
		}
		out.println(max+1);
		out.close();
	}
}
