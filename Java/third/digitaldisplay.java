import java.util.HashMap;
import java.util.Scanner;

public class digitaldisplay {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		HashMap <String, String[]> nums = new HashMap<String, String[]>();
		String[] one = {"    +", "    |","    |","    +","    |","    |","    +"};
		String[] two = {"+---+", "    |","    |","+---+","|    ","|    ","+---+"};
		String[] three = {"+---+", "    |","    |","+---+","    |","    |","+---+"};
		String[] four = {"+   +", "|   |","|   |","+---+","    |","    |","    +"};
		String[] five = {"+---+", "|    ","|    ","+---+","    |","    |","+---+"};
		String[] six = {"+---+", "|    ","|    ","+---+","|   |","|   |","+---+"};
		String[] seven = {"+---+", "    |","    |","    +","    |","    |","    +"};
		String[] eight = {"+---+", "|   |","|   |","+---+","|   |","|   |","+---+"};
		String[] nine = {"+---+", "|   |","|   |","+---+","    |","    |","+---+"};
		String[] zero = {"+---+", "|   |","|   |","+   +","|   |","|   |","+---+"};
		nums.put("0", zero);
		nums.put("1", one);
		nums.put("2", two);
		nums.put("3", three);
		nums.put("4", four);
		nums.put("5", five);
		nums.put("6", six);
		nums.put("7", seven);
		nums.put("8", eight);
		nums.put("9", nine);
		String[] middle = {"     ","     ","  o  ","     ","  o  ","     ","     "};
		while(!line.equals("end")){
			String[] num1 = nums.get(line.substring(0,1));
			String[] num2 = nums.get(line.substring(1,2));
			String[] num3 = nums.get(line.substring(3,4));
			String[] num4 = nums.get(line.substring(4,5));
			for(int i=0;i<7;i++){
				
				System.out.print(num1[i]);
			
				System.out.print("  ");
				
				System.out.print(num2[i]);
				
				System.out.print(middle[i]);
				
				System.out.print(num3[i]);
				
				System.out.print("  ");
				
				System.out.println(num4[i]);
			}
			System.out.println();
			System.out.println();
			line = input.nextLine();
		}
		System.out.println("end");
	}
}
