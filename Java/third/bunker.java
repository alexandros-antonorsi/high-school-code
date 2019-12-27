import java.util.Scanner;

public class bunker {
	public static double min;
	public static double sumDistances(double[] thetas, int index, double r){
		double central = thetas[index];
		double sum = 0;
		for(int i=0;i<thetas.length;i++){
			if(i!=index){
				double diff = Math.abs(thetas[i]-central);
				diff = Math.min(diff, 360-diff);
				double len = (diff*Math.PI/180.0)*r;
				sum+=len;
			}
				
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			min = Double.MAX_VALUE;
			int r = input.nextInt();
			int c = input.nextInt();
			double[] thetas = new double[c];
			for(int j=0;j<c;j++){
				thetas[j]=input.nextDouble();
			}	
			for(int j=0;j<c;j++){
				double sum = sumDistances(thetas, j,r);
				if(sum<min)
					min=sum;
			}
			System.out.println("Tree #"+(i+1)+": "+String.format("%.3f", min));
		}
	}
}
/*
 * convert to radians
 * find difference between home angle and other angle
 * if dif>180, do 360-other angle and find the difference then
 * difference in angle = theta, s = r*theta
 * sum of s
 */