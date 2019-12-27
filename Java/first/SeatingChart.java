
public class SeatingChart {
	private String[][] chart;
	public SeatingChart(int r, int c){
		chart = new String[r][c];
		clearAllSeats();
	}
	public SeatingChart(SeatingChart a){
		for(int i=0;i<a.chart.length;i++){
			for(int j=0;j<a.chart[i].length;j++){
				chart[i][j] = a.chart[i][j];
			}
		}
	}
	public void clearAllSeats(){
		for(int i=0;i<chart.length;i++){
			for(int j=0;j<chart[i].length;j++){
				chart[i][j] = "";
			}
		}
	}
	public void setSeat(int row, int col, String name){
		chart[row][col] = name;
	}
	public void swap(int row1, int col1, int row2, int col2){
		String temp = chart[row1][col1];
		chart[row1][col1] = chart[row2][col2];
		chart[row2][col2] = temp;
	}
	public int[] getCell(String str){
		for(int i=0;i<chart.length;i++){
			for(int j=0;j<chart[i].length;j++){
				if(chart[i][j].equals(str)){
					int[] a = {i,j};
					return a;
				}
			}
		}
		int[] a = {-1,-1};
		return a;
	}
	public int getRow(String str){
		return getCell(str)[0];
	}
	public int getCol(String str){
		return getCell(str)[1];
	}
	public boolean contains(String str){
		if(getRow(str)==-1){
			return false;
		}
		return true;
	}
	public boolean swap(String s1, String s2){
		if(!contains(s1) || !contains(s2)){
			return false;
		}
		swap(getRow(s1), getCol(s1), getRow(s2), getCol(s2));
		return true;
	}
	public String get(int row, int col){
		return chart[row][col];
	}
	public String toString(){
		String temp = "";
		for(int i=0;i<chart.length;i++){
			for(int j=0;j<chart[i].length;j++){
				temp = temp + chart[i][j] + "\t";
			}
			temp = temp + "\n";
		}
		return temp;
	}
}
