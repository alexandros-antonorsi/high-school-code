import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.shape.Circle;

public class problem4 {
	public static Point first = new Point(0,0);
	public static Point second = new Point(0,0);
	public static final double pi = 3.14159;
	public static double distance(Point a, Point b){
		return Math.sqrt(Math.pow((b.getX() - b.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		for(int i=0;i<n;i++){
			String line = input.nextLine();
			StringBuffer buf = new StringBuffer(line);
			int r = Integer.parseInt(buf.reverse().substring(0,buf.indexOf(" ")));
	
			first.x=Integer.parseInt(line.substring(0, line.indexOf(" ")));
			line = line.substring(line.indexOf(" ")+1);
			first.y=Integer.parseInt(line.substring(0,line.indexOf(" ")));
			line = line.substring(line.indexOf(" ")+1);
			second.x=Integer.parseInt(line.substring(0,line.indexOf(" ")));
			line = line.substring(line.indexOf(" ")+1);
			second.y=Integer.parseInt(line.substring(0,line.indexOf(" ")));
			
			ArrayList<Point> points = new ArrayList<Point>();
			for(int j=0;j<r;j++){
				String point = input.nextLine();
				points.add(new Point(Integer.parseInt(point.substring(0, point.indexOf(" "))), Integer.parseInt(point.substring(point.indexOf(" ")+1))));
				
			}
			ArrayList<Double> distancesFromFirst = new ArrayList<Double>();
			for(Point x: points){
				distancesFromFirst.add(distance(x, first));
			}
			ArrayList<Double> distancesFromSecond = new ArrayList<Double>();
			for(Point x: points){
				distancesFromSecond.add(distance(x, second));
			}
			double max = 0;
			boolean inFirst = false;
			for(double d: distancesFromFirst)
				if(d>max){
					max = d;
					inFirst = true;
				}
			for(double d: distancesFromSecond)
				if(d>max){
					max = d;
					inFirst = false;
				}
			Circle bigger;
			if(inFirst){
				bigger = new Circle(first.x, first.y, max);
			}else{
				bigger = new Circle(second.x, second.y, max);
			}
			ArrayList<Point> pointsNotInCircle = new ArrayList<Point>();
			for(Point x: points){
				Point center = new Point((int)bigger.getCenterX(), (int)bigger.getCenterY());
				if(distance(x,center)>bigger.getRadius()){
					pointsNotInCircle.add(x);
				}
			}
			
			ArrayList<Double> distancesOfPointsNotInCircle = new ArrayList<Double>();
			if(inFirst)
				for(Point x: pointsNotInCircle){
					distancesOfPointsNotInCircle.add(distance(x, second));
				}
			else
				for(Point x: pointsNotInCircle){
					distancesOfPointsNotInCircle.add(distance(x, first));
				}
			double smallerMax = 0;
			for(double d: distancesOfPointsNotInCircle)
				if(d>smallerMax){
					smallerMax = d;
				}
			
			Circle smaller;
			if(inFirst){
				smaller = new Circle(second.x, second.y, smallerMax);
			}else{
				smaller = new Circle(first.x, first.y, smallerMax);
			}
			
			double sumOfAreas = Math.pow(bigger.getRadius(), 2)*pi + Math.pow(smaller.getRadius(), 2)*pi;
			
			Point bigCenter = new Point((int)bigger.getCenterX(), (int)bigger.getCenterY());
			Point smallCenter = new Point((int)smaller.getCenterX(), (int)smaller.getCenterY());
			Double r1 = smaller.getRadius();
			Double r2 = bigger.getRadius();
			Double d = distance(bigCenter, smallCenter);
			if(r2 < r1){
			    // swap
			    r1 = bigger.getRadius();
			    r2 = smaller.getRadius();
			}
			Double part1 = r*r*Math.acos((d*d + r1*r1 - r2*r2)/(2*d*r1));
			Double part2 = r2*r2*Math.acos((d*d + r2*r2 - r*r)/(2*d*r2));
			Double part3 = 0.5*Math.sqrt((-d+r1+r2)*(d+r1-r2)*(d-r1+r2)*(d+r1+r2));

			Double intersectionArea = part1 + part2 - part3;
			
			double finalArea = sumOfAreas - intersectionArea;
			finalArea = Math.round(finalArea * 100.0) / 100.0;
			
			System.out.println(sumOfAreas);
		}
	}
}
