public class ParkingLevel{
	private String name;
	private int totSpaces;
	private Car[] cars;

	public ParkingLevel(String n, int x){
		cars = new Car[x];
		name=n;
		totSpaces=x;
	}

	public int numSpaces(){
		return totSpaces;
	}
	public Car getCar(int spaceNum){
		return(cars[spaceNum]);
	}


	public int findEmptySpace(){
		for(int i=0;i<totSpaces;i++){
			if(getCar(i)==null){
				return i;
			}
		}
		return -1;
	}

	public void setCar(int spaceNum, Car v){
		cars[spaceNum]=v;
	}
}
