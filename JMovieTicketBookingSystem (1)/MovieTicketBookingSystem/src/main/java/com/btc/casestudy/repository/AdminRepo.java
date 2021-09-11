package com.btc.casestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.btc.casestudy.model.Admin;
import com.btc.casestudy.model.Theater;

public interface AdminRepo extends JpaRepository<Admin, Long> 
{
	
	@Query("from Admin where adminEmail=:email")
	public boolean existsByEmail(String email);


}
