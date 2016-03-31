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
		
		int ID; 
		double bal, interest; 
		
		System.out.print("Enter an ID for the savings account: "); 
		ID = kb.nextInt();
		System.out.print("Enter the starting balance for the account: ");
		bal = kb.nextDouble();
		System.out.print("Enter the annual interest rate for the account: ");
		interest = kb.nextDouble();
		
		Savings mySavings = new Savings(ID, bal, interest);
		
		System.out.print("Enter an ID for the checking account: "); 
		ID = kb.nextInt();
		System.out.print("Enter the starting balance for the account: ");
		bal = kb.nextDouble();
		System.out.print("Enter the annual interest rate for the account: ");
		interest = kb.nextDouble();
		
		Checking myChecking = new Checking(ID, bal, interest);
		
		System.out.print("How much should be withdrawn from the savings: ");
		mySavings.withdraw(kb.nextDouble());
		
		System.out.print("How much should be deposited into the savings: ");
		mySavings.deposit(kb.nextDouble());
		
		System.out.print("How much should be withdrawn from the checking: ");
		myChecking.withdraw(kb.nextDouble());
		
		System.out.print("How much should be deposited into the checking: ");
		myChecking.deposit(kb.nextDouble());
		
		System.out.println(mySavings);
		System.out.println(myChecking);
		
	}

}
