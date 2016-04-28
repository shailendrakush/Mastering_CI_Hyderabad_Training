package com.cg.demo.repo;

import com.cg.demo.beans.Account;
//test
public interface AccountRepository {

	public boolean save(Account a);
	
	public Account findByAccountnumber(int accountNumber);
}
