package com.btc.casestudy.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer 
{
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	
	@Column(name="Customer_Name" , nullable = false, length = 50)
	private String customerName;
	
	@Id
	@Column(name="Customer_Email" , unique = true, nullable = false, length = 50)
    private String customerEmail;
	
	@Column(name="Customer_Password" , nullable = false)
	@Size(min=8 , max=10)
	private String customerPassword;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="Customer_DOB" ,  nullable = false)
	private LocalDate dateOfBirth;
	
	@Column(name="Customer_Contact" ,  nullable = false, length = 10)
	private long customerContact;
	
}
