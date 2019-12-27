
public class MasterMind {
	private String name;
	private Code code;
	public MasterMind(String n){
		name = n;
		code = new Code();
		playGame();
		
	}
	private void playGame(){
		Guess guess = new Guess();
		while(Guess.guessCount()<8){
			if(guess.toString().equals(code.toString())){
				System.out.println("YOU WIN!");
				break;
				
			}else{
			System.out.println("You got "+code.redPegs(guess)+" red peg(s) and "+code.whitePegs(guess)+" white peg(s).");
			System.out.println("You have "+(8-Guess.guessCount())+" guesses left.");
			guess = new Guess();	
			}
		}
		if(Guess.guessCount()==8){
			System.out.println("Sorry, you didn't guess the code right. The code was "+code);
		}
		
	}
	
}
