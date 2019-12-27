
public class CubeTest {

	public static void main(String[] args) {
		Function a = new Linear(2, 3);
		Function b = new Horizontal(4);
		Linear c = new Horizontal(3);
		Cube d = new Cube(4);
		Function[] lines = {a, b, c, d};
		for(int i=0;i<4;i++){
			System.out.println(lines[i].getRoot());
		}
	}

}
