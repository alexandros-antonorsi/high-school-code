import java.util.Scanner;
import java.util.Scanner;
public class Statistics {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		for(int k=0; k<2; k++){ 
			int x= kb.nextInt(); 
			int[] arr= new int[x]; 
			for(int i=0; i<x; i++) 
				arr[i]=kb.nextInt();
			sort(arr);
			System.out.println(getRange(arr));
			System.out.println(getMode(arr));
			System.out.println(getMedian(arr));
			System.out.println(getMean(arr));
		}
	}
	public static void sort(int[] a){
		int temp;
		for(int i=0;i<a.length-1;i++){
			for(int j=i;j<a.length;j++){
				if(a[j]<a[i]){
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static int getRange(int[] a){
		return a[a.length-1]-a[0];
	}
	//MY MODE CODE
	/*public static int getMode(int[] a){
		int mostOfNum=1;
		int amtOfNum=0;
		int numCounted =a[0];
		int mode=0;
		int pos;
		for(int i=0;i<a.length;i++){
			numCounted=a[i];
			pos = i;
			while(a[pos]==numCounted && pos<a.length-1){
				amtOfNum++;
				pos++;
			}
			if(amtOfNum>mostOfNum){
				mostOfNum=amtOfNum;
				mode=a[i];
			}
			amtOfNum=0;
			
		}
		if(mode==0){
			return a[0]; 
		}
		return mode;
	}*/
	//MRS.SLUTSKY'S CODE
	public static int getMode(int[] a){
		int highestAmt = getAmount(a[0], a);
		int mode = a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]!=a[i-1]){
				int amount = getAmount(a[i], a);
				if(amount>highestAmt){
					mode = a[i];
					highestAmt = amount;
				}
			}
		}
		return mode;
		
	}
	public static int getAmount(int n, int[] a){
		int amount = 0;
		int i=0;
		while(i<a.length && a[i]<=n){//second part of this if statement stops the amount from incrementing if the number in that spot in the array is greater than n since the array is already sorted
			if(a[i]==n){
				amount++;
			}
			i++;
		}
		return amount;
	}
	public static int getMedian(int[] a){
		if(a.length%2==0){
			int sum = a[a.length/2]+a[a.length/2-1];
			return (int)(Math.round((double)sum/2));
		}
		return a[a.length/2];
	}
	public static int getMean(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		return (int)(Math.round((double)sum/a.length));
	}
}
