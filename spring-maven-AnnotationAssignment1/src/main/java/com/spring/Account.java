package com.spring;

public class Account {
	
	
	private int accountNo;
	private float balance;
	
	public int getAccountNo() {
		return accountNo;
	}  
	public void setAccountNo(int accountNo) { 
		this.accountNo = accountNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	

}
