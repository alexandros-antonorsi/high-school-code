import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class findinglines {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(input.readLine());
		int p = Integer.parseInt(input.readLine());
		int[][] points = new int[n][2];
		for(int i=0;i<n;i++){
			String line = input.readLine();
			int[] point = {Integer.parseInt(line.substring(0, line.indexOf(" "))), Integer.parseInt(line.substring(line.indexOf(" ")+1))};
			points[i] = point;
		}
		for(int a=0;a<n;a++){
			for(int b=a+1;b<n;b++){
				double sum = 2;
				int[] one = points[a];
				int[] two = points[b];
				boolean vertical = one[0]==two[0];
				double slope, yint;
				if(!vertical){
					slope = (two[1]-one[1])/(two[0]-one[0]);
					yint = one[1] - (slope*one[0]);
				}else{
					slope = one[0];
					yint = 0;
				}
				System.out.println(b);
				for(int c=b+1;c<n;c++){
					if(vertical){
						if(points[c][0]==slope){
							sum++;
						}
					}else{
						if(points[c][1]==slope*points[c][0] + yint)
							sum++;
					}
					if((sum / n)*100 >=p ){
						System.out.println("possible");
						return;
					}
				}
			}
		}
		System.out.println("impossible");
	}
}
