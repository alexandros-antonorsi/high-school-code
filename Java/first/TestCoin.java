
public class TestCoin {
	public static void main(String args[]){
		Coin q = new Coin(25, "heads");
		System.out.println(q.getValue());
		System.out.println(q.getTop());
		Coin d = new Coin(10, "tails");
		System.out.println(d);
		Coin p = new Coin(1);
		System.out.println(p);
		for(int i=0; i<100;i++){
			p.flip();
			System.out.println(p.getTop());
		}
	}
}
