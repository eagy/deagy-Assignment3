/**
 * 
 * @author Daniel Eagy
 * @version 1.0
 */

import java.util.*;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		//user variables used to create Accounts
		int ID; 
		double bal, interest; 
		
		//Getting the parameter values from the user for the
		//Savings Account
		System.out.print("Enter an ID for the savings account: "); 
		ID = kb.nextInt();
		System.out.print("Enter the starting balance for the account: ");
		bal = kb.nextDouble();
		System.out.print("Enter the annual interest rate for the account: ");
		interest = kb.nextDouble();
		
		//Creating the savings
		Savings mySavings = new Savings(ID, bal, interest);
		
		//Getting the parameter values from the user for the
		//Checking Account
		System.out.print("Enter an ID for the checking account: "); 
		ID = kb.nextInt();
		System.out.print("Enter the starting balance for the account: ");
		bal = kb.nextDouble();
		System.out.print("Enter the annual interest rate for the account: ");
		interest = kb.nextDouble();
		
		//Creating the checking
		Checking myChecking = new Checking(ID, bal, interest);
		
		//testing the savings withdraw
		System.out.print("How much should be withdrawn from the savings: ");
		mySavings.withdraw(kb.nextDouble());
		
		//testing the savings deposit
		System.out.print("How much should be deposited into the savings: ");
		mySavings.deposit(kb.nextDouble());
		
		//testing the checking withdraw
		System.out.print("How much should be withdrawn from the checking: ");
		myChecking.withdraw(kb.nextDouble());
		
		//testing the checking deposit
		System.out.print("How much should be deposited into the checking: ");
		myChecking.deposit(kb.nextDouble());
		
		//printing the two accounts.
		System.out.println(mySavings);
		System.out.println();
		System.out.println(myChecking);
		
	}

}
