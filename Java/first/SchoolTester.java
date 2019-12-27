public class SchoolTester{
  public static void main(String[] args){
    /*School a = new School("cat", "dog", "mouse", 4201337, 2500, 45);
    a.addStudents(75);
    a.removeEducators(3);
    System.out.println(a.getContactInfo());
    System.out.println(a);
    School b = new School("cat", "dog", "mouse", 4201337, 2375, 45);
    System.out.println(a.compareTo(b));
    School a = new School("A School","1122 Central Park, NY, NY", "Mr A.", "217-333-1234",3100, 320);
    School b = new School("B School","22 Central Park, NY, NY", "Mr B.", "213-333-1234",300, 20); 
    School c = new School("C School","11 Central Park, NY, NY", "Mr C.", "214-333-1234",3020, 330); 
    School d = new School("D School","1000 Central Park, NY, NY", "Mr D.", "218-333-1234",200, 310); 
    School e = new School("E School","1100 Central Park, NY, NY", "Mr E.","207-333-1234",3200, 320); 
    School[] schools = {a,b,c,d,e};
    int sum = 0;
    int p=0;
    int min = schools[0].getStaff();
    for(int i=0;i<schools.length;i++){
    	System.out.println(schools[i]);
    	sum = sum + schools[i].getStudents();
    	if(min>schools[i].getStaff()){
    		min = schools[i].getStaff();
    		p=i;
    	}
    }
    System.out.println("the sum is "+sum);
    System.out.println("the min is "+min);
    System.out.println(schools[p]);
    School best = schools[0];
    for(int i=1;i<schools.length;i++){
    	if(best.compareTo(schools[i])<0){
    		best = schools[i];
    	}
    }
    System.out.println(best);
    */
	School Sagemont = new PrivateSchool("Sagemont", "Weston Road", "John Cena", "1231231234", 150, 30, 20000);
	PrivateSchool u = new PrivateSchool("Sagemont", "Weston Road", "John Cena", "1231231234", 150, 30, 25000);
	u.addEducators(30);
	Sagemont.addStudents(15);
	System.out.println(u);
	System.out.println(((PrivateSchool)Sagemont).getPrice());
	System.out.println(u.getPrice());
  }
}
