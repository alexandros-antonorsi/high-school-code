import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class whatdoesitmean {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] line = input.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		String word = "."+line[1];
		long[] dp = new long[word.length()]; dp[0]=1;
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		for(int i=0;i<n;i++){
			line = input.readLine().split(" ");
			dict.put(line[0], Integer.parseInt(line[1]));
		} 
		Set<String> keys = dict.keySet();
		for(int i=0;i<dp.length;i++){
			for(String key: keys){
				if(i+key.length()+1<=word.length() && key.equals(word.substring(i+1, i+key.length()+1))){
					dp[i+key.length()]+=(dict.get(key)*dp[i])%1000000007;
				}
			}
		}
		System.out.println(dp[dp.length-1]%1000000007);
	}
}
