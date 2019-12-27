
public class Guess extends Sequence{
	private static int count;
	public Guess(){
		super(true);
		count++;
	}
	public String toString(){
		return super.toString();
	}
	public static int guessCount(){
		return count;
	}
}
