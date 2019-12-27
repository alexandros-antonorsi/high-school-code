import java.util.ArrayList;
public class Timeline {
	private ArrayList<Event> events;
	public Timeline(Event a){
		events = new ArrayList<Event>();
		events.add(a);
	}
	public void addEventToTimeline(Event a){
		for(int i=0;i<events.size();i++){
			if(a.compareTo(events.get(i))>0){
				events.add(i, a);
			}
		}
		if(!events.contains(a)){
			events.add(a);
		}
	}
	public String toString(){
		String s = "";
		for(int i=0;i<events.size();i++){
			s += events.get(i) + "\n"; 
		}
		return s;
	}
}
