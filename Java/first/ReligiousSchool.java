
public class ReligiousSchool extends PrivateSchool{
	private String religion;
	public ReligiousSchool(String n, String a, String p, String pn, int students, int staff, int cost, String r){
		super(n,a,p,pn,students,staff, cost);
		r = religion;
	}
	public String toString(){
		return religion+super.toString();
	}
}