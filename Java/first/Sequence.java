import java.util.Scanner;
public class Sequence {	
	
	private final int len=4;
	private int[] sequence=new int[len];
	
	public Sequence(boolean a){
		Scanner input = new Scanner(System.in);
		if(a){
			System.out.println("Enter 4 digits in the range [1,7]");
			for(int i=0;i<len;i++){
				sequence[i]=input.nextInt();
			}
		}else{
			for(int i=0;i<len;i++){
				int x=(int)(Math.random()*7)+1;
				while(contains(x)){
					x=(int)(Math.random()*7)+1;
				}
				sequence[i]=x;
			}
		}
	}
	public int[] getSequence(){
		return sequence;
	}
	public int getLength(){
		return len;
	}
	public boolean contains(int num){
		for(int i=0;i<len;i++){
			if(sequence[i]==num){
				return true;
			}
		}
		return false;
	}
	public String toString(){
		String str = "";
		for(int i=0;i<len;i++){
			str = str+sequence[i]+" ";
		}
		return str;
	}
}
