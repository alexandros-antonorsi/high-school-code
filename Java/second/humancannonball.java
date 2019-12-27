import java.util.*;
import java.io.*;

public class humancannonball {
	public static double findT(double v0, double theta, double x1){
		double t = x1/v0;
		t = t / Math.cos(Math.toRadians(theta));
		return t;
	}
	public static double findY(double v0, double theta, double x1, double t){
		double y = v0*t*Math.sin(Math.toRadians(theta));
		y = y - 0.5*9.81*t*t;
		return y;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0;i<N;i++){
			double v0 = input.nextDouble();
			double theta = input.nextDouble();
			double x1 = input.nextDouble();
			double h1 = input.nextDouble();
			double h2 = input.nextDouble();
			double t = findT(v0,theta,x1);
			double y = findY(v0,theta,x1,t);
			if(y<h2-1 && y>1+h1){
				System.out.println("Safe");
			}else{
				System.out.println("Not Safe");
			}
		}
	}
}
