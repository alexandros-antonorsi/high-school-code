/*
ID: alexand131
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.*;

class friday {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("friday.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
    int n = Integer.parseInt(f.readLine());
    int[] week = {1,0,0,0,0,0,0};
    int index = 0;
   	for(int x=0;x<n;x++){
   		for(int y=1;y<13;y++){
   			int days = 31;
   			if(y == 2 && (x+1900)%4 == 0 && ((x+1900)%100 !=0 || (x+1900)%400==0))
   				days = 29;
    		else if(y==2)
    		    days = 28;
    		if(y == 4 || y == 6 || y == 9 || y == 11)
    		    days = 30;
    		index += (days % 28);
    		index %= 7;
    		week[index] += 1;
   		}
   	}
   week[index]-=1;
   for(int a=0;a<week.length;a++)
	   if(a<week.length-1)
		   out.print(week[a]+" ");
	   else
		   out.println(week[a]);
   out.close();
  }
}
