
public class Story {
	private String[] storyWords;
	public Story(String[] wordsArray){
		storyWords = wordsArray;
		
	}
	private int printWord(String nextWord, int cursorPos, int lineWidth){
		if(cursorPos > 0 && nextWord.length() + cursorPos + 1 > lineWidth){
			System.out.println();
			cursorPos = 0;
		}
		if(cursorPos > 0){
			System.out.print(" ");
			cursorPos++;
		}
		if(nextWord.length() + cursorPos <= lineWidth){
			System.out.print(nextWord);
			cursorPos = cursorPos + nextWord.length();
		}else{
			System.out.print(nextWord.substring(0,lineWidth));
			cursorPos = lineWidth;
		}
		return cursorPos;
	}
	public void print(int lineWidth){
		int cursorPos = 0;
		for(String word: storyWords){
			cursorPos = printWord(word, cursorPos, lineWidth);
		}
	}
}
