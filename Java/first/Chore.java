
public class Chore implements Priority {
	private String description;
	private int priority;
	private boolean completed;
	public Chore(){
		String[] chores = {"mow the lawn", "fold the laundry", "make dinner", "vacuum the house"};
		description = chores[(int)(Math.random()*4)];
		priority = (int)(Math.random()*10)+1;
		completed = false;
	}
	public Chore(int p, String d){
		description = d;
		priority = p;
		completed = false;
	}
	public String toString(){
		return description + "," + priority + ","+completed;
	}
	public int compareTo(Object a){
		Chore b = (Chore)a;
		return priority-b.priority;
	}
	public void complete(){
		completed = true;
	}
	public static Chore doFirst(Chore[] chores){
		int highest = chores[0].getPriority();
		Chore firstChore = new Chore();
		for(int i=0;i<chores.length;i++){
			highest = Math.max(highest, chores[i].getPriority());
			if(highest==chores[i].getPriority()){
				firstChore = chores[i];
			}
		}
		return firstChore;
		
	}
	public void setPriority(int n){
		priority = n;
	}
	public int getPriority(){
		return priority;
	}
}
