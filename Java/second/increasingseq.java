import java.util.*;
import java.io.*;

public class increasingseq {
	public static int[] leastSeq(int[][] lists){
		ArrayList<Integer> indicesLeft = new ArrayList<Integer>();
		for(int i=0;i<lists.length;i++)
			indicesLeft.add(i);
		int col = 0;
		int min = lists[col]
		for(int i=0;i<lists.length;i++){
			
		}
	}
	public static int[] constructSequence(int[] lens, int index, int max){
		int[] seq = new int[max];
		int curr = lens[index];
		seq[0] = lens[index];
		index--;
		int i=1;
		while(index>=0 && i<=max){
			if(lens[index]<curr){
				seq[i]=lens[index];
				curr = lens[index];
				i++;
			}
			index--;
		}
		return seq;
	}
	public static int maxLen(int[] arr, int i){
		int count = 1;
		int curr = arr[i];
		while(i>0){
			if(arr[i-1]<curr){
				count++;
				curr = arr[i-1];
			}
			i--;
		}
		return count;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String line = input.readLine();
		while(!line.substring(0, 1).equals("0")){
			int len = Integer.parseInt(line.substring(0, 1));
			int[] arr = new int[len];
			line = line.substring(2);
			String[] strs = line.split(" ");
			int[] nums = new int[strs.length];
			for(int i=0;i<strs.length;i++)
				nums[i] = Integer.parseInt(strs[i]);
			int[] lens = new int[nums.length];
			for(int i=0;i<lens.length;i++)
				lens[i] = maxLen(nums, i);
			int max = 0;
			ArrayList<Integer> indices = new ArrayList<Integer>();
			for(int i=0;i<nums.length;i++){
				if(lens[i]>max){
					max=lens[i];
					indices.add(i);
				}
			}
			System.out.print(max+" ");
			int[][] lists = new int[indices.size()][max];
			for(int i=0;i<lists.length;i++){
				lists[i] = constructSequence(lens, indices.get(i), max);
			}
			int[] list = leastSeq(lists);
			line = input.readLine();
			System.out.println();
		}
	}
}
