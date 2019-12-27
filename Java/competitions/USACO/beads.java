/*
ID: alexand131
LANG: JAVA
TASK: beads
*/
import java.io.*;
import java.util.*;

public class beads {
	public static void main(String[] args) throws IOException {
		 BufferedReader f = new BufferedReader(new FileReader("beads.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
		 int n = Integer.parseInt(f.readLine());
		 String bead = f.readLine();
		 int max=0, tempCW = 0, tempCCW = 0;
		 int posOfSplit = 0;
		 for(int i=0;i<n;i++){
			 tempCW = countClockwise(bead, i);
			 tempCCW = countCClockwise(bead, i);
			 if(tempCW==bead.length()){
				 out.println(bead.length());
				 out.close();
				 return;
			 }
			 //out.println(tempCW+"+"+tempCCW);
			 if(tempCW+tempCCW>max){
				 max=tempCW+tempCCW;
			 }
		 }
		out.println(max);
		out.close();
	}
	public static int countClockwise(String bead, int split){
		char start = bead.charAt(split);
		int length = bead.length();
		if(start=='w'){
			int nocrash =0;
			int temp = split;
			while(bead.charAt(temp)=='w'){
				temp++;
				if(temp==length)
					temp=0;
				if(nocrash==length)
					return length;
				nocrash++;
			}
			start = bead.charAt(temp);
			
		}
		int count = 0;
		bead = bead + bead;
		while(split<bead.length() && ((bead.charAt(split)=='w') || bead.charAt(split)==start)){
			if(count==length)
				return count;
			count++;
			split++;
		}
		return count;
	}
	public static int countCClockwise(String bead, int split){
		int length = bead.length();
		int count = 0;
		bead = bead + bead;
		if(split!=0)
			split-=1;
		char start = bead.charAt(split);
		if(start == 'w'){
			int nocrash = 0;
			int temp = split;
			while(temp>0 && bead.charAt(temp)=='w'){
				temp--;
				if(temp==0)
					temp=bead.length()-1;
				if(nocrash==length)
					return length;
				nocrash++;
			}
			start = bead.charAt(temp);
		}
		while(split>=0 && (((bead.charAt(split)=='w') || bead.charAt(split)==start))){
			if(count==length)
				return count;
			count++;
			split--;
			//if(split==0)
				//return count;
				//split=bead.length()-1;
		}
		return count;
	}
}
