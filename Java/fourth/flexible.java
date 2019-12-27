import java.util.Scanner;
import java.util.TreeSet;

public class flexible {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int width = input.nextInt();
		int num = input.nextInt();
		TreeSet<Integer> widths = new TreeSet<Integer>();
		int[] part = new int[num+2];
		part[0]=0; part[num+1]=width;
		for(int i=1;i<num+1;i++){
			part[i]=input.nextInt();
		}
		for(int i=0;i<part.length;i++){
			for(int j=i+1;j<part.length;j++){
				widths.add(part[j]-part[i]);
			}
		}
		for(Integer x: widths)
			System.out.print(x+" ");
	}
}
