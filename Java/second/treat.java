import java.util.Scanner;

public class treat {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i=0;i<t;i++){
			int m = input.nextInt(); int n = input.nextInt();
			int[] houses = new int[m];
			int[] vals = new int[m-(n-1)];
			for(int j=0;j<m;j++)
				houses[j] = input.nextInt();
			for(int j=0;j<m-(n-1);j++){
				for(int x=j;x<n+j;x++)
					vals[j]+=houses[x];
			}
			int max = 0;
			for(int j=0;j<m-(n-1);j++){
				if(vals[j]>max)
					max=vals[j];
			}
			System.out.println(max);
		}
	}
}
