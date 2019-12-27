
public class BankAcct {
	private String name, address;
	private int custNum=0, savingsAmt, checkingAmt, pin;
	private static int numOfCustomers;
	public BankAcct(String n, String a, int s, int c, int p){
		name = n;
		address = a;
		savingsAmt = s;
		checkingAmt = c;
		pin = p;
		custNum++;
	}
	public void writeCheck(int i){
		if(checkingAmt<i){
			System.out.println("Error: insufficient funds. An additional fee of $50 has been charged to "+name+"'s checking account.");
			checkingAmt = checkingAmt-(i+50);
		}else{
		checkingAmt = checkingAmt-i;
		}
	}
	public void depositToSavings(int i){
		savingsAmt=savingsAmt+i;
	}
	public void depositToChecking(int i){
		checkingAmt=checkingAmt+i;
	}
	public void transferToChecking(int i){
		if(savingsAmt<i){
			i=savingsAmt;
		}
		savingsAmt = savingsAmt-i; 
		checkingAmt = checkingAmt+i;
	}
	public void transferToSavings(int i){
		if(checkingAmt<i){
			i=checkingAmt;
		}
		checkingAmt = checkingAmt-i; 
		savingsAmt = savingsAmt+i;
	}
	public double getSavingsBal(){
		return savingsAmt;
	}
	public double getCheckingBal(){
		return checkingAmt;
	}
}
