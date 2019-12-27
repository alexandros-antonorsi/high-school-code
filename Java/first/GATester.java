
public class GATester {
	public static void main(String args[]){
		GeorgiaTechApplication tommy = new GeorgiaTechApplication("Tommy Tech", "10/06/15");
		System.out.println(tommy);
		tommy.setEssay();
		tommy.setScores();
		GeorgiaTechApplication yellow = new GeorgiaTechApplication("Yellow Jacket", "10/11/15");
		System.out.println(yellow);
	}
}
