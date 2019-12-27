
public class Coin {
	//fields/states/attributes
	private int value;
	private String top;
	//all the coins share this field: static
	private static int num=0;
	//constructors 
	public Coin(int v, String t){
		value=v;
		top=t;
		num++;
	}
	public int getValue(){
		return value;
	}
	public String getTop(){
		return top;
	}
	public static int getNum(){
		return num;
	}
	public String toString(){
		String s = "" + value;
		s = s + "" + top;
		return s;
	}
	public void flip(){
		if(Math.random()<.5){
			top="heads";
		}else{
			top="tails";
		}
	}
	public Coin(int v){
		value =v;
		flip();
		num++;
	}
	
}
