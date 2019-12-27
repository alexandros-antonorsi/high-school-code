import java.util.Scanner;

public class polycarpdiv3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int size = s.length();
		int count = 0;
		boolean[] counted = new boolean[size];
		for(int i=0;i<size;i++){
			if((int)s.charAt(i)%3==0){
				count++;
				counted[i]=true;
			}
		}
		for(int i=0;i<size-1;i++){
			if(!counted[i] && !counted[i+1] && Integer.parseInt(s.substring(i,i+2))%3==0){
				counted[i]=true;
				counted[i+1]=true;
				count++;
			}
		}
		for(int i=0;i<size-2;i++){
			if(!counted[i] && !counted[i+1] && !counted[i+2] && Integer.parseInt(s.substring(i,i+3))%3==0){
				counted[i]=true;
				counted[i+1]=true;
				counted[i+2]=true;
				count++;
			}
		}
		System.out.println(count);
	}
}
