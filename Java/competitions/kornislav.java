import java.util.Arrays;
import java.util.Scanner;

public class kornislav {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] nums = (in.nextLine()).split(" ");
		Arrays.sort(nums);
		System.out.println(Integer.parseInt(nums[0]) * Integer.parseInt(nums[2]));
	}
}
