import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

class Point implements Comparable{
	double x, y;
	public Point(double xc, double yc){
		x=xc;
		y=yc;
	}
	public int compareTo(Object o) {
		Point a = (Point)o;
		if(y>a.y)
			return -1;
		if(y==a.y)
			return 0;
		return 1;
	}
}

public class mountains {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("mountains.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mountains.out")));
		int n = Integer.parseInt(f.readLine());
		Point[] points = new Point[n];
		for(int i=0;i<n;i++){
			String line = f.readLine();
			Point a = new Point(Double.parseDouble(line.substring(0,line.indexOf(" "))),Integer.parseInt(line.substring(line.indexOf(" ")+1)));
			points[i]=a;
		}
		Arrays.sort(points);
		boolean[] blocked = new boolean[n];
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				Point a = points[i];
				Point b = points[j];
				if(Math.abs(b.x-a.x)<=Math.abs(a.y-b.y)){
					blocked[j]=true;
				}
			}
		}
		int c=0;
		for(boolean x: blocked)
			if(!x)
				c++;
		out.println(c);
		out.close();
	}
}
