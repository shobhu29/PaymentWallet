package com.capg.repo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.capg.beans.Customer;
import com.capg.beans.Wallet;

public class WalletRepoImpl implements WalletRepo{
	
	Map<String,Customer> cmap = new HashMap<>();
	

	public WalletRepoImpl(){
		
		cmap.put("9711377939", new Customer("shobhit","9711377939",new Wallet(BigDecimal.valueOf(2000))));
		cmap.put("9711292298", new Customer("saurabh","9711292298",new Wallet(BigDecimal.valueOf(4000))));
		cmap.put("7309311150", new Customer("alok","7309311150",new Wallet(BigDecimal.valueOf(1000))));
		cmap.put("9450042756", new Customer("aditya","9450042756",new Wallet(BigDecimal.valueOf(40))));


	}
		@Override
		public boolean save(Customer customer){
			
			if(customer!=null){
				
				cmap.put(customer.getMobileno(), customer);
				return true;
			}
			
			return false;
		}
		
		@Override
		public Customer findCustomer(String mobileno){
			
			if(cmap.containsKey(mobileno)){
			Customer customer = cmap.get(mobileno);
			
			return customer;
		}
		return null;
	}
}
