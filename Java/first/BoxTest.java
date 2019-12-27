import java.util.ArrayList;
public class BoxTest {
	public static void main(String[] args){
		ShoeBox nike = new ShoeBox();
		Box present = new CandyBox(3,2,6);
		JewelryBox gift = new JewelryBox();
		Box pictures = new ShoeBox();
		CandyBox candy = new CandyBox(3,3,3);
		Box shoes = new ShoeBox();
		ArrayList<Box> boxes = new ArrayList();
		boxes.add(nike);
		boxes.add(present);
		boxes.add(gift);
		boxes.add(pictures);
		boxes.add(candy);
		boxes.add(shoes);
		int sum = 0;
		for(Box box: boxes){
			sum += box.getVolume();
			System.out.println(box);
		}
		System.out.println("Total volume is: "+ sum);
		Box biggest = boxes.get(0);
		for(Box box: boxes){
			if(box.getVolume()>biggest.getVolume()){
				biggest = box;
			}
		}
		System.out.println("The box with the largest dimensions is " + biggest.getHeight() + " x " + biggest.getLength() + " x " + biggest.getWidth());
	}
}
