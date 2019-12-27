import java.io.*;
import java.util.*;

class Node{
	public String num;
	public List<String> children = null;
	public Node(String n){
		num = n;
	}
	public Node(String n, List<String> chiln){
		children = chiln;
		num = n;
	}
	public boolean hasChild(String a){
		for(String x: children){
			if(x.equals(a)){
				return true;
			}
		}
		return false;
	}
}
public class kitten {
	static ArrayList<Node> parents;
	public static Node findParent(String num){
		for(int i=0;i<parents.size();i++){
			if(parents.get(i).hasChild(num)){
				return parents.get(i);
			}
		}
		return null;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String kitten = input.readLine();
		String line = input.readLine();
		parents = new ArrayList<Node>();
		while(!line.equals("-1")){
			String parNum = line.substring(0, line.indexOf(" "));
			line = line.substring(line.indexOf(" ")+1);
			List<String> children = Arrays.asList(line.split(" "));
			line = input.readLine();
			parents.add(new Node(parNum, children));
		}
		System.out.print(kitten+" ");
		Node parent = findParent(kitten);
		while(findParent(parent.num)!=null){
			System.out.print(parent.num+" ");
			parent = findParent(parent.num);
		}
		System.out.print(parent.num+ " ");
	}
}
