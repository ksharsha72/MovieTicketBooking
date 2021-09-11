package com.btc.casestudy.services;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btc.casestudy.exception.MovieNotFound;
import com.btc.casestudy.exception.TheaterAlreadyExists;
import com.btc.casestudy.exception.TheaterNotFound;
import com.btc.casestudy.model.Movie;
import com.btc.casestudy.model.Theater;
import com.btc.casestudy.repository.MovieRepo;
import com.btc.casestudy.repository.TheaterRepo;

@Service
@Transactional
public class TheaterServiceImpl implements ITheaterService
{
	
	@Autowired
	TheaterRepo trepo;

	@Override
	public Theater addTheater(Theater theater) 
	{
		if(trepo.existsById(theater.getTheaterId())) {
			throw new TheaterAlreadyExists("Theater with Id ["+theater.getTheaterId()+"] already exists");
		}
		return trepo.save(theater);

	}

	@Override
	public List<Theater> getAllTheater() {
		return trepo.findAll();
	}

	@Override

	public boolean deleteTheater(long id) {
		
		if(trepo.existsById(id))
		{
			trepo.deleteById(id);
		    return !trepo.existsById( id);
		}
		else
		{
			throw new TheaterNotFound("Theater with Id ["+id+"] not found");
		}
		    
		}

	@Override
	public List<Theater> getTheaterByCity(String city) {
		
		return trepo.findByCity(city);
	}

	

}
