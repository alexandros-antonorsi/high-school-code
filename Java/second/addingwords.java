import java.util.*;
import java.io.*;

public class addingwords {
	public static int eval(String eq){
		while(eq.indexOf("+")>-1 || eq.indexOf("-")>-1){
			//System.out.println(eq);
			String f = eq.substring(0, eq.indexOf(" "));
			int first = Integer.parseInt(f);
			String temp = eq.substring(eq.indexOf(" ")+1);
			String temp2 = temp.substring(temp.indexOf(" ")+1);
			String s = temp2.substring(0, temp2.indexOf(" "));
			int second = Integer.parseInt(s);
			String op = temp.substring(0,  temp.indexOf(" "));
			if(op.equals("+"))
				eq = "" + (first+second)+ eq.substring(f.length()+3+s.length());
			else
				eq = "" + (first-second)+ eq.substring(f.length()+3+s.length());
		}
		return Integer.parseInt(eq.substring(0,eq.indexOf(" ")));
	}
	public static void main(String[] args){
		//BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> variables = new HashMap<String, Integer>();
		while(input.hasNext()){
			String line = "";
			String token = input.next();
			if(token.equals("def")){
				line += token+" "+input.next()+" "+input.next();			
			}
			else if(token.equals("calc")){
				while(!token.equals("=")){
					line+=token+" ";
					token = input.next();
				}
				line+="=";
			}
			else
				line = token;
			//System.out.println(line);
			if(line.equals("clear")){
				variables = new HashMap<String, Integer>();
			}
			else if(line.substring(0, line.indexOf(" ")).equals("def")){
				line = line.substring(line.indexOf(" ")+1);
				String key = line.substring(0, line.indexOf(" "));
				int value = Integer.parseInt(line.substring(line.indexOf(" ")+1));
				variables.put(key, value);
			}
			else{
				boolean unknown = false;
				String fin = line.substring(line.indexOf(" ")+1);
				String temp = fin;
				String equation = "";
				while(!temp.equals("=")){
					if(temp.substring(0, temp.indexOf(" ")).equals("+") || temp.substring(0, temp.indexOf(" ")).equals("-")){
						equation += temp.substring(0, temp.indexOf(" "))+" ";
					}else if(variables.get(temp.substring(0, temp.indexOf(" ")))==null){
						System.out.println(fin+" unknown");
						unknown = true;
						break;
					}else{
						equation += variables.get(temp.substring(0, temp.indexOf(" ")))+" ";
					}
					temp = temp.substring(temp.indexOf(" ")+1);
				}
				equation += "=";
				if(!unknown){
					int calculation = eval(equation);
					if(!variables.containsValue(calculation)){
						System.out.println(fin+" unknown");
					}else{
						Set<String> keys = variables.keySet();
						String key = "";
						for(String a: keys){
							if(variables.get(a)==calculation)
								key = a;
						}
						System.out.println(fin+" "+key);
					}
				}
			}
		}
	}
}
