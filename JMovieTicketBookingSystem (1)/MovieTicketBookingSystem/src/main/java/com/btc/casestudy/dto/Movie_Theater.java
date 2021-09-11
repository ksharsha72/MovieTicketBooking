package com.btc.casestudy.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie_Theater 
{
    private long theaterId;
	private long movieId;
	private String movieName;
	private String movieDirector;
	private int movieLength;
	private String languages;
	private LocalDate movieReleaseDate;
}
