import java.util.Date;

/**
 * 
 * @author Daniel Eagy
 *
 */

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
	
	/**
	 * 
	 * @return the Account's ID
	 */
	public int getAccountID() {
		return accountID;
	}
	
	/**
	 * 
	 * @param accountID the ID the user wants the accountID changed to. 
	 */
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	/**
	 * 
	 * @return the account balance.
	 */
	public double getBalance() {
		return balance; 
	}
	
	/**
	 * 
	 * @param balance the amount that the user wants the balance
	 * changed to.
	 */
	public void setBalance(double amount) {
		this.balance = amount; 
	}
	
	/**
	 * 
	 * @return the annual interest rate. 
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	/**
	 * 
	 * @param annualInterestRate interest rate to change to. 
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	/**
	 * 
	 * @return the date the account was created.
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	/**
	 * 
	 * @return monthly interest rate calculated from the annual interest
	 * and the balance.
	 */
	public double getMonthlyInterest() {
		return (annualInterestRate*balance)/12;
	}
	/**
	 * 
	 * @param amount amount to be withdrawn
	 */
	public void withdraw(double amount) {
		balance -= amount;
	}
	/**
	 * 
	 * @param amount amount to be deposited
	 */
	public void deposit(double amount) {
		balance += amount;
	}
	/**
	 * 
	 * @param amount amount to be deposited.
	 */
	public void deposit(int amount) {
		balance += (double)amount;
	}
	
	/**
	 * @return string representation of the account. 
	 */
	public String toString() {
		return "Account ID:\t\t\t"
				+ accountID
				+ "\nBalance:\t\t\t$"
				+ String.format("%.02f", balance)
				+ "\nMonthly Interest Earned:\t$"
				+ String.format("%.02f", getMonthlyInterest())
				+ "\nDate Created:\t\t\t"
				+ getDateCreated();
	}
}
