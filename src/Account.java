import java.util.Date;

public class Account {
	protected int accountID; 
	protected double balance;
	protected double annualInterestRate; 
	protected Date dateCreated; 
	
	public Account() {
		accountID = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}
	
	public Account(int accountID, double balance, double annualInterestRate) {
		this.accountID = accountID;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	public double getBalance() {
		return balance; 
	}
	
	public void setBalance(double balance) {
		this.balance = balance; 
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterest() {
		return (annualInterestRate*balance)/12;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void deposit(int amount) {
		balance += (double)amount;
	}
	
	public String toString() {
		return "Account ID:\t"
				+ accountID
				+ "\nBalance:\t"
				+ balance
				+ "\nMonthly Interest:\t"
				+ getMonthlyInterest()
				+ "\nDate Created:\t"
				+ getDateCreated();
	}
}
