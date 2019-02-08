package com.capg.repo;

import com.capg.beans.Customer;

public interface WalletRepo {

	public boolean save(Customer customer);
	public Customer findCustomer(String mobileno);

}
