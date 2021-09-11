package com.btc.casestudy.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btc.casestudy.exception.MovieAlreadyExists;
import com.btc.casestudy.exception.MovieNotFound;
import com.btc.casestudy.model.Movie;
import com.btc.casestudy.dto.Movie_Theater;
import com.btc.casestudy.model.Theater;
import com.btc.casestudy.repository.MovieRepo;
import com.btc.casestudy.repository.TheaterRepo;

@Service
@Transactional
public class MovieServiceImpl implements IMovieService
{
	
	
	@Autowired
	MovieRepo mrepo;
	
	@Autowired
	TheaterRepo trepo;

	@Override
	public Movie addMovie(Movie_Theater movieT) {
		if(mrepo.existsById(movieT.getMovieId())) {
			throw new MovieAlreadyExists("Movie with Id ["+movieT.getMovieId()+"] already exists");
		}
		else {
		Movie movie = new Movie();
        Optional<Theater> theater = trepo.findById(movieT.getTheaterId());
        if(theater.isPresent()){
        	movie.setLanguages(movieT.getLanguages());
        	movie.setMovieDirector(movieT.getMovieDirector());
        	movie.setMovieId(movieT.getMovieId());
        	movie.setMovieLength(movieT.getMovieLength());
        	movie.setMovieName(movieT.getMovieName());
        	movie.setMovieReleaseDate(movieT.getMovieReleaseDate());
        	movie.setTheater(theater.get());
            movie = mrepo.save(movie);
        }
        return movie;
		}
	}

	@Override
	public List<Movie_Theater> getAllMovie() {
		List<Movie_Theater> mTList = new ArrayList<>();
		List<Movie> allmovie = mrepo.findAll();
		for(Movie m : allmovie)
		{
			Movie_Theater mt= new Movie_Theater(m.getMovieId() ,m.getTheater().getTheaterId() , m.getMovieName(), 
			                           m.getMovieDirector() , m.getMovieLength() ,m.getLanguages(), m.getMovieReleaseDate());
		  	mTList.add(mt);
		}
		return mTList;
	}

	@Override
	public boolean deleteMovie(long id) {
		if(mrepo.existsById(id))
		{
			mrepo.deleteById(id);
			return !mrepo.existsById( id);
		}
		else
		{
			throw new MovieNotFound("Movie with Id ["+id+"] not found");
		}
		
	}

	@Override
	public List<Movie> getMovieByTheaterName(String tname) {
		List<Movie> allMovie = new ArrayList<>();
		List<Movie> all = mrepo.findAll();
		for(Movie m : all)
		{
			if(m.getTheater().getTheaterName().equalsIgnoreCase(tname))
			{
				allMovie.add(m);
			}
		}
		return allMovie;
	}

	

}
