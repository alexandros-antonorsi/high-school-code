import java.util.Scanner;

public class broken_swords {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		int[] num = new int[4]; //TBLR
		for(int i=0;i<n;i++){
			String line = input.nextLine();
			for(int j=0;j<4;j++)
				num[j]+=1-Integer.parseInt(line.substring(j, j+1));
		}
		int swords = Math.min((num[0]+num[1])/2, (num[2]+num[3])/2);
		int tbLeft = num[0]+num[1]-2*swords;
		int lrLeft = num[2]+num[3]-2*swords;
		System.out.println(swords+" "+tbLeft+" "+lrLeft);
	}
}
