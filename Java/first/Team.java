
public class Team {
	private String name, sport;
	private int wins, losses;
	public Team(String n, String s){
		name = n;
		sport = s;
		wins = 0;
		losses = 0;
	}
	public void win(){
		wins++;
	}
	public void lose(){
		losses++;
	}
	public int getWins(){
		return wins;
	}
	public int getLosses(){
		return losses;
	}
	public void newSeason(){
		wins= 0;
		losses = 0;
	}
	public double winPercent(){
		return (wins/(wins+losses))*100;
	}
	public boolean equals(Object a){
		Team b = (Team)a;
		if(b.winPercent()==winPercent()){
			return true;
		}
		return false;
	}
	public String toString(){
		return name+","+sport+","+wins+","+losses;
	}
}
