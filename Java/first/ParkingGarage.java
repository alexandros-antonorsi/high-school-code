public class ParkingGarage{
	private int totalCars;
	private ParkingLevel[] levels;

	public ParkingGarage(ParkingLevel[] p){
		totalCars=0;
		levels=p;
	}

	public boolean isCarAlreadyParked(String id){
		for(int i=0; i<levels.length;i++){
		  int n=levels[i].numSpaces();
		  for(int x=0; x<n; x++){
	    	if((levels[i].getCar(x)!=null) && levels[i].getCar(x).getID().equals(id))
	    		return true;
	      }
		}
		return false;
	}

	public boolean isFull(){
		for(ParkingLevel level: levels){
			for(int i=0;i<level.numSpaces();i++){
				if(level.getCar(i)==null){
					return false;
				}
			}
		}
		return true;
	}

	public boolean parkCar(Car v) {
		if(!isFull() && !isCarAlreadyParked(v.getID())){
			for(int i=0;i<levels.length;i++){
				if(levels[i].findEmptySpace()>-1){
					totalCars++;
					levels[i].setCar(levels[i].findEmptySpace(), v);
					return true;
				}
			}
			
		}
		return false;
	}

	public Car removeCar(String id) {		
		for(int i=0;i<levels.length;i++){
			for(int j=0;j<levels[i].numSpaces();j++){
				if(levels[i].getCar(j)!=null && levels[i].getCar(j).getID().equals(id)){
					totalCars--;
					levels[i].setCar(j, null);
					return levels[i].getCar(j);
				}
			}
		}
		return null;
	}

	public String toString(){
		String s="";
		for(int i=0;i<levels.length; i++){
			int n=levels[i].numSpaces();
			s+="level "+i+" ";
			for(int x=0; x<n; x++)
				if (levels[i].getCar(x)!=null)
					s+=levels[i].getCar(x).getID()+" ";
				s+="\n";
		}	
		return s;
	}
	public int getCars(){
		return totalCars;
	}
}
