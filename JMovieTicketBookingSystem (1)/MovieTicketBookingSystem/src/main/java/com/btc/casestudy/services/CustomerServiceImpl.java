package com.btc.casestudy.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btc.casestudy.exception.CustomerAlreadyExists;
import com.btc.casestudy.model.Customer;
import com.btc.casestudy.repository.CustomerRepo;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService 
{
	
	@Autowired 
	CustomerRepo crepo;

	@Override
	public Customer regCustomer(Customer customer) {
		return crepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return crepo.findAll();
	}

}
