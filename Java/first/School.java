public class School{
  private String name, address, principal, phoneNum;
  private int numberOfStudents, numberOfEducators;
  public School(String n,String a,String p, String pn, int nos, int noe){
    name = n;
    address = a;
    principal = p;
    phoneNum = pn;
    numberOfStudents = nos;
    numberOfEducators  = noe;
  }
  public void addStudents(int n){
    numberOfStudents = numberOfStudents + n;
  }
  public void removeStudents(int n){
    numberOfStudents = numberOfStudents - n;
  }
  public void addEducators(int n){
    numberOfEducators = numberOfEducators + n;
  }
  public void removeEducators(int n){
    numberOfEducators = numberOfEducators - n;
  }
  public String toString(){
    return name+","+address+","+principal+","+phoneNum+","+numberOfStudents+","+numberOfEducators;
  }
  public String getContactInfo(){
   return name+","+address+","+phoneNum;
  }
  public int compareTo(Object a){
	School s = (School)a;
    if(s.numberOfStudents>numberOfStudents){
      return -3;
    }
    if(s.numberOfStudents<numberOfStudents){
      return 3;
    }
    return 0;
	
  }
  public int getStaff(){
	  return numberOfEducators;
  }
  public int getStudents(){
	  return numberOfStudents;
  }

}

