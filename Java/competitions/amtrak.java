import java.util.Scanner;

public class amtrak {
	public static int time(String time1, String time2){
		int hours1 = Integer.parseInt(time1.substring(0, time1.indexOf(":")));
		int minutes1 = Integer.parseInt((time1.substring(time1.indexOf(":")+1)));
		int total1 = hours1*60 + minutes1;
		int hours2 = Integer.parseInt(time2.substring(0, time2.indexOf(":")));
		int minutes2 = Integer.parseInt((time2.substring(time2.indexOf(":")+1)));
		int total2 = hours2*60 + minutes2;
		return total2-total1;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			String depart1 = input.next();
			String arrive1 = input.next();
			String depart2 = input.next();
			String arrive2 = input.next();
			int time1 = time(depart1, arrive1);
			int time2 = time(depart2, arrive2);
			if(time1>time2)
				System.out.println("Silver Star");
			else if(time2>time1)
				System.out.println("Silver Meteor");
			else
				System.out.println("Cannot tell");
		}
	}
}
