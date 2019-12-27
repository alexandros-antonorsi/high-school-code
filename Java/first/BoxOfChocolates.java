
public class BoxOfChocolates {
	private Choc[][] box;
	private int num;
	public BoxOfChocolates(int r, int c){
		box = new Choc[r][c];
		for(int row=0;row<r;row++){
			for(int col=0;col<c;c++){
				box[row][col]= new Choc();
			}
		}
		num=r*c;
	}
	public String toString(){
		String s = "";
		for(Choc[] row: box){
			for(Choc p: row){
				if(p!=null)
				s = s+p.toString()+"\t";
				else s = s + "empty\t";
			}
			s=s+"\n";
		}
		return s;
	}
	public static void main(String[] args){
		BoxOfChocolates a = new BoxOfChocolates(3,4);
		System.out.println(a);
		Choc c = a.getPiece(2, 3);
		System.out.println(c);
		System.out.println(a.getCalories());
		Choc p2 = a.getPiece();
		System.out.println(p2);
		
	}
	public Choc getPiece(int r, int c){
		Choc piece = box[r][c];
		box[r][c]=null;
		num--;
		return piece;
	}
	public int getCalories(){
		int total = 0;
		for(Choc[] row: box){
			for(Choc piece: row){
				if(piece!=null)
				total = total+piece.getCalories();
				
			}
		}
		return total;
	}
	public Choc getPiece(){
		if(num==0){
			return null;
		}
		int row = (int)(Math.random()*box.length);
		int col = (int)(Math.random()*box[0].length);
		while(box[row][col]==null){
			row = (int)(Math.random()*box.length);
			col = (int)(Math.random()*box[0].length);
		}
		return getPiece(row, col);
	}
} 
