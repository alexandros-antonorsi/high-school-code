
public class Politician implements Priority{
	private String name, title;
	private int priority;
	public Politician(String n, String t, int p){
		name = n;
		title = t;
		priority = p;
	}
	public boolean equals(Object a){
		Politician b = (Politician)a;
		return title.equals(b.title);
	}
	public void setPriority(int n){
		priority = n;
	}
	public int getPriority(){
		return priority;
	}
	public String toString(){
		return name+","+title+","+priority;
	}
}
