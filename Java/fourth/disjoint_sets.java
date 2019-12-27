import java.util.*;
import java.io.*;

public class disjoint_sets {
    public static void main(String args[] ){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //number of nodes
        int m = input.nextInt(); //number of pairs
        int[] arr = new int[n]; //each node[i] is the root of i
        int[] size = new int[n]; 
        for(int i=0;i<n;i++){
            arr[i]=i; //each element's root is initially itself
            size[i]=1; //each subset initially has size 1
        }
        for(int i=0;i<m;i++){
        	int a = input.nextInt()-1; int b = input.nextInt()-1; //two ints that are paired, converted to 0-index
        	int rootA = root(arr, a); int rootB = root(arr, b);
        	if(size[rootA]<size[rootB]){ //if subset with root rootA (subset A) is smaller than the subset with root rootB (subset B)
        		arr[rootA]=rootB; //add subset A to subset B
        		size[rootB]+=size[rootA];//increase size of subset B
        	}else{ //opposite of above if statement
        		arr[rootB]=rootA;
        		size[rootA]+=size[rootB];
        	}
        	boolean[] used = new boolean[n];
        	printSize(arr,used);
        }
    }
    public static int root(int[] arr, int n){
        if(arr[n]==n)
            return n;
        else
            return root(arr, arr[n]);
    }
    public static void printSize(int[] arr, boolean[] used){
    	ArrayList<Integer> sizes = new ArrayList<Integer>();
    	for(int i=0;i<arr.length;i++){		
    		int count = 0;
    		int root = root(arr, arr[i]);
    		for(int j=i;j<arr.length;j++){
    			if(!used[j] && root(arr,arr[j])==root){
    				count++;
    				used[j]=true;
    			}
    		}
    		if(count!=0)
    			sizes.add(count);
    	}
    	Collections.sort(sizes);
    	for(Integer x: sizes)
    		System.out.print(x+" ");
    	System.out.println();
    }
    
}
