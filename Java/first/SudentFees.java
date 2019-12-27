
public class SudentFees {
	public static void main(String[] args){
		int sum = 0;
		CollegeCourse[] courses = {new LabCourse("BIO",111,3), new CollegeCourse("MAT", 313,2), new LabCourse("PHY",200,2), new CollegeCourse("ENG",100,2)};
		for(CollegeCourse course: courses){
			course.display();
			sum = sum + course.getFee();
		}
		System.out.println("You must pay $" + sum);
	}
}
