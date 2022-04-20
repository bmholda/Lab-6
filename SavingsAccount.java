
public class SavingsAccount extends BankAccount{
	int savenumber = 0;
	String accnumber = "";
	public SavingsAccount(String person, double total) {
		super(person, total);
		accnumber = super.getAccountNumber()+"-"+savenumber;
	}
	public void postInterest() {
	}
	public String getAccountNumber() {
		return null;
	}
	public SavingsAccount(SavingsAccount acc, double bal) {
		super(acc, bal);
		accnumber = super.getAccountNumber()+"-";
	}
}
