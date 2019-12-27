
public class CandyBar {
	//fields
	private String name;
	private boolean nuts;
	private String size;
	private int calories;
	//constructor
	public CandyBar(String name, boolean n, String size, int c){
		this.name=name;
		this.nuts=n;
		this.size=size;
		calories=c;
	}
	//accessor methods
	public String getName(){
		return name;
	}
	public int getCalories(){
		return calories;
	}
	//setter methods
	public void setCalories(int c){
		calories = c;
	}
	public String toString(){
		return name + " " + calories;
	}
}