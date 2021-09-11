package com.btc.casestudy.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btc.casestudy.model.Admin;
import com.btc.casestudy.model.Movie;
import com.btc.casestudy.model.Theater;
import com.btc.casestudy.repository.AdminRepo;

@Service
@Transactional
public class AdminServiceImpl implements AdminService
{
	@Autowired
	AdminRepo arepo;
	
	

	@Override
	public Admin addAdmin(Admin admin) 
	{
		return arepo.save(admin);
	}

	@Override
	public List<Admin> getAllAdmins() 
	{
		return arepo.findAll();
	}
	
}
