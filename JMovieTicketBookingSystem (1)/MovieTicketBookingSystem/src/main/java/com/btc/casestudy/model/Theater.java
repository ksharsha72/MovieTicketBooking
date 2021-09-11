package com.btc.casestudy.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Theater 
{
	
	@Id
	@Column(nullable=false)
	private long theaterId;
	
	@Column(name="Theater_Name" , nullable = false, length = 50)
	private String theaterName;
	
	@Column(name="Theater_City" , nullable = false, length = 50)
	private String theaterCity;
	
	@JsonIgnore
	@OneToMany(mappedBy="theater")
    private Set<Movie> movie;
	
	@Column(name="Manager_Name" , nullable = false, length = 50)
	private String managerName;
	
	@Column(name="Manager_Contact" , nullable = false, length = 10)
	private long managerContact;

}
