public class TestGarage{
  public static void main(String[] args){
	Car red = new Car("12");
	Car blue = new Car("14");
	Car green = new Car("16");
	ParkingLevel one = new ParkingLevel("one",2);
	ParkingLevel two = new ParkingLevel("two",5);
	ParkingGarage p = new ParkingGarage(new ParkingLevel[] {one,two});

	p.parkCar(red);
	p.parkCar(blue);
	p.parkCar(green);
	p.parkCar(new Car("24"));
	p.parkCar(new Car("26"));
	p.parkCar(new Car("27"));
	p.parkCar(new Car("32"));
	p.parkCar(new Car("24")); 
	p.parkCar(new Car("10"));
	p.removeCar("24");
	p.parkCar(new Car("50"));
	//this will print your garage.  Not all the cars should be parked in it.
	System.out.println(p);
	}
}
