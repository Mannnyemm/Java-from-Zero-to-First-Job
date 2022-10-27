package com.manny.paymentprocessor;

import java.util.Arrays;

/**
 * Account class
 * 
 * @author gyabe
 *
 */
public class Account {
	// Fields
	// Unique id of an Account
	private int id;
	// Array of an accounts transactions
	private Transaction[] transactions;
	// Default length of transactions
	private static final int DEFAULT_TRANSACTIONS_AMOUNT = 10;
	// Keeps track of index of last valid transaction in transactions
	private int lastTransactionIndex;

	// Initializer
	{
		// Initialize length of transactions to 10
		transactions = new Transaction[DEFAULT_TRANSACTIONS_AMOUNT];
	}	
	
	/**
	 * Sets id of this account to a given id
	 * @param id Integer
	 */
	public Account(int id) {
		this.id = id;
	}

	/**
	 * Sends an amount of money to a different account - accountTo
	 * @param accountTo Receiver's Account
	 * @param moneyAmount double amount of money to send
	 */
	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
	    // Exit function if all parameters are not satisfied
		if (accountTo == null || moneyAmount <= 0) {
	    	return;
	    }
		// Creates a new Transaction with an operation of MONEY_TRANSFER_SEND 
	    Transaction newTransaction = new Transaction(this, accountTo, moneyAmount,
				StandardAccountOperations.MONEY_TRANSFER_SEND);
	    // Adds new Transaction to list of transactions
		addTransaction(newTransaction);
		// Calls receiveMpney in account receiving money to receive money
		accountTo.receiveMoney(this, moneyAmount);
	    
	}
	/**
	 * Withdraws an amount of money from Account
	 * @param moneyAmount double amount of money to withdraw
	 */
	public void withdrawMoney(double moneyAmount) {
		// Creates a new Transaction with an operation of WITHDRAW
		Transaction newTransaction = new Transaction(this, null, moneyAmount,
				StandardAccountOperations.WITHDRAW);
		// Adds new Transaction to list of transactions
		addTransaction(newTransaction);
	}
	
	/**
	 * Receives an amount of money from a different account - accountFrom
	 * @param accountFrom Sender's Account
	 * @param moneyAmount double amount of money to receive
	 */
	public void receiveMoney(Account accountFrom, double moneyAmount) {
		// Exit function if all parameters are not satisfied
		if (accountFrom == null || moneyAmount <= 0) {
			return;
		}
		// Creates a new Transaction with an operation of MONEY_TRANSFER_RECEIVE
		Transaction newTransaction = new Transaction(accountFrom, this, moneyAmount,
				StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
		// Adds new Transaction to list of transactions
		addTransaction(newTransaction);
	}
	
	/**
	 * Overrides toString method
	 * Returns string of Account id
	 */
	@Override
	public String toString() {
		return "Account ID: " + this.id;
	}
	
	/**
	 * Returns array of Account's transactions
	 * @return Transaction[]
	 */
	public Transaction[] getTransactions() {
		// Number of valid transactions of an Account
		int validTransactionsCount = 0;
		// Runs a loop through transactions
		for (Transaction transaction : transactions) {
			if (transaction != null) {
				// Increase vaidTransactionsCount by 1 if a transaction is not null
				validTransactionsCount++;
			}		
		}
		// Initialize validTransactionsList to a new array of Transactions with length validTransactionsCount 
		Transaction[] validTransactionsList = new Transaction[validTransactionsCount];
		// Keeps track of current Index of validTransactionsList to insert a transaction
		int currIndex = 0;
		// Adds all valid transactions to validTransactionsList
		for (Transaction transaction : transactions) {
			if (transaction != null) {
				validTransactionsList[currIndex] = transaction;
				currIndex++;
			}
		}
		// Returns validTransactionsList
		return validTransactionsList;
	}
	
	/**
	 * Adds a transaction to transactions
	 * @param transaction
	 */
	private void addTransaction(Transaction transaction) {
		// Exit function if all parameters are not satisfied
		if (transaction == null) {
			return;
		}
		// If transactions is full
		if (transactions.length <= lastTransactionIndex) {
			// Creates a copy of transactions with length twice of current transactions array
			transactions = Arrays.copyOf(transactions, transactions.length << 1);
		}
		// Adds transaction to transactions
		transactions[lastTransactionIndex] = transaction;
		lastTransactionIndex++;
	}
	
	public static class Transaction {
		// Fields
        private Account accountFrom;
        private Account accountTo;
        private double moneyAmount;
        private StandardAccountOperations operation;
        
        // Constructor
        private Transaction(Account accountFrom, Account accountTo, double moneyAmount, StandardAccountOperations operation) {
        	this.accountFrom = accountFrom;
        	this.accountTo = accountTo;
        	this.moneyAmount = moneyAmount;
        	this.operation = operation;
        }
        // Gets accountFrom
		public Account getAccountFrom() {
			return accountFrom;
		}
		// Sets accountFrom
		public void setAccountFrom(Account accountFrom) {
			this.accountFrom = accountFrom;
		}
		// Gets accountTo
		public Account getAccountTo() {
			return accountTo;
		}
		// Sets accountTo
		public void setAccountTo(Account accountTo) {
			this.accountTo = accountTo;
		}
		// Gets moneyAmount
		public double getMoneyAmount() {
			return moneyAmount;
		}
		// Sets moneyAmount
		public void setMoneyAmount(double moneyAmount) {
			this.moneyAmount = moneyAmount;
		}
		// Gets operation
		public StandardAccountOperations getOperation() {
			return operation;
		}
		// Sets operation
		public void setOperation(StandardAccountOperations operation) {
			this.operation = operation;
		}
		
		/**
		 * Overrides toString method
		 * Returns string form of a transaction 
		 */
		@Override
		public String toString() {
			return "Transaction [accountFrom=" + accountFrom + ", accountTo=" + accountTo + ", moneyAmount=" + moneyAmount
					+ ", operation=" + operation + "]";
		}
        
	}

}