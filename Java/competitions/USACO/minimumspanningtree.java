import java.util.*;
class Edge implements Comparable{
	public int node1, node2, length;
	public Edge(int n1, int n2, int l){
		node1 = n1;
		node2 = n2;
		length = l;
	}
	public int compareTo(Object o){
		Edge e = (Edge)o;
		return length-e.length;
	}
}
public class minimumspanningtree {
	public static final int len = 11;
	public static boolean full(boolean[] nodes){
		for(boolean x: nodes){
			if(!x)
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		boolean[] nodes = new boolean[len];
		Edge[] edges = {new Edge(0,1,3), new Edge(0,2,7), new Edge(0,3,5), new Edge(0,10,8), new Edge(1,10,12), new Edge(10,9,10), 
				new Edge(1,9,6), new Edge(9,8,3), new Edge(1,8,10), new Edge(8,7,7), new Edge(1,7,9), new Edge(1,2,8), new Edge(2,5,2)
				, new Edge(3,2,10), new Edge(3,4,9), new Edge(4,5,13), new Edge(4,6,12), new Edge(5,6,10), new Edge(5,7,6), new Edge(6,7,8)
		};
		Arrays.sort(edges);
		int total = edges[0].length;
		nodes[edges[0].node1]=nodes[edges[0].node2]=true;
		while(!full(nodes)){
			for(int i=1;i<edges.length;i++){
				if(nodes[edges[i].node1]^nodes[edges[i].node2]){
					total+=edges[i].length;
					nodes[edges[i].node1]=nodes[edges[i].node2]=true;
					break;
				}
			}
		}
		System.out.println(total);
	}
}
