import java.util.*;
public class sorting {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<Integer> sum = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int g = input.nextInt();
			ArrayList<Integer> nums = new ArrayList<Integer>();
			for(int j=0;j<g;j++){
				int a = input.nextInt();
				nums.add(a);
			}
			sum.add(sum(nums));
		}
		for(int a: sum){
			System.out.println(a);
		}
	}
	public static int sum(ArrayList<Integer> nums){
		Collections.sort(nums);
		ArrayList<Integer> sums = new ArrayList<Integer>();
		while(nums.size()>1){
			int[] smallest2 = smallest2(nums);
			int sum = smallest2[0]+smallest2[1];
			sums.add(sum);
			nums.add(0,sum);
		}
		int end = 0;
		for(int a: sums){
			end+=a;
		}
		return end;
	}
	public static int[] smallest2(ArrayList<Integer> nums){
		int[] end = new int[2];
		int a = nums.get(0);
		for(int n: nums){
			if(n<a){
				a=n;
			}
		}
		end[0]=a;
		nums.remove((Integer)a);
		a = nums.get(0);
		for(int n: nums){
			if(n<a){
				a=n;
			}
		}
		end[1]=a;
		nums.remove((Integer)a);
		return end;
	}
	
}
