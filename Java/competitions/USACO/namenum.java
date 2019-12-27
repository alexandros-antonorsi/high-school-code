/*
ID: alexand131
LANG: JAVA
TASK: namenum
*/
 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class namenum {

	public static void main(String[] args) throws IOException {
		HashMap<Character, String> hmap = new HashMap<Character, String>();

	      /*Adding elements to HashMap*/
	      hmap.put('2', "ABC");
	      hmap.put('3', "DEF");
	      hmap.put('4', "GHI");
	      hmap.put('5', "JKL");
	      hmap.put('6', "MNO");
	      hmap.put('7', "PRS");
	      hmap.put('8', "TUV");
	      hmap.put('9', "WXY");
	      
	      
	      BufferedReader f = new BufferedReader(new FileReader("namenum.in"));
	      char[] num = f.readLine().toCharArray();
	      f.close();
	      String a="";
	        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
	  		f = new BufferedReader(new FileReader("dict.txt"));
	  		String word;
	  		int len = num.length;
	  		
	  		while((word = f.readLine())!=null){
	  			int i=0;
	  			if(word.length()!=len) continue;
	  			for(; i<len; i++){
	  				String c= hmap.get(num[i]);
	  				if(!c.contains(word.substring(i, i+1)))
	  					break;
	  			}
	  			if(i==len){
	  				a = a+word+"\n";
	  			
	  			}
	  		}
	  		if(a.length()==0) a="NONE\n";
	  		out.print(a);	
	  		out.close();
	  		f.close();
	  		
	      

	}

}
