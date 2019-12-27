import java.io.*;
import java.util.*;

public class arithmetic {
	public static void main(String[] args) throws IOException{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("0000", "0"); map.put("0001", "1"); map.put("0010", "2"); map.put("0011", "3");
		map.put("0100", "4"); map.put("0101", "5"); map.put("0110", "6"); map.put("0111", "7");
		map.put("1000", "8"); map.put("1001", "9"); map.put("1010", "A"); map.put("1011", "B");
		map.put("1100", "C"); map.put("1101", "D"); map.put("1110", "E"); map.put("1111", "F");
		String s = kb.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			int temp = Integer.parseInt(s.substring(i, i+1));
			String t = Integer.toBinaryString(temp);
			while(t.length() < 3) t = "0"+t;
			sb.append(t);
		}
		while(sb.length()%4 != 0) sb.insert(0, '0');
		String real = sb.toString();
		StringBuilder ret = new StringBuilder();
		for(int i = 0; i < real.length(); i+=4){
			String temp = real.substring(i, i+4);
			ret.append(map.get(temp));
		}
		System.out.println(ret);
	}
}
