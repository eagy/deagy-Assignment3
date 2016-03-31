
public class Checking extends Account {
	private final double MAX_OVERDRAFT = -5000.00;
	
	public Checking() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Checking(int accountID, double balance, double annualInterestRate) {
		super(accountID, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(double amount) {
		if(amount > 0) {
			if(balance-amount < MAX_OVERDRAFT){
				System.out.println("Account has reached it's withdrawal limit.");
			}
			else
				balance -= amount;
		}
		else
			System.out.println("Cannot withdraw a negative amount.");
	}

}
