
public class TestBankAcct {
	public static void main(String args[]){
		BankAcct justin = new BankAcct("Justin", "1234 Cat Drive", 2000, 10000, 1234);
		BankAcct taylor = new BankAcct("Taylor", "4321 Dog Road", 250000, 5000, 1234);
		justin.writeCheck(350);
		taylor.writeCheck(90000);
		justin.depositToSavings(10000);
		justin.transferToChecking(6000);
		justin.writeCheck(9000);
		taylor.transferToChecking(150000);
		double tayTotal = taylor.getCheckingBal()+taylor.getSavingsBal();
		double jusTotal = justin.getCheckingBal()+justin.getSavingsBal();
		System.out.println("Taylor has $"+taylor.getCheckingBal()+" in his/her checkings account, and has $"+taylor.getSavingsBal()+" in his/her savings account. In total he/she has $"+tayTotal);
		System.out.println("Justin has $"+justin.getCheckingBal()+" in his/her checkings account, and has $"+justin.getSavingsBal()+" in his/her savings account. In total he/she has $"+jusTotal);
	}
}
