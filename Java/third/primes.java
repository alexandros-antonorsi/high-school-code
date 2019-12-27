import java.util.Scanner;
import java.util.TreeSet;

public class primes {
	public static TreeSet<Long> tree;
	public static void generate(int[] primes, long num, long min, long max, int index){
		if(num<=max){
			if(num>=min)
				tree.add(num);
			for(int i=index;i<primes.length;i++){
				generate(primes, num*primes[i], min, max, i);
			}
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while(n!=0){
			tree = new TreeSet<Long>();
			int[] primes = new int[n];
			for(int i=0;i<n;i++){
				primes[i] = input.nextInt();
			}
			long x = input.nextLong();
			long y = input.nextLong();
			generate(primes, 1, x, y, 0);
			if(tree.isEmpty())
				System.out.println("none");
			else{
				int size = tree.size();
				for(int i=0;i<size-1;i++)
					System.out.print(tree.pollFirst()+",");
				System.out.println(tree.pollFirst());
			}
			n = input.nextInt();
		}
			
	}
	
}
