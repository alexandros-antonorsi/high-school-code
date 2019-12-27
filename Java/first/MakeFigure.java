//Alexandros Antonorsi
//October 18th 2015
//Period 3

public class MakeFigure {
	public static void main(String[] args){
		int x = 10;
		drawLine(x);
		drawTop(x);
		drawBottom(x);
		drawLine(x);
	}
	public static void drawLine(int height){
		System.out.print("+");
		for(int i=0;i<height;i++){
			System.out.print("-");
		}
		System.out.println("+");
	}
	public static void drawTop(int height){
		int x = height/2; 	
		int midSpaces = height-2; 		
		for(int i=0;i<x;i++){ 			
			System.out.print("|"); 			
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}			
			System.out.print("\\");			
			for(int h=midSpaces;h>0;h--){
				System.out.print(" ");
			}						  			
			System.out.print("/");  			
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}			
			System.out.print("|"); 			
			System.out.println(); 			
			midSpaces=midSpaces-2; 
		}
	}
	public static void drawBottom(int height){
		int x = height/2;
		int midSpaces = 0;
		int sideSpaces = (height-2)/2;
		for(int i=0;i<x;i++){
			System.out.print("|");
			for(int j=sideSpaces;j>0;j--){
				System.out.print(" ");
			}
			System.out.print("/");
			for(int h=0;h<midSpaces;h++){
				System.out.print(" ");
			}						  
			System.out.print("\\");
			for(int j=sideSpaces;j>0;j--){
				System.out.print(" ");
			}
			System.out.print("|");
			midSpaces = midSpaces+2;
			sideSpaces--;
			System.out.println();
		}
	}
}
