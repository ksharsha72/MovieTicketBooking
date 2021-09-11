package com.btc.casestudy.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.btc.casestudy.dto.ErrorResponse;
import com.btc.casestudy.exception.CustomerAlreadyExists;
import com.btc.casestudy.exception.MovieAlreadyExists;
import com.btc.casestudy.exception.MovieNotFound;
import com.btc.casestudy.exception.TheaterAlreadyExists;
import com.btc.casestudy.exception.TheaterNotFound;

@RestControllerAdvice
public class ErrorController {

	@ExceptionHandler(TheaterAlreadyExists.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ErrorResponse handleTheaterAlreadyExistsError(TheaterAlreadyExists ex, HttpServletRequest request) {
		
		ErrorResponse errResponse=new ErrorResponse(LocalDateTime.now(),
				HttpStatus.CONFLICT.value(),
				HttpStatus.CONFLICT.getReasonPhrase(),
				ex.getMessage(),
				request.getRequestURI());
		return errResponse;
	}
	
	@ExceptionHandler(MovieAlreadyExists.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ErrorResponse handleMovieAlreadyExistsError(MovieAlreadyExists ex, HttpServletRequest request) {
		
		ErrorResponse errResponse=new ErrorResponse(LocalDateTime.now(),
				HttpStatus.CONFLICT.value(),
				HttpStatus.CONFLICT.getReasonPhrase(),
				ex.getMessage(),
				request.getRequestURI());
		return errResponse;
	}
	
	@ExceptionHandler(CustomerAlreadyExists.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ErrorResponse handleCustomerAlreadyExistsError(CustomerAlreadyExists ex, HttpServletRequest request) {
		
		ErrorResponse errResponse=new ErrorResponse(LocalDateTime.now(),
				HttpStatus.CONFLICT.value(),
				HttpStatus.CONFLICT.getReasonPhrase(),
				ex.getMessage(),
				request.getRequestURI());
		return errResponse;
	}
	
	
	@ExceptionHandler(TheaterNotFound.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse handleTheaterNotFoundException(TheaterNotFound ex, HttpServletRequest request) {
		
		ErrorResponse errResponse=new ErrorResponse(LocalDateTime.now(),
				HttpStatus.NOT_FOUND.value(),
				HttpStatus.NOT_FOUND.getReasonPhrase(),
				ex.getMessage(),
				request.getRequestURI());
		return errResponse;
	}
	
	@ExceptionHandler(MovieNotFound.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse handleMovieNotFoundException(MovieNotFound ex, HttpServletRequest request) {
		
		ErrorResponse errResponse=new ErrorResponse(LocalDateTime.now(),
				HttpStatus.NOT_FOUND.value(),
				HttpStatus.NOT_FOUND.getReasonPhrase(),
				ex.getMessage(),
				request.getRequestURI());
		return errResponse;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorResponse handleOtherException(Exception ex, HttpServletRequest request) {
		
		ErrorResponse errResponse=new ErrorResponse(LocalDateTime.now(),
				HttpStatus.INTERNAL_SERVER_ERROR.value(),
				HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
				ex.getMessage(),
				request.getRequestURI());
		return errResponse;
	}
	
}
