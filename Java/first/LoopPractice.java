
public class LoopPractice {
	public static void main(String args[]){
		firstPicture();
		System.out.println();
		secondPicture();
		System.out.println();
		thirdPicture();
	}
	public static void firstPicture(){
		for(int a=0;a<4;a++){
			for(int b=0;b<8;b++){
				System.out.print("\\");
			}
			System.out.println();
			for(int c=0;c<8;c++){
				System.out.print("/");
			}
			System.out.println();
		}
	}
	public static void secondPicture(){
		int counter=1;
		for(int i=1;i<8;i++){
			if(counter%2==1 || counter==1){
				for(int x=0;x<i;x++){
					System.out.print("/");
				}
				counter++;
			}else{
				for(int x=0;x<i;x++){
					System.out.print("\\");
				}
				counter++;
			}
			System.out.println();
		}
		
	}
	public static void thirdPicture(){
		int counter=1;
		for(int i=7;i>0;i--){
			if(counter%2==1 || counter==1){
				for(int x=i;x>0;x--){
					System.out.print("\\");
				}
				counter++;
			}else{
				for(int x=i;x>0;x--){
					System.out.print("/");
				}
				counter++;
			}
			System.out.println();
		}
	}
}
