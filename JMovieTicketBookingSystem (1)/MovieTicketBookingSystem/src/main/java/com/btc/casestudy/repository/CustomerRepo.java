package com.btc.casestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.btc.casestudy.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer , Long>
{
    @Query("from Customer where customerEmail=:customerEmail")
	boolean existsById(String customerEmail);


}
