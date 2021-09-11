package com.btc.casestudy.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie 
{
	@Id
	@TableGenerator(initialValue = 3000, allocationSize = 100, name = "Movie_ID")
	private long movieId;
	
	@ManyToOne
    @JoinColumn(name="theater_id")
    private Theater theater;
	
	@Column(name="Movie_Name" , nullable = false, length = 50)
	private String movieName;
	
	@Column(name="Director_Name" , nullable = false, length = 50)
	private String movieDirector;
	
	@Column(name="Movie_Length" , nullable = false, length = 50)
	@Size(min=1 , max=5)
	private int movieLength;
	
	@Column(name="Languages" , nullable = false, length = 50)
	private String languages;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="Movie_Release_Date" ,  nullable = false)
	private LocalDate movieReleaseDate;

}
