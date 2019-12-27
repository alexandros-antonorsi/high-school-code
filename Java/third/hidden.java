import java.util.Scanner;

public class hidden {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String pass = input.next();
		String message = input.next();
		int[] indices = new int[pass.length()];
		for(int i =0;i<pass.length();i++){
			for(int j=i;j<pass.length();j++){
				indices[j] = message.indexOf(pass.substring(j,j+1));
			}
			int x = i+1;
			while(x<pass.length()){
				if(indices[i]>indices[x] || indices[i]<0 || indices[x]<0){
					System.out.println("FAIL");
					return;
				}
				x++;
			}
			message = message.substring(message.indexOf(pass.substring(i,i+1))+1);
		}
		System.out.println("PASS");
	}
}
