import java.util.*;

public class paper {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		ArrayList<Integer> memes = new ArrayList<Integer>();
		int x = kb.nextInt();
		for(int i = 0; i<x; i++){
			int a = kb.nextInt();
			int temp = 0;
			for(int j = 0; j<a; j++){
				int p1 = kb.nextInt();
				double p2 = kb.nextInt();
				double p3 = p2/4;
				if(p3%1!=0)
					p3 = (int)p3 + 1;
				temp = temp + (int)(p3*p1);
			}
			memes.add(temp);
		}
		for(int qwe: memes)
			System.out.println(qwe);
	}
}
