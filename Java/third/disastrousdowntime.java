import java.util.Scanner;

public class disastrousdowntime {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.next()); int k = Integer.parseInt(input.next());
		int[] times = new int[n];
		for(int i=0;i<n;i++)
			times[i]=Integer.parseInt(input.next());
		int max = 1;
		for(int i=0;i<n-1;i++){
			int concurrent = 1;
			int time = times[i];
			int x = i+1;
			while(x<n&&times[x]<time+1000){
				concurrent++;
				x++;
			}
			if(concurrent>max)
				max=concurrent;
			if(max==n-i)
				break;
		}
		if(max%k!=0)
			System.out.println(max/k + 1);
		else
			System.out.println(max/k);
	}
}
