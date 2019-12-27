
public class SequenceTester {
	public static void main(String[] args){
		//My test code
		Sequence d = new Sequence(false);
		for(int i=0;i<4;i++){
			System.out.print(d.getSequence()[i]);
		}
		System.out.println();
		System.out.println(d.toString());
		System.out.println(d.contains(3));
		Guess e = new Guess();
		System.out.println(Guess.guessCount());
		System.out.println("Your guess is "+e.toString());
		Code f = new Code();
		System.out.println("The code is "+f.toString());
		System.out.println(f.redPegs(e)+" red pegs");
		System.out.println(f.whitePegs(e)+" white pegs");
		//Mrs.Slutsky's test code FIXED
		Sequence b = new Code();
		System.out.println(b);
		Sequence a = new Guess();
		System.out.println(((Code)b).redPegs((Guess)a));
		System.out.println(((Code)b).whitePegs((Guess)a));
	}
}
