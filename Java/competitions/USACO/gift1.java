/*
ID: alexand131
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;

public class gift1 {
	public static void main(String[] args) throws IOException {
		 BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
		 String line = f.readLine();
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
		 int np = Integer.parseInt(line);
		 line = f.readLine();
		 ArrayList<String> names = new ArrayList<String>();
		 ArrayList<Integer> money = new ArrayList<Integer>();
		 for(int i=0;i<np;i++){
			 names.add(line);
			 money.add(0);
			 line = f.readLine();
		 }
		 while(line!=null){ 
			 int indexGifter = names.indexOf(line);
			 line = f.readLine();
			 String total = line.substring(0,line.indexOf(" "));
			 String ppl = line.substring(line.indexOf(" ")+1);
			 int totalMoney = Integer.parseInt(total);
			 int people = Integer.parseInt(ppl);
			 if(people!=0){
				 int indivMoney = totalMoney / people;
				 int leftover = totalMoney % people;
				 line = f.readLine();
				 for(int i=0;i<people;i++){
					 int indexGifted = names.indexOf(line);
					 money.set(indexGifted, money.get(indexGifted)+indivMoney);
					 line = f.readLine();
				 }
				 money.set(indexGifter, (money.get(indexGifter)-totalMoney)+leftover);
			 }
			 else
				 line = f.readLine();
			 
		 }
		 for(int i=0;i<np;i++){
			 out.println(names.get(i) + " " + money.get(i));
		 }
		 out.close();
	}
}
