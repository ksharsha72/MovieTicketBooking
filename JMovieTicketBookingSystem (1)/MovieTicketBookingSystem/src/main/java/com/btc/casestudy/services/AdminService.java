package com.btc.casestudy.services;

import java.util.List;

import com.btc.casestudy.model.Admin;
import com.btc.casestudy.model.Movie;
import com.btc.casestudy.model.Theater;


public interface AdminService 
{
   public Admin addAdmin(Admin admin);
   public List<Admin> getAllAdmins();
}
