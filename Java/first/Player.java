
public class Player {
	private String name, sport;
	private Team team;
	private int salary;
	public Player(String n, String s, Team t, int sa){
		name = n;
		sport = s;
		team = t;
		salary = sa;
	}
	public String getName(){
		return name;
	}
	public String getSport(){
		return sport;
	}
	public Team getTeam(){
		return team;
	}
	public int getSalary(){
		return salary;
	}
	public void setName(String n){
		name = n;
	}
	public void setSport(String s){
		sport = s;
	}
	public void setTeam(Team t){
		team = t;
	}
	public void setSalary(int s){
		salary = s;
	}
	public int compareTo(Object a){
		Player b = (Player)a;
		return salary-b.salary;
	}
	public String toString(){
		return name+","+sport+","+team+","+salary;
	}
	
}
