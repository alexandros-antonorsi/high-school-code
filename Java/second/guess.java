import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class guess {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int low = 1;
		int high = 1000;
		int guess = (high + low) / 2;
		System.out.println(guess);
		String response = input.readLine();
		while(!response.equals("correct")){
			if(response.equals("higher"))
				low = guess + 1;
			if(response.equals("lower"))
				high = guess - 1;
			guess = (high+low)/2;
			System.out.println(guess);
			response = input.readLine();
		}
	}
}
