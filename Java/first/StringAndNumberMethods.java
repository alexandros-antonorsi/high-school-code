
public class StringAndNumberMethods {
	public static void main(String args[]){
		String s1 = "COHN";
		String s2 = "JENA";
		printlnOrder(s1, s2);
		String s = "John and Cena";
		boolean isTooLong = isTooLong(s);
		System.out.println(isTooLong);
		String str = "the unseen donger is the deadliest";
		int countWords = countWords(str);
		System.out.println(countWords);
		String st1 = "Spanish";
		String st2 = "French";
		int n = 4;
		String blendTogether = blendTogether(st1, st2, n);
		System.out.println(blendTogether);
		int a = 5;
		int b = 9;
		perfects(a, b);
		String stringA = "yes";
		String stringB = "yes";
		boolean startOther = startOther(stringA, stringB);
		System.out.println(startOther);
		int x = 7;
		int multiplyOddNumsOnly = multiplyOddNumsOnly(x);
		System.out.println(multiplyOddNumsOnly);
		String repeatString = "cat";
		int repeatInt = 1;
		String nRepetitions = nRepetitions(repeatString, repeatInt);
		System.out.println(nRepetitions);
		int d1 = 2;
		int d2 = 6;
		int d3 = 8;
		int threeDigit = threeDigit(d1, d2, d3);
		System.out.println(threeDigit);
		int z = 1234;
		int sumOfDigits = sumOfDigits(z);
		System.out.println(sumOfDigits);
	}
	public static void printlnOrder(String s1, String s2){
		if(s1.compareTo(s2)>0){
			System.out.println(s2);
			System.out.println(s1);
		}else{
			if(s1.compareTo(s2)<0){
				System.out.println(s1);
				System.out.println(s2);
			}else{
				System.out.println(s2);
				System.out.println(s2);
			}
		}
	}
	public static boolean isTooLong(String s){
		int pos1 = s.indexOf("and");
		int pos2 = s.indexOf("or");
		if(pos1>-1 || pos2>-1){
			return true;
		}
		return false;
	}
	public static int countWords(String str){
		int counter = 0;
		while(str.indexOf(" ")!=-1){
			int pos = str.indexOf(" ");
			str = str.substring(pos+1);
			counter++;
		}
		counter = counter+1;
		return counter;
	}
	public static String blendTogether(String st1, String st2, int n){
		String front, back;
		if(st1.length()>n){
			front = st1.substring(0,n);	
		}else{
			front = st1;
		}
		if(st2.length()>n){
			back = st2.substring(st2.length()-n);
		}else{
			back = st2;
		}
		return front+back;
	}
	public static void perfects(int a, int b){
		int counter = 0;
		if(a==b){
			if(((int)Math.sqrt(a))==Math.sqrt(a)){
				System.out.print(a+"\t");
				counter++;
			}
		}
		if(a<b){
			int count=a;
			while(count<=b){
				if(((int)Math.sqrt(count))==Math.sqrt(count)){
					System.out.print(count+"\t");
					counter++;
				}
				count++;
			}
		}
		if(b<a){
			int count=b;
			while(count<=a){
				if(((int)Math.sqrt(b))==Math.sqrt(count)){
					System.out.print(count+"\t");
					counter++;
				}
				count++;
			}
		}
		if(counter==0){
			System.out.println("none");
		}
		System.out.println();
	}
	public static boolean startOther(String stringA, String stringB){
		if(stringA.equals(stringB)){
			return false;
		}
		if(stringA.length()>stringB.length()){
			if(stringA.indexOf(stringB)==(stringA.length()-stringB.length())){
				return true;
			}
			return false;
		}else{
			if(stringB.indexOf(stringA)==(stringB.length()-stringA.length())){
				return true;
			}
			return false;
		}
	}
	public static int multiplyOddNumsOnly(int x){
		int product = 1;
		if(x<0){
			return -1;
		}
		if(x%2==0){
			return 0;
		}
		while(x>=1){
			product = product*x;
			x=x-2;
		}
		return product;
	}
	public static String nRepetitions(String repeatString, int repeatInt){
		String output = "";
		for(int i=0;i<repeatString.length();i++){
			for(int x = 0;x<repeatInt;x++){
				output = output+repeatString.charAt(i);
			}
		}
		return output;
	}
	public static int threeDigit(int d1, int d2, int d3){
		int first, second, third;
		if(d1>=d2 && d1>=d3){
			first = d1;
			if(d2>=d3){
				second = d2;
				third = d3;
			}else{
				second = d3;
				third = d2;
			}
		}
		if(d2>=d1 && d2>=d3){
			first = d2;
			if(d1>=d3){
				second = d1;
				third = d3;
			}else{
				second = d3;
				third = d1;
			}
		}else{
			first = d3;
			if(d2>=d1){
				second = d2;
				third = d1;
			}else{
				second = d1;
				third = d2;
			}
		}
		return (first*100)+(second*10)+third;
	}
	public static int sumOfDigits(int z){
		if(z<10000){
			int first=z/1000;
			int second=(z%1000)/100;
			int third=(z/10)%10;
			int last=z%10;
			return first+second+third+last;
		}else{
			return -1;
		}
	}

}