import java.util.Scanner;
import java.util.ArrayList;
public class ListPractice {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		for(int i=0;i<80;i++){
			int x = (int)(Math.random()*900)+100;
			addNum(list, x);
		}
		int sum = 0;
		for(Integer a: list){
			sum = sum + a;
		}										
		
		System.out.println(list);
		System.out.println(sum);
		System.out.println(addEvens(list));
	}
	public static void addNum(ArrayList<Integer> a, int x){
		int i = 0;
		while(i<a.size() && x > a.get(i)){
			i++;
		}
		a.add(i, x);
	}
	public static int addEvens(ArrayList a){
		int sum = 0;
		for(int i=0;i<a.size();i+=2){
			sum += (int)a.get(i);
		}
		return sum;
	}
	public static void remove500(ArrayList<Integer> a){
		a.add(500);
		while(a.remove((Integer)500)){
		}
	}
	public static void removeEvens(ArrayList a){
		for(int i=a.size()-1;i>=0;i-=2){
			if((int)a.get(i)%2==0){
				a.remove(i);
			}
		}
	}
}
