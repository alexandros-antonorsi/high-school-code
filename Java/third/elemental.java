import java.util.Scanner;

public class elemental {
	public static boolean elemental;
	public static void isElemental(String[] elements, String word){
		if(word.length()==0)
			elemental=true;
		if(word.indexOf(" ")==0)
			isElemental(elements, word.substring(1));
		else{
			for(int i=0;i<elements.length;i++){
				String element = elements[i];
				if(word.length()>=element.length() && word.substring(0, element.length()).equals(element)){
					isElemental(elements, word.substring(element.length()));
				}
			}
			
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		int count = 1;
		while(n!=0){
			elemental = false;
			String[] elements = input.nextLine().split(" ");
			String line = input.nextLine();
			isElemental(elements, line);
			if(elemental){
				System.out.println("Phrase #"+count+": Elemental");
				System.out.println();
			}
			else{
				System.out.println("Phrase #"+count+": Not Elemental");
				System.out.println();
			}
			count++;
			n= Integer.parseInt(input.nextLine());
		}
	}
}
/*
3
c ca at
cat
6
ba s sc ca n no
bass cannon
6
i am c co o la
cool
6
u pa p s y ru
papyrus
6
pa p y ru u s
papyr us
3
n a y
nanny
1
p
papyrus
0
*/