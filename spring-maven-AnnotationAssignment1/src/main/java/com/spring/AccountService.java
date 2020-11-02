package com.spring;

import org.springframework.stereotype.Component;

@Component
public class AccountService {

	public Account getAccountInfo() {

		Account account = new Account();

		account.setAccountNo(1234);
		account.setBalance(10000.34f);

		return account;

	}

	@Override
	public String toString() {
		return "AccountService [getAccountInfo()=" + getAccountInfo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}




}
