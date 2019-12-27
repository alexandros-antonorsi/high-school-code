import java.util.Scanner;

public class daylight {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		for(int i=0;i<n;i++){
			String[] arr = input.nextLine().split(" ");
			int jump = Integer.parseInt(arr[1]);
			int hr = Integer.parseInt(arr[2]);
			int min = Integer.parseInt(arr[3]);
			int tot = hr*60+min;
			if(arr[0].equals("F")){
				tot+=jump;
			}else{
				tot-=jump;
			}
			if(tot<0)
				tot+=1440;
			System.out.println((tot/60)%24+" "+tot%60);
		}
	}
}
