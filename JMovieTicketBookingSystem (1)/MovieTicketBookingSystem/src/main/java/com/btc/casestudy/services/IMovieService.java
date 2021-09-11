package com.btc.casestudy.services;

import java.util.List;

import com.btc.casestudy.model.Movie;
import com.btc.casestudy.dto.Movie_Theater;

public interface IMovieService 
{
	
	public Movie addMovie(Movie_Theater movie);
	   public List<Movie_Theater> getAllMovie();
	   public boolean deleteMovie(long id);
	public List<Movie> getMovieByTheaterName(String tname);

}
