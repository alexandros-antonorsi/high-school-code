import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
class Person{
	public String name;
	public long totalcost;
	public boolean consistent, hasCarOut;
	public Car carOut;
	public Person(String n){
		name = n;
		totalcost = 0;
		consistent = true;
		hasCarOut = false;
	}
	public void setCar(Car a){
		carOut = a;
		hasCarOut = true;
	}
}
class Car{
	public String name;
	public boolean isOut;
	public int catalog, pickup, costperkm;
	public Car(String n, int c, int p, int cpk){
		name = n;
		catalog = c;
		pickup = p;
		costperkm = cpk;
		isOut = false;
	}
}
public class administrative {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int tests = input.nextInt();
		for(int i=0;i<tests;i++){
			int n = input.nextInt();
			int m = input.nextInt();
			HashMap<String, Car> cars = new HashMap<String, Car>();
			for(int j=0;j<n;j++){
				String line = input.next();
				int catalog = input.nextInt();
				int pickup = input.nextInt();
				int perkm = input.nextInt();
				cars.put(line, new Car(line, catalog, pickup, perkm));
			}
			TreeSet<String> spies = new TreeSet<String>();
			HashMap<String, Person> nameToSpy = new HashMap<String, Person>();
			for(int j=0;j<m;j++){
				int time = input.nextInt();
				String spy = input.next();
				String type = input.next();
				if(type.equals("p")){
					String car = input.next();
					if(!spies.contains(spy)){
						spies.add(spy);
						nameToSpy.put(spy, new Person(spy));
						nameToSpy.get(spy).setCar(cars.get(car));
						nameToSpy.get(spy).totalcost+=cars.get(car).pickup;
					}else{
						if(nameToSpy.get(spy).consistent){
							if(nameToSpy.get(spy).hasCarOut)
								nameToSpy.get(spy).consistent=false;
							else{
								nameToSpy.get(spy).carOut = cars.get(car);
								nameToSpy.get(spy).totalcost += cars.get(car).pickup;
							}
						}
					}
				}
				else if(type.equals("r")){
					int distance = input.nextInt();
					if(!spies.contains(spy)){
						spies.add(spy);
						nameToSpy.put(spy, new Person(spy));
						nameToSpy.get(spy).consistent=false;
					}else{
						if(nameToSpy.get(spy).consistent){
							if(!nameToSpy.get(spy).hasCarOut)
								nameToSpy.get(spy).consistent=false;
							else{
								nameToSpy.get(spy).hasCarOut= false;
								nameToSpy.get(spy).totalcost+= (nameToSpy.get(spy).carOut.costperkm*distance);
							}
								
						}
					}
				}
				else if(type.equals("a")){
					double perc = input.nextInt()/100.0;
					if(!spies.contains(spy)){
						spies.add(spy);
						nameToSpy.put(spy, new Person(spy));
						nameToSpy.get(spy).consistent=false;
					}else{
						if(nameToSpy.get(spy).consistent){
							if(!nameToSpy.get(spy).hasCarOut)
								nameToSpy.get(spy).consistent=false;
							else{
								nameToSpy.get(spy).totalcost+=Math.ceil((nameToSpy.get(spy).carOut.catalog*perc));
							}
						}
					}
				}
			}
			for(String spy: spies){
				if(nameToSpy.get(spy).hasCarOut || !nameToSpy.get(spy).consistent)
					System.out.println(spy+" INCONSISTENT");
				else{
					System.out.println(spy+" "+nameToSpy.get(spy).totalcost);
				}
			}
		}
	}
}
