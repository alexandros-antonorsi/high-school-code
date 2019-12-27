import java.util.Scanner;

public class remote {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean[] broken = new boolean[10];
		for(int i=0;i<n;i++){
			broken[input.nextInt()] = true;
		}
		int numb = input.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i=0;i<10;i++){
			if(i==0 || !broken[i])
			for(int j=0;j<10;j++){
				if((i==0 && j==0) || !broken[j])
				for(int k=0;k<10;k++){
					if(!broken[k]){
						int x = i*100+j*10+k;
						min = Math.min(Math.abs(x-numb), min);
					}
				}
			}
		}
		System.out.println(min);
	}
}
