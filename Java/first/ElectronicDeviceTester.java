
public class ElectronicDeviceTester {
	public static void main(String[] args){
		ElectronicDevice camera = new ElectronicDevice("camera", "Lauren", 500);
		ElectronicDevice ipad = new ElectronicDevice("ipad", "Hanna", 399.99);
		ElectronicDevice kindle = new ElectronicDevice("kindle", "Miriam", 199);
		ipad.setOwner("Robert");
		camera.setPrice(50);
		System.out.println(ipad);
		System.out.println(camera);
		ElectronicDevice game = new TV("Steve", 600, "LED", 27, false);
		//TV family = new TV("TV", "Steve", 200, "LCD", 10, false);
		//TV car = new TV("TV", "Steve", 10000, "plasma", 100, false);
		//TV office = new TV("TV", "Steve", 400, "LED", 20, false);
		
	}
}
