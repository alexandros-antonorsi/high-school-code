/*
ID: alexand131
LANG: JAVA
TASK: combo
*/
import java.io.*;
import java.util.*;

class Combination{
	public int a,b,c;
	public Combination(int[] combo){
		a=combo[0];
		b=combo[1];
		c=combo[2];
	}
	public boolean equals(Object o){
		Combination a = (Combination)o;
		return a.a==this.a && a.b==b && a.c==c;
	}
}
public class combo {

	public static int[] toIntArray(String a){
		int[] arr = new int[3];
		int i=0;
		while(a.length()>0 && a.indexOf(" ")>-1){
			arr[i]=Integer.parseInt(a.substring(0,a.indexOf(" ")));
			a=a.substring(a.indexOf(" ")+1);
			i++;
		}
		arr[i]=Integer.parseInt(a);
		return arr;
	}
	public static void print(int[] arr){
		for(int a: arr)
			System.out.print(a+" ");
	}
	public static void computePossibleCombos(int[] farmerCombo, int N, ArrayList<Combination> possibleCombos){
		int x, y, z;
		for(int a= farmerCombo[0]-2; a<=farmerCombo[0]+2;a++){
			if(a<1)
				x=a+N;
			else if(a>N)
				x=a%N;
			else
				x=a;
			for(int b= farmerCombo[1]-2; b<=farmerCombo[1]+2;b++){
				if(b<1)
					y=b+N;
				else if(b>N)
					y=b%N;
				else
					y=b;
				for(int c= farmerCombo[2]-2; c<=farmerCombo[2]+2;c++){
					if(c<1)
						z=c+N;
					else if(c>N)
						z=c%N;
					else
						z=c;
					int[] tempCombo = new int[3];
					tempCombo[0] = x;
					tempCombo[1] = y;
					tempCombo[2] = z;
					Combination p = new Combination(tempCombo);
					if(!possibleCombos.contains(p))
						possibleCombos.add(p);
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("combo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));
		int N = Integer.parseInt(f.readLine());
		if(N==1){
			out.println(1);
			out.close();
			return;
		}
		if(N==2){
			out.println(8);
			out.close();
			return;
		}
		String fC = f.readLine();
		int[] farmerCombo = toIntArray(fC);
		String mL = f.readLine();
		int[] masterLock = toIntArray(mL);
		ArrayList<Combination> combos = new ArrayList<Combination>();
		//first adds all the combos compatible with the farmer's combo
		computePossibleCombos(farmerCombo, N, combos);
		// then add the master lock combos
		computePossibleCombos(masterLock, N, combos);
		
		
		out.println(combos.size());
		out.close();
	}
}
