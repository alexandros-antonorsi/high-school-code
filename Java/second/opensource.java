import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
class Project implements Comparable{
	public String name;
	public int people;
	public Project(String n, int p){
		name = n;
		people = p;
	}
	public int compareTo(Object o){
		Project a = (Project)o;
		if(people==a.people)
			return a.name.compareTo(name);
		return a.people-people;
	}
}
public class opensource {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = input.readLine();
			if(line == null) break;
			HashMap<String, Integer> projects = new HashMap<String, Integer>();
			HashSet<String> blockedPeople = new HashSet<String>();
			HashMap<String, String> people = new HashMap<String, String>();
			while(!line.equals("1") && line != null){
				if(line.equals("0"))
					break;
				if(line.equals(line.toUpperCase())){
					projects.put(line, 0);
					String project = line;
					line = input.readLine();
					while(!line.equals(line.toUpperCase()) && line != null){
						System.out.println("XD");
						if(people.containsKey(line) && !people.get(line).equals(project)){
							people.remove(line);
							blockedPeople.add(line);
						}else{
							people.put(line, project);
						}
						line = input.readLine();
					}
				}
			}
			
			for(String person: people.keySet()){
				projects.put(people.get(person), projects.get(people.get(person))+1);
			}
			ArrayList<Project> yee = new ArrayList<Project>();
			for(String project: projects.keySet()){
				yee.add(new Project(project, projects.get(project)));
			}
			Collections.sort(yee);
			for(Project a: yee)
				System.out.println(a.name+" "+a.people);
			projects = new HashMap<String, Integer>();
			blockedPeople = new HashSet<String>();
			people = new HashMap<String, String>();
		}
	}
}
