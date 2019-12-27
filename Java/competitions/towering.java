import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class towering {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		int[] boxes = new int[6];
		for(int i=0;i<6;i++){
			boxes[i] = Integer.parseInt(line.substring(0, line.indexOf(" ")));
			line = line.substring(line.indexOf(" ")+1);
		}
		int[] heights = new int[2];
		heights[0] = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		heights[1] = Integer.parseInt(line.substring(line.indexOf(" ")+1));
		int[] firstBoxes = new int[3];
		int[] secondBoxes = new int[3];
		for(int a=0;a<6;a++){
			for(int b=a+1;b<6;b++){
				for(int c=b+1;c<6;c++){
					if(boxes[a]+boxes[b]+boxes[c]==heights[0]){
						firstBoxes[0] = boxes[a];
						firstBoxes[1] = boxes[b];
						firstBoxes[2] = boxes[c];
					}
					if(boxes[a]+boxes[b]+boxes[c]==heights[1]){
						secondBoxes[0] = boxes[a];
						secondBoxes[1] = boxes[b];
						secondBoxes[2] = boxes[c];
					}
				}
			}
		}
		Arrays.sort(firstBoxes);
		Arrays.sort(secondBoxes);
		for(int i = 0; i < firstBoxes.length / 2; i++)
		{
		    int temp = firstBoxes[i];
		    firstBoxes[i] = firstBoxes[firstBoxes.length - i - 1];
		    firstBoxes[firstBoxes.length - i - 1] = temp;
		}
		for(int i = 0; i < secondBoxes.length / 2; i++)
		{
		    int temp = secondBoxes[i];
		    secondBoxes[i] = secondBoxes[secondBoxes.length - i - 1];
		    secondBoxes[secondBoxes.length - i - 1] = temp;
		}
		String out = "";
		for(int x: firstBoxes)
			out+=x+" ";
		for(int x: secondBoxes)
			out+=x+" ";
		System.out.println(out);
	}
}
