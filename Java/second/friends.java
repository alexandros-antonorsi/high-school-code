import java.util.*;
import java.io.*;

public class friends {
	public static int calcCoolness(String person, int[][] network, ArrayList<String> people, boolean[] visited){
		if(people.indexOf(person)==-1)
			return 0;
		int extendedFriends = 0;
		visited[people.indexOf(person)] = true;
		for(int col=0;col<people.size();col++){
			if(!visited[col] && network[people.indexOf(person)][col] == 1){
				visited[col] = true;
				extendedFriends+=1;
				extendedFriends += calcCoolness(people.get(col), network, people, visited);
			}
		}
		return extendedFriends;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("friends.in.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friends.out.txt")));
		int n = Integer.parseInt(f.readLine());
		for(int i=0;i<n;i++){
			int numPeople = Integer.parseInt(f.readLine());
			int[][] network = new int[numPeople][numPeople];
			ArrayList<String> people = new ArrayList<String>();
			String line = f.readLine();
			while(line.indexOf(" ")>-1){
				people.add(line.substring(0, line.indexOf(" ")));
				line = line.substring(line.indexOf(" ")+1);
			}
			people.add(line);
			int c = Integer.parseInt(f.readLine());
			for(int j=0;j<c;j++){
				line = f.readLine();
				String person1 = line.substring(0,line.indexOf(" "));
				String person2 = line.substring(line.indexOf(" ")+1);
				network[people.indexOf(person1)][people.indexOf(person2)] = 1;
				network[people.indexOf(person2)][people.indexOf(person1)] = 1;
			}
			for(int x=0;x<numPeople;x++)
				for(int y=0;y<numPeople;y++)
					if(y==x)
						network[x][y] = -1;	
			int r = Integer.parseInt(f.readLine());
			boolean[] visited = new boolean[numPeople];
			ArrayList<String> rivals = new ArrayList<String>();
			int yourCoolness = calcCoolness("You", network, people, visited);
			for(int x=0;x<numPeople;x++)
				if(network[people.indexOf("You")][x]==1)
					yourCoolness++;	
			for(int j=0;j<r;j++)
				rivals.add(f.readLine());	
			System.out.println("Social Network "+(i+1)+":");
			for(String rival: rivals){
				visited = new boolean[numPeople];
				int rivalCoolness = calcCoolness(rival, network, people, visited);
				if(people.indexOf(rival)!=-1)
					for(int x=0;x<numPeople;x++)
						if(network[people.indexOf(rival)][x]==1)
							rivalCoolness++;
				System.out.println("   "+rival+": Difference of "+(yourCoolness-rivalCoolness)+" point(s).");	
			}
			System.out.println();
		}
	}
}
