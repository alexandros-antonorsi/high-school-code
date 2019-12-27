import java.util.ArrayList;
import java.util.Scanner;
class Stream{
	int max, connect, holds;
	public Stream(int m, int c){
		max = m;
		connect = c;
		holds = 0;
	}
}
public class riverflow {
	public static boolean connects(ArrayList<Stream> streams, int a){
		for(int b=0;b<streams.size();b++){
			if(a!=b && streams.get(b).connect==a)
				return true;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		for(int i=0;i<n;i++){
			ArrayList<Stream> streams = new ArrayList<Stream>();
			int streamnum = Integer.parseInt(in.nextLine());
			for(int x=0;x<streamnum;x++){
				String[] nums = in.nextLine().split(" ");
				streams.add(new Stream(Integer.parseInt(nums[0]), Integer.parseInt(nums[1])-1));
			}
			ArrayList<Integer> ends = new ArrayList<Integer>();
			for(int a=1;a<streams.size();a++){
				if(!connects(streams, a))
					ends.add(a);
			}
			calcMax(streams, 0, ends);
			System.out.println(streams.get(0).holds);
		}
	}
	public static void calcMax(ArrayList<Stream> streams, int stream, ArrayList<Integer> ends){
		if(ends.indexOf(stream)>-1){
			streams.get(stream).holds=streams.get(stream).max;
		}
		for(int i=1;i<streams.size();i++){
			if(streams.get(i).connect==stream){
				calcMax(streams, i, ends);
				streams.get(stream).holds += streams.get(i).holds;
			}
		}
		if(streams.get(stream).holds>streams.get(stream).max){
			streams.get(stream).holds=streams.get(stream).max;
		}
	}
}
