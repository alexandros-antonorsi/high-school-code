import java.util.Scanner;

public class cargame {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.next());
		int m = Integer.parseInt(input.next());
		String[] dict = new String[n];
		for(int i=0;i<n;i++)
			dict[i] = input.next();
		for(int i=0;i<m;i++){
			String chars = input.next().toLowerCase();
			boolean found = false;
			for(int j=0;j<n;j++){
				String word = dict[j];
				if(word.length()<3)
					continue;
				int a = word.indexOf(chars.substring(0,1));
				String temp = word.substring(a+1);
				if(a>-1 && temp.length()>0){
					int b = temp.indexOf(chars.substring(1,2));
					temp = temp.substring(b+1);
					if(b>-1 && temp.length()>0){
						int c = temp.indexOf(chars.substring(2));
						temp = temp.substring(c+1);
							if(c>-1){
								System.out.println(word);
								found = true;
								break;
							}
								
					}
				}
				
			}
			if(!found)
				System.out.println("No valid word");
			
		}
	}
}
