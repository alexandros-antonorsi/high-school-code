import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class busyschedule {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(input.readLine());
		while(n>0){
		int[] times = new int[n];
		for(int i=0;i<n;i++){
			times[i]=timeToInt(input.readLine());
		}
		Arrays.sort(times);
		for(int x: times)
			System.out.println(intToTime(x));
		System.out.println();
		n=Integer.parseInt(input.readLine());
		}
	}
	public static int timeToInt(String s){
		int ind = s.indexOf(":");
		int hours = Integer.parseInt(s.substring(0, ind))%12;
		int mins = Integer.parseInt(s.substring(ind+1, ind+3));
		String post = s.substring(s.length()-4);
		int time = hours*60+mins;
		if(post.equals("p.m."))
			time+=7200;
		return time;
	}
	public static String intToTime(int n){
		String hours = ""+n/60;
		String min = ""+n%60;
		String post = "a.m.";
		if(n/60>=12){
			hours = ""+(n/60)%12;
			post = "p.m.";
		}
		if(hours.equals("0"))
			hours="12";
		if(min.length()==1)
			min="0"+min;
		return hours+":"+min+" "+post;
	
	}
	
}
