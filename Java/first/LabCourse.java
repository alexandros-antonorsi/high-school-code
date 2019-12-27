
public class LabCourse extends CollegeCourse{
	private String department;
	private int courseNumber, credits, fee;
	private static final int labFee = 50;
	public LabCourse(String d, int cn, int c){
		super(d, cn, c);
	}
	public int getFee(){
		return labFee + super.getFee();
	}
	public void display(){
		super.display();
		System.out.println("This is a lab course");
	}
}
