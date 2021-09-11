package com.btc.casestudy.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.btc.casestudy.model.Movie;
import com.btc.casestudy.model.Theater;

public interface MovieRepo extends JpaRepository<Movie, Long>
{   	
}
