package com.techlab.accout;

public class SmsListner implements IListner {

	private Account account;
	private String date; 
	
	public SmsListner(Account account) {
		this.account = account;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	  
		
		if(account.getIsCredited()) {
			System.out.println("Dear Customer, your account no " + account.getAccountNumber() + " has been credited" + 
					" with amount " + account.getAmount() + ". Total Balance is " + account.getBalance() + 
					" on " + account.getDate());

		} else if (account.getIsDebited()) {
			System.out.println("Dear Customer, your account no " + account.getAccountNumber() + " has been debited" + 
					" with amount " + account.getAmount() + ". Total Balance is " + account.getBalance() +
					" on " + account.getDate());
		}
	}

}
