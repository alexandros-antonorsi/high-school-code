import java.util.Scanner;
public class UserCourse {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the department");
		String department = input.nextLine();
		System.out.println("Enter the course number");
		int courseNum = input.nextInt();
		System.out.println("Enter the number of credits");
		int credits = input.nextInt();
		CollegeCourse a = new CollegeCourse(department, courseNum, credits);
		if(department.equals("BIO") || department.equals("CHM") || department.equals("CIS") || department.equals("PHY")){
			a = new LabCourse(department, courseNum, credits);
		}
		a.display();
	}
}
