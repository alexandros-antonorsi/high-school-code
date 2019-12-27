public class Choc{ 

	private String type;
	//Copy and paste this class into Eclipse 

	public Choc(){ 
		String[] types = {"carmel","marshmellow","dark chocolate","cherry"}; 
		int r = (int)(Math.random()*types.length); 
		type = types[r]; 

	} 

	public int getCalories(){ 
		if(type.equals("caramel")) return 200; 
		if(type.equals("cherry")) return 150; 
		else return 175; 
	} 

	public String toString(){ 
		if(type.equals("cherry")) return "chocolate covered cherry"; 
		return "cholocate with "+type+ " inside";
	}

}
