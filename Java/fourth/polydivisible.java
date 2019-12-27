import java.util.Scanner;

public class polydivisible {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c=0;
		for(int i=a;i<=b;i++){
			if(a<=100)
				c++;
			else{
				char[] digs = Integer.toString(i).toCharArray();
				int num = digs[0]+10*digs[1];
				for(int x=3;x<=digs.length;x++){
					num+=Math.pow(10, x)*digs[x-1];
					if(!(num%x==0 || (num+1)%x==0 || (num-1)%x==0))
						break;
				}
			}
		}
		System.out.println(c);
	}
}
