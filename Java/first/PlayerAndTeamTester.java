
public class PlayerAndTeamTester {
	public static void main(String args[]){
		Team Dolphins = new Team("Dolphins", "football");
		Team Cowboys = new Team("Cowboys", "football");
		Player Don = new Player("Don Marino", "football", Dolphins, 100000);
		Player Ryan = new Player("Ryan Tannerhill", "football", Dolphins, 200000);
		Player Tony = new Player("Tony Romo", "football", Cowboys, 300000);
		Cowboys.win();
		Cowboys.win();
		Cowboys.win();
		Cowboys.win();
		Cowboys.lose();
		Dolphins.win();
		Dolphins.win();
		Dolphins.lose();
		Dolphins.lose();
		System.out.println(Cowboys.winPercent());
		System.out.println(Dolphins.winPercent());
		System.out.println(Cowboys.equals(Dolphins));
		Dolphins.newSeason();
		Cowboys.newSeason();
		System.out.println(Don);
		System.out.println(Ryan);
		System.out.println(Tony);
		Ryan.setSalary(20000000);
		Don.getName();
		Tony.getSport();
		Ryan.getTeam();
		Tony.getSalary();
		Don.setName("Steven Marino");
		Ryan.setSport("baseball");
		Tony.setTeam(Dolphins);
		Don.setSalary(20000000);
		Tony.compareTo(Ryan);
		System.out.println(Ryan);
		
	}
}
