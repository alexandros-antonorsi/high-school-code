import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class assembly {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(input.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(input.readLine());
			int[] rgs = new int[16];
			String[] inpt = new String[n];
			for(int j=0;j<n;j++){
				inpt[j] = input.readLine();
			}
			HashMap<String, Integer> labels = new HashMap<String, Integer>();
			for(int a=0;a<n;a++){
				String s = inpt[a].substring(0,3);
				if(!s.equals("mov") && !s.equals("add") && !s.equals("jne")){
					labels.put(inpt[a].substring(0, inpt[a].length()-1), a);
				}
			}
			for(int a=0;a<n;a++){
				String s = inpt[a].substring(0, 3);
				if(s.equals("add")){
					int r = Integer.parseInt(inpt[a].substring(inpt[a].indexOf("$")+1, inpt[a].indexOf(",")));
					String x = inpt[a].substring(inpt[a].indexOf(",")+2);
					if(x.substring(0, 1).equals("$")){//both regs
						int r2 = Integer.parseInt(x.substring(1));
						rgs[r-1]+=rgs[r2-1];
					}else{//one reg
						rgs[r-1]+=Integer.parseInt(x);
					}
						
				}else if(s.equals("jne")){
					int r = Integer.parseInt(inpt[a].substring(inpt[a].indexOf("$")+1, inpt[a].indexOf(",")));
					String x = inpt[a].substring(inpt[a].indexOf(",")+3);
					int r2 = Integer.parseInt(x.substring(0, x.indexOf(",")));
					if(rgs[r-1]!=rgs[r2-1]){
						a=labels.get(x.substring(x.indexOf(",")+2));
					}
				}else if(s.equals("mov")){
					int r = Integer.parseInt(inpt[a].substring(inpt[a].indexOf("$")+1, inpt[a].indexOf(",")));
					String x = inpt[a].substring(inpt[a].indexOf(",")+2);
					if(x.indexOf("$")>-1){//both regs
						rgs[r-1] = rgs[Integer.parseInt(x.substring(1))-1];
					}else{
						rgs[r-1] = Integer.parseInt(x);
					}
				}
				
			}
			for(int x: rgs){
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
