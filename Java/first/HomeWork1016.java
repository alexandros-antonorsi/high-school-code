
public class HomeWork1016 {
	public static void main(String[] args){
		int[] arr1={1,2,4};
		int[] arr2={3};
		int[] arr3={5,4,6};
		int[] arr4={2,2,7};
		int[] arr5={2,3,6,8};
		System.out.println(allLess(arr1,arr2)); //prints false
		System.out.println(allLess(arr1,arr3));//prints true
		System.out.println(allLess(arr1,arr4));//prints false
		swapPairs(arr5);
		printArray(arr5); //prints 3 2 8 6
		swapPairs(arr3);
		printArray(arr3);//prints 4 5 6
		String[] words ={"a", "bc", "bc", "a"};
		double x=strAvgLen(words);
		System.out.println(x); //prints 1.5
		System.out.println(isPalindrome(words)); //prints true
		
	}
	public static boolean allLess(int[] a, int[] b){
		if(a.length!=b.length){
			return false;
		}
		for(int i=0;i<a.length;i++){
			if(a[i]>=b[i]){
				return false;
			}
		}
		return true;
	}
	public static int[] swapPairs(int[] a){
		int length = a.length;
		if(a.length%2==1){
			length = a.length-1;
		}
		for(int i=0; i<length;i=i+2){
			int temp = a[i+1];
			a[i+1]=a[i];
			a[i]=temp;
		}
		return a;
	}
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	public static double strAvgLen(String[] a){
		double sum = 0;
		for(int i=0;i<a.length;i++){
			String str = a[i];
			sum = sum+str.length();
		}
		return sum/a.length;
	}
	public static boolean isPalindrome(String[] s){
		int len = s.length;
		for(int i=0;i<len/2;i++){
			if(s[i].equals(s[len-(i+1)])){
			}else{
				return false;
			}
		}
		return true;
	}
}
