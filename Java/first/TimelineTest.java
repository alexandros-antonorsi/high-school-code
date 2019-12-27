
public class TimelineTest {
	public static void main(String[] args){
		Event a = new Event(10,16,2014,"CB students take on FHSPS");
		Event b= new Event(11,20,2014,"Abstract becomes concrete.");
		Event c = new Event(2014,"Polymorphism finally understood");
		Event d= new Event(2013,"If-Loop created");
		Event e= new Event(4,1,2012,"Students create Sudoko solver");
		Event f= new Event(5,10,2012,"String cheese meets AP Computer Science");
		Timeline t = new Timeline(a);
		t.addEventToTimeline(b);
		t.addEventToTimeline(c);
		t.addEventToTimeline(d);
		t.addEventToTimeline(e);
		t.addEventToTimeline(f);
		System.out.println(t);
	}
}
