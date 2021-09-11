package com.btc.casestudy.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
	
	@TableGenerator(initialValue = 1000, allocationSize = 100, name = "Admin_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long adminId;
	
	@Column(name="Admin_Name" , nullable = false, length = 50)
	private String adminName;
	
	@Id
	@Column(name="Admin_Email" , unique = true, nullable = false, length = 50)
	private String adminEmail;
	
	@Column(name="Admin_Password" , nullable = false)
	@Size(min=8 , max=10)
	private String adminPassword;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="Admin_DOB" , nullable = false)
	private LocalDate adminDob;
	
	@Column(name="Admin_Contact" , nullable = false, length = 10)
	private long adminContact;

}
