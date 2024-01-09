package com.ty.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.ty.entity.MovieDetails;

@Repository
public class MovieRepo {

	public MovieDetails save(MovieDetails movieDetails) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jdbc");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
	    manager.persist(movieDetails);
		trans.commit();
		return movieDetails;
		
	}

	
}
