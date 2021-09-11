package com.btc.casestudy.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.btc.casestudy.model.Admin;
import com.btc.casestudy.model.Customer;
import com.btc.casestudy.model.Movie;
import com.btc.casestudy.dto.Movie_Theater;
import com.btc.casestudy.model.Theater;
import com.btc.casestudy.repository.MovieRepo;
import com.btc.casestudy.repository.TheaterRepo;
import com.btc.casestudy.services.AdminService;
import com.btc.casestudy.services.ICustomerService;
import com.btc.casestudy.services.IMovieService;
import com.btc.casestudy.services.ITheaterService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class AdminController 
{
	@Autowired
	AdminService aservice;
	
	@Autowired
	ITheaterService tservice;
	
	@Autowired
	IMovieService mservice;
	
	@Autowired
	ICustomerService cservice;
	
	
	@PostMapping("/users/customer/reg")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Customer regCustomer(@RequestBody Customer customer, HttpServletRequest request) {
		
		Customer savedCustomer = cservice.regCustomer(customer);
		return savedCustomer;
			
	}
	
	
	@PostMapping("/users/admin")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Admin addAdmin(@RequestBody Admin admin, HttpServletRequest request) {
		
		Admin savedAdmin = aservice.addAdmin(admin);
		return savedAdmin;
			
	}
	
	
	@GetMapping("/users/admin")
	public List<Admin> getAllAdmins(){
		return aservice.getAllAdmins();
	}

	@GetMapping("/users/customer")
	public List<Customer> getAllCustomer(){
		return cservice.getAllCustomer();
	}
	
	@PostMapping("/users/admin/theater")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Theater addTheater(@RequestBody Theater theater, HttpServletRequest request) {
		
		Theater savedTheater = tservice.addTheater(theater);
		return savedTheater;
			
	}
	
	@GetMapping("/users/public/theater")
	public List<Theater> getAllTheater(){
		return tservice.getAllTheater();
	}
	
	@DeleteMapping("/users/admin/theater/{id}")
	public boolean deleteTheaterById(@PathVariable("id") long id) {
		return tservice.deleteTheater(id);
	}
	
	
	
	@PostMapping("/users/admin/movie")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Movie addMovie(@RequestBody Movie_Theater movieT, HttpServletRequest request) 
	{
		
		Movie savedMovie = mservice.addMovie(movieT);
		return savedMovie;		
	}
	
	@GetMapping("/users/public/movie")
	public List<Movie_Theater> getAllMovie(){
		return mservice.getAllMovie();
	}
	

	
	@DeleteMapping("/users/admin/movie/{id}")
	public boolean deleteMovieById(@PathVariable("id") long id) {
		return mservice.deleteMovie(id);
	}
	
	
	@GetMapping("/users/customer/theater/{theaterCity}")
	public List<Theater> getTheaterByCity(@PathVariable("theaterCity") String city)

	{
		return tservice.getTheaterByCity(city);
	}
	
	@GetMapping("/users/customer/theaterName/{theaterName}")
	public List<Movie> getMovieByTheaterName(@PathVariable("theaterName") String tname)

	{
		return mservice.getMovieByTheaterName(tname);
	}
	
	
	
	
	
	
	
	
}
