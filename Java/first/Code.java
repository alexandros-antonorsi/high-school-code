
public class Code extends Sequence{
	public Code(){
		super(false);
	}
	public String toString(){
		return super.toString();
	}
	public int redPegs(Guess a){
		int count =  0;
		for(int i=0;i<a.getLength();i++){
			if(a.getSequence()[i]==super.getSequence()[i]){
				count++;
			}
		}
		return count;
	}
	public int whitePegs(Guess a){
		int count = 0;
		for(int i=0;i<a.getLength();i++){
			if(super.contains(a.getSequence()[i])){
				count++;
			}
		}
		return count-redPegs(a);
	}
}
