import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class milktemp {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new FileReader("milktemp.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milktemp.out")));
		//fix input
		int n = input.read(); int x = input.read(); int y = input.read(); int z = input.read(); 
		int[][] cows = new int[n][2];
		int min = 0; int max = 1000000000;
		for(int i=0;i<n;i++){
			int a = input.read(); int b = input.read();
			if(a<min)
				min=a;
			if(b>max)
				max=b;
			cows[i][0] = a;
			cows[i][1] = b;
		}
		int maxmilk = 0;
		for(int i=min;i<=max;i++){
			int curr = 0;
			for(int j=0;j<n;j++){
				if(i<cows[j][0])
					curr+=x;
				else if(i>cows[j][1])
					curr+=z;
				else
					curr+=y;
			}
			if(curr>maxmilk)
				maxmilk = curr;	
		}
		out.println(maxmilk);
		out.close();
	}
}
