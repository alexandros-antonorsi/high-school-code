
public class SeatingChartTest {
	public static void main(String[] args){
		SeatingChart a = new SeatingChart(10, 10);
		a.setSeat(1, 1, "steve");
		a.setSeat(2, 2, "bob");
		a.swap(0,0,1,1);
		System.out.println(a.getCell("bob") + "\t" + a.getRow("steve") + "\t" + a.getCol("ron"));
		System.out.println(a.contains("steve"));
		System.out.println(a.swap("bob", "steve"));
		System.out.println(a);
	}
}
