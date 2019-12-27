import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
class Person implements Comparable{
	public double rank;
	public String name;
	public Person(String name, String classname){
		this.name = name;
		rank = 0;
		int n = 0;
		while(classname.lastIndexOf("-")>0){
			int dashPos = classname.lastIndexOf("-");
			String classLast = classname.substring(dashPos+1, classname.length());
			double add = Math.pow(10, 0-n);
			if(classLast.equals("upper")){
				rank+=add;
			}
			else if(classLast.equals("lower")){
				rank-=add;
			}
			n++;
			classname = classname.substring(0, dashPos);
		}
		String classLast = classname.substring(0, classname.length());
		double add = Math.pow(10, 0-n);
		if(classLast.equals("upper")){
			rank+=add;
		}
		else if(classLast.equals("lower")){
			rank-=add;
		}
	}
	public int compareTo(Object o){
		Person a = (Person)o;
		if(this.rank>a.rank){
			return 1;
		}
		if(a.rank>this.rank){
			return -1;
		}
		return a.name.compareTo(this.name);
	}
}
public class classy {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(input.readLine());
		for(int i=0;i<n;i++){
			TreeSet<Person> heirarchy = new TreeSet<Person>();
			int m = Integer.parseInt(input.readLine());
			for(int j=0;j<m;j++){
				String line = input.readLine();
				String name = line.substring(0, line.indexOf(":"));
				String classname = line.substring(line.indexOf(":")+2, line.indexOf("class")-1);
				Person a = new Person(name, classname);
				heirarchy.add(a);
			}
			while(!heirarchy.isEmpty()){
				Person x = heirarchy.pollLast();
				System.out.println(x.name);
			}
			System.out.println("==============================");
		}
		
	}
}
