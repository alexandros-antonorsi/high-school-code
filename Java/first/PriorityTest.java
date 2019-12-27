
public class PriorityTest {
	public static void main(String[] args){
		//Mrs.Slutsky's code FIXED
		Priority t1 = new Chore();
		Priority t2 = new Chore();
		Priority t3 = new Chore(3,"carve a pumpkin");
		Priority t4 = new Politician("Arnie", "Governor", 4);
		Priority t5 = new Politician("Bill", "President",10);
		System.out.println(t5.equals(t4));
		System.out.println(t4.equals(t5));  
		System.out.println((t5.toString()).equals(t3.toString()));
		Priority[] p = {t1,t2,t3,t4,t5};
		for(int i=0; i<p.length;i++) 
		System.out.println(p[i]);
		for(int i=0; i<p.length;i++) 
		p[i].setPriority(p[i].getPriority()*2);
		for(int i=0; i<p.length;i++) 
		System.out.println(p[i]);
		//My test code
		System.out.println("///////////////");
		Chore[] doFirstTest = new Chore[5];
		for(int i=0;i<5;i++){
			doFirstTest[i] = new Chore();
			System.out.println(doFirstTest[i]);
		}
		System.out.println(Chore.doFirst(doFirstTest));
	}
}
