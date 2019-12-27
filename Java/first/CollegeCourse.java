
public class CollegeCourse {
	private String department;
	private int courseNumber, credits, fee;
	public CollegeCourse(String d, int cn, int c){
		department = d;
		courseNumber = cn;
		credits = c;
		fee = 120*c;
	}
	public void display(){
		System.out.println(department + " " + courseNumber + " is a " + credits + " credit course and costs $" + getFee());
	}
	public String getDepartment(){
		return department;
	}
	public int getCourseNumber(){
		return courseNumber;
	}
	public int getCredits(){
		return credits;
	}
	public int getFee(){
		return fee;
	}
	
}
