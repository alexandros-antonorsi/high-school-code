import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class tugofwar {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] players = new int[n];
		int[] teams = new int[5];
		for(int i=0;i<n;i++)
			players[i]=input.nextInt();
		Arrays.sort(players);
		players = reverse(players,n);
		for(int i=0;i<n;i++){
			if((i/5)%2==0){
				teams[i%5]+=players[i];
			}else{
				teams[4-i%5]+=players[i];
			}
		}
		String[] ppl = {"Arup","Matt","Travis","Eric","Timothy"};
		int max = 0;
		int in = 0;
		for(int i=0;i<5;i++){
			if(teams[i]>max){
				max=teams[i];
				in=i;
			}
		}
		System.out.println(ppl[in]);
	}
	static int[] reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
        return b;
    } 
}
