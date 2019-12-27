import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class substitution_mania {
	public static boolean works;
	public static char[] finalCipher;
	public static HashMap<Character, Character> ogText;
	public static String[] ciphers;
	public static char[] combineCiphers(String[] ciphers, int[] order){
		char[] finalCipher = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i=0;i<order.length;i++){
			char[] newCipher = ciphers[order[i]].toCharArray();
			for(int j=0;j<26;j++){
				
				finalCipher[j]=newCipher[(int)finalCipher[j]-97];
			}
			
		}
		return finalCipher;
	}
	public static void perms(int[] n, int index, boolean[] used, int[] list){//n={0,1,2,3,4,5,6,7,8,9,10,11} at max
		if(!works && index==n.length){//generated a perm, check if sub works
			char[] fcipher = combineCiphers(ciphers,list);
			Set<Character> keys = ogText.keySet();
			for(Character x: keys){
				if(fcipher[(int)x-97]!=ogText.get(x)){
					return;
				}
			}
			finalCipher = fcipher;
			works = true;
		}
			
		for(int i=0;i<n.length;i++){
			if(!used[i]){
				used[i]=true;
				list[index]=n[i];
				perms(n,index+1, used, list);
				used[i]=false;
			}
		}
			
	}
	public static char[] inverse(){
		char[] inverse = new char[26];
		for(int i=0;i<26;i++)
			inverse[(int)finalCipher[i]-97]=(char)(i+97);
		return inverse;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		works = false;
		char[] og = input.readLine().toCharArray();
		char[] cipher = input.readLine().toCharArray();
		ogText = new HashMap<Character, Character>();
		for(int i=0;i<og.length;i++){
			if(og[i]!=' ')
				ogText.put(og[i], cipher[i]);
		}
		int n = Integer.parseInt(input.readLine());
		int[] order = new int[n]; //order in which ciphers are applied to produce ciphertext, first cipher in input is 0
		ciphers = new String[n];
		for(int i=0;i<n;i++)
			ciphers[i]=input.readLine();
		int[] nums = new int[n];
		for(int i=0;i<n;i++)
			nums[i]=i;
		boolean[] used = new boolean[n];
		perms(nums,0,used, order);
		char[] inverseCipher = inverse();
		StringBuilder end = new StringBuilder();
		String decipher = input.readLine();
		for(int i=0;i<decipher.length();i++){
			if(decipher.charAt(i)!=' ')
				end.append(inverseCipher[(int)decipher.charAt(i)-97]);
			else
				end.append(" ");
		}
		System.out.println(end);
	}
}
