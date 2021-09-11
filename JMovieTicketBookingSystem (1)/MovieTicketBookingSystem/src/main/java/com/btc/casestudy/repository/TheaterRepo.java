package com.btc.casestudy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.btc.casestudy.model.Admin;
import com.btc.casestudy.model.Theater;

public interface TheaterRepo extends JpaRepository<Theater, Long> 
{
	
	@Query("from Theater where theaterCity=:city")
	public List<Theater> findByCity(String city);
	
	

}
