
public class Savings extends Account {

	public Savings() {
		// TODO Auto-generated constructor stub
	}
	
	public Savings(int accountID, double balance, double annualInterestRate) {
		super(accountID, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param amount amount to be withdrawn
	 */
	@Override
	public void withdraw(double amount) {
		if(amount > 0) {
			if (balance-amount < 0) {
				System.out.println("Account has reached it's withdrawal limit.");
			}
			else 
				balance -= amount;
		}
		else
			System.out.println("Cannot withdraw a negative amount!");
	}

}
