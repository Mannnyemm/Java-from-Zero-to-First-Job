package com.manny.oopexercises.paymentprocessor;
/**
 * Program that creates accounts and allows transactions between them
 * @author gyabe
 *
 */

public class Launcher {

	public static void main(String[] args) {
		// Initialize accounts
		Account account1 = new Account(1);
		Account account2 = new Account(2);
		
		// Perform account transactions 
		account1.sendMoneyToAccount(account2, 600);
		account2.withdrawMoney(250);
		account1.sendMoneyToAccount(account2, 500);
		account1.sendMoneyToAccount(account2, 6);

		// Prints account2 transactions
		for (Account.Transaction transaction : account2.getTransactions()) {
			System.out.println(transaction.toString());
		}
	}

}
