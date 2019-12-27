import java.util.Scanner;

public class tenkindsofpeople {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int r = input.nextInt(); int c = input.nextInt();
		boolean[][] bmap = new boolean[r][c];
		boolean[][] dmap = new boolean[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				int curr = input.nextInt();
				if(curr=='0')
					bmap[r][c]=true;
				else if(curr=='1')
					dmap[r][c]=true;
			}
		}
		int num = input.nextInt();
		for(int i=0;i<num;i++){
			int r1 = input.nextInt()-1;int c1=input.nextInt()-1;int r2=input.nextInt()-1;int c2=input.nextInt()-1;
			if(reach(bmap,r1,c1,r2,c2))
				System.out.println("binary");
			else if(reach(dmap,r1,c1,r2,c2))
				System.out.println("decimal");
			else
				System.out.println("neither");
		}
	}
	public static boolean reach(boolean[][] map, int r1, int c1, int r2, int c2){//r1 and c1 are current r and c
		if(r1==r2 && c1==c2 && map[r1][c1])
			return true;
		if(r1+1<map.length && map[r1+1][c1])
			reach(map, r1+1,c1,r2,c2);
		if(r1-1>-1 && map[r1-1][c1])
			reach(map, r1-1,c1,r2,c2);
		if(c1+1<map[0].length && map[r1][c1+1])
			reach(map, r1,c1+1,r2,c2);
		if(c1-1>-1 && map[r1][c1-1])
			reach(map, r1,c1-1,r2,c2);
		return false;
	}
}
