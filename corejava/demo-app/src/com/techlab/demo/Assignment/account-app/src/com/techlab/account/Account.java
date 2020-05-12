package com.techlab.account;

public class Account {
	
	private double balance;
	private String name, accountNumber;
	private static final double MINIMUM_BALANCE = 500;  
	public boolean CAN_WITHDRAW = false;
	
	// Constructors
	public Account(String name, double amount) {
		this.name = name;
		this.balance = amount;
		this.accountNumber = setAccountNumber();
	}
	
	public Account(String name) {
		this(name, MINIMUM_BALANCE);
	}
	
	// Getters
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	// Other Methods
	public String setAccountNumber() {
		return getName()+""+getName().hashCode();
	}
	
	public void deposit(double balance) {
		this.balance = this.balance + balance;
	}
	
	public void withdraw(double amt) {
		
		if ((balance - amt) > 500) {
			balance = balance - amt;
			CAN_WITHDRAW = true;
		}
	}
	
}
