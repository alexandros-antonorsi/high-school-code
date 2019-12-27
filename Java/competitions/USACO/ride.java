/*
ID: alexand131
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer st = new StringTokenizer(f.readLine());
						  // Get line, break into tokens
    String comet = st.nextToken();    // comet id
    st = new StringTokenizer(f.readLine());
    String group = st.nextToken();    // group id
    int comProd=1, groupProd=1;
    for(int i=0;i<comet.length();i++){
    	comProd*=((int)(comet.charAt(i))-64);
    }
    for(int i=0;i<group.length();i++){
    	groupProd*=((int)(group.charAt(i))-64);
    }
    if(comProd%47==groupProd%47){
    	out.println("GO");
    }else{
    	out.println("STAY");
    }                          // output result
    out.close();                                  // close the output file
  }
}
