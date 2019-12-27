import java.io.*;
import java.util.*;

public class cd {
	public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
	public static void main(String[] args) throws IOException{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] numcds = (kb.readLine()).split(" ");
			int[] numCds = {Integer.parseInt(numcds[0]), Integer.parseInt(numcds[1])};
			if(numCds[0]==0 && numCds[1]==0){
				break;
			}else{
				int[] jack = new int[numCds[0]];
				int total = 0;
				for(int x=0;x<jack.length;x++){
					jack[x]=Integer.parseInt(kb.readLine());
				}
				Arrays.sort(jack);
				for(int x=0;x<numCds[1];x++){
					int num = Integer.parseInt(kb.readLine());
					if(indexOf(jack, num)>-1){
						total++;
					}
				}

				System.out.println(total);
			}
			
		}
	}
}
