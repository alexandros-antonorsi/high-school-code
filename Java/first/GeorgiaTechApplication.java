
public class GeorgiaTechApplication {
	private String name, arrivalDate;
	private int ID;
	private boolean transcript, scores,essay;
	private static int num=1500000;
	public GeorgiaTechApplication(String a, String d){
		name = a;
		transcript = false;
		essay = false;
		scores = false;
		arrivalDate = d;
		num++;
		ID = num;
	}
	public void setScores(){
		scores=true;
	}
	public void setTranscript(){
		transcript=true;
	}
	public void setEssay(){
		essay=true;
	}
	public boolean getScores(){
		return scores;
	}
	public boolean getTranscript(){
		return transcript;
	}
	public boolean getEssay(){
		return essay;
	}
	public String toString(){
		return "";
	}
	
}
