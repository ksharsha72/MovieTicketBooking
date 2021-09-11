package com.btc.casestudy.services;

import java.util.List;

import com.btc.casestudy.model.Movie;
import com.btc.casestudy.model.Theater;

public interface ITheaterService 
{
	
	   public Theater addTheater(Theater theater);
	   public List<Theater> getAllTheater();
	   public boolean deleteTheater(long id);
	   public List<Theater> getTheaterByCity(String city);
}
