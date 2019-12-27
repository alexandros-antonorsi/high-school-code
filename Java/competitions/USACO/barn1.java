/*
ID: alexand131
LANG: JAVA
TASK: barn1
*/
import java.io.*;
import java.util.*;

public class barn1 {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("barn1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
		String line = f.readLine();
		String secondSpaceLine = line.substring(line.indexOf(" ")+1);
		int M = Integer.parseInt(line.substring(0, line.indexOf(" ")));
		int S = Integer.parseInt(secondSpaceLine.substring(0,secondSpaceLine.indexOf(" ")));
		int C = Integer.parseInt(secondSpaceLine.substring(secondSpaceLine.indexOf(" ")+1));
		boolean[] stalls = new boolean[S]; // true = occupied
		ArrayList<Integer> cows = new ArrayList<Integer>();
		for(int i=0;i<C;i++){
			line = f.readLine();
			cows.add(Integer.parseInt(line));
		}
		Collections.sort(cows);
		int first = cows.get(0);
		int last = cows.get(C-1);
		for(int i=0;i<C;i++){
			stalls[cows.get(i)-1]=true;
		}
		//start with one large board covering min->max stalls occupied. then figure out where all the possible cuts in the board are
		ArrayList<Integer> gapSizes = new ArrayList<Integer>();
		int pos = first;
		for(int i=0;i<S;i++){
			int maxGap = 0;
			for(;pos<last;pos++){
				int tempGap = 0;
				while(pos<last && !stalls[pos]){
					tempGap++;
					pos++;
				}
				gapSizes.add(tempGap);
			}
		}
		Collections.sort(gapSizes);
		//now there's a list of all the possible gaps, so sort them in ascending order and take the M-1 biggest ones
		int total = (last-first)+1;
		int gaps = 0;
		//System.out.println(gapSizes);
		if(gapSizes.size()-M<0){
			M=gapSizes.size()+1;
		}
		for(int i=gapSizes.size()-1;i>gapSizes.size()-M;i--){
			gaps+=gapSizes.get(i);
		}
		out.println(total-gaps);
		out.close();
	}
}
