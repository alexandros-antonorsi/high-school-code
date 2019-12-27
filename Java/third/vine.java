import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class vine {
	public static long[][] skepticism;
	public static HashMap<String, Integer> names;
	public static TreeSet<Integer>[] connections;
	public static boolean[] heard;
	public static int n;
	public static void spread(){
		for(int i=0;i<n;i++)
			if(!heard[i] && skepticism[i][0]>=skepticism[i][1])
				heard[i] = true;
			
		
		for(int i=0;i<n;i++)
			if(heard[i]){
				int a = connections[i].size();
				for(int j=0;j<a;j++)
					skepticism[connections[i].pollFirst()][0]++;
			}
			
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		n = Integer.parseInt(input.next()); int m = Integer.parseInt(input.next()); int d = Integer.parseInt(input.next());
		skepticism = new long[n][2];
		names = new HashMap<String, Integer>();
		connections = new TreeSet[n];
		heard = new boolean[n];
		for(int i=0;i<n;i++){
			String name = input.next();
			int skept = Integer.parseInt(input.next());
			names.put(name, i);
			skepticism[i][1] = skept;
			connections[i] = new TreeSet<Integer>();
		}
		for(int i=0;i<m;i++){
			int n1 = names.get(input.next());
			int n2 = names.get(input.next());
			connections[n1].add(n2);
			connections[n2].add(n1);
		}
		String first = input.next();
		for(int i=0;i<d;i++)
			spread();

		int x = 0;
		int a = names.get(first);
		for(int i=0;i<n;i++){
			if(i!=a && skepticism[i][0]>0)
				x++;
		}
		System.out.println(x);
		
	}
}
/*
3 2 1
Alice 0
Bob 1
Carol 1
Alice Bob
Bob Carol
Alice

5 5 3
Alice 0
Bob 1
Carol 1
Dan 3
Erin 1
Alice Bob
Alice Carol
Bob Dan
Carol Dan
Dan Erin
Alice

*/
