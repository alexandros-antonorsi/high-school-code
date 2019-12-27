import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class dinner {
	public static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	public static int[] pri = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
	public static int[] sqrs = {0,1,4,9,16,25,36,49};
	public static double vowelNum(String name){
		TreeSet<Character> vows = new TreeSet<Character>();
		name = name.toLowerCase();
		for(int i=0;i<5;i++){
			vows.add(vowels[i]);
		}
		double vownum = 0;
		for(int i=0;i<name.length();i++){
			char a = name.charAt(i);
			if(a=='y'){
				vownum+=0.5;
			}
			else if(vows.contains(a))
				vownum++;
		}
		return vownum;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		TreeSet<Integer> primes = new TreeSet<Integer>();
		TreeSet<Integer> squares = new TreeSet<Integer>();
		ArrayList<String> validNames;
		for(int i=0;i<15;i++)
			primes.add(pri[i]);
		for(int i=0;i<8;i++)
			squares.add(sqrs[i]);
		
		
		for(int i=0;i<n;i++){
			validNames = new ArrayList<String>();
			int valid = 0;
			int r = Integer.parseInt(input.nextLine());
			for(int j=0;j<r;j++){
				String name = input.nextLine();
				double vownum = vowelNum(name);
				if(primes.contains(name.length()) && vownum == (int)vownum && vownum%2!=0){
					valid++;
					validNames.add(name);
				}else if(squares.contains(name.length()) && vownum == (int)vownum && squares.contains((int)vownum)){
					valid++;
					validNames.add(name);
				}	
			}
			if(valid==0)
			System.out.println("Practice #"+(i+1)+": It's hopeless!");
			else{
				System.out.println("Practice #"+(i+1)+": "+valid+" valid options");
				for(int l=0;l<valid;l++){
					System.out.println(validNames.get(l));
				}
			}
			if(i!=n-1)
				System.out.println();
		}
		
	}
}
