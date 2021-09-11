package com.btc.casestudy.services;

import java.util.List;

import com.btc.casestudy.model.Customer;
import com.btc.casestudy.model.Movie;

public interface ICustomerService {

	public Customer regCustomer(Customer customer);

	public List<Customer> getAllCustomer();
	
	
	}

