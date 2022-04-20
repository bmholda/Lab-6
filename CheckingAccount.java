
public class CheckingAccount extends BankAccount{
	int cost = 15;
	public CheckingAccount(String person, double amount) {
		super(person,amount);
	}
	public boolean withdraw(double total) {
		double overalltotal = total+cost;
		return super.withdraw(overalltotal);
	}
}
