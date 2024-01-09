package com.ty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.entity.MovieDetails;
import com.ty.repository.MovieRepo;

@Service
public class MovieServiceImpl  implements MovieService{

	@Autowired
	private MovieRepo repo;
	
	
	@Override
	public MovieDetails saveMovie(MovieDetails movieDetails) {
		
		MovieDetails saveMovie = repo.save(movieDetails);
		if(saveMovie!=null) {
			System.out.println("DATA SAVED SUCCESSFULLY");
		}else{
			throw new IllegalArgumentException();
		}
		return saveMovie;
	}

	
	
}
