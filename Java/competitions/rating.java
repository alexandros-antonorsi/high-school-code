import java.util.*;


public class rating {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		ArrayList<County> counties = new ArrayList<County>();
		for(int i=0;i<n;i++){
			String line = input.nextLine();
			int c = Integer.parseInt(line.substring(line.length()-1));
			String county = line.substring(0, line.length()-2);
			ArrayList<Teacher> teachers = new ArrayList<Teacher>();
			for(int j=0;j<c;j++){
				String l = input.nextLine();
				teachers.add(new Teacher(l));
			}
			County a = new County(county, teachers);
			counties.add(a);
		}
		for(County b: counties){
			System.out.println(b.getName()+" COUNTY");
			System.out.println("SMALL CLASS RANKING");
			System.out.println(b.getSmall());
			System.out.println("MEDIUM CLASS RANKING");
			System.out.println(b.getMedium());
			System.out.println("LARGE CLASS RANKING");
			System.out.println(b.getLarge());
		}
	}
	
}
class County{
	private String name;
	private ArrayList<Teacher> small, medium, large;
	public County(String n, ArrayList<Teacher> teachers){
		small = new ArrayList<Teacher>();
		medium = new ArrayList<Teacher>();
		large = new ArrayList<Teacher>();
		for(Teacher t: teachers){
			if(t.numStudents()<=10){
				small.add(t);
			}else if(t.numStudents()>=11 && t.numStudents()<=30){
				medium.add(t);
			}else{
				large.add(t);
			}
		}
		name = n;
		rank(small);
		rank(medium);
		rank(large);
	}
	public String getName(){
		return name;
	}
	public String getSmall(){
		String s = "";
		for(Teacher a: small){
			s+=a.getName()+"\n";
		}
		return s;
	}
	public String getMedium(){
		String s = "";
		for(Teacher a: medium){
			s+=a.getName()+"\n";
		}
		return s;
	}
	public String getLarge(){
		String s = "";
		for(Teacher a: large){
			s+=a.getName()+"\n";
		}
		return s;
	}
	public void rank(ArrayList<Teacher> teachers){
		Collections.sort(teachers);
		Collections.reverse(teachers);
	}
}
class Teacher implements Comparable{
	private String name;
	private int[] scores;
	public Teacher(String s){
		scores = new int[10];
		int index = s.indexOf(" ");
		name = s.substring(0,index);
		s = s.substring(index+1);
		int i = 0;
		index = s.indexOf(" ");
		while(index>-1){
			scores[i]=Integer.parseInt(s.substring(0,index));
			s=s.substring(index+1);
			index = s.indexOf(" ");
			i++;
		}
		scores[i]=Integer.parseInt(s);
	}
	public double getPassRate(){
		int sum = 0;
		for(int i=5;i<10;i++){
			sum+=scores[i];
		}
		return (double)sum/numStudents();
	}
	public int numStudents(){
		int sum = 0;
		for(int a: scores){
			sum+=a;
		}
		return sum;
	}
	public String getName(){
		return name;
	}
	public int compareTo(Object a){
		Teacher o = (Teacher)a;
		int comp = (int)(getPassRate()*10000-o.getPassRate()*10000);
		if(comp==0){
			return (int)(avgExam()*10000-o.avgExam()*10000);
		}
		return comp;
	}
	public double avgExam(){
		int sum = 0;
		for(int i=0;i<scores.length;i++){
			sum+=scores[i]*(i+1);
		}
		return (double)sum/numStudents();
	}
}

