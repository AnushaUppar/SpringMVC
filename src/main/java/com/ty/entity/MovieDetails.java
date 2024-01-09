package com.ty.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieDetails {
	
	@Id
	private int movieId;
	private String movieName;
	private double moviePrice;
	
	public double getMoviePrice() {
		return moviePrice;
	}
	public void setMoviePrice(double moviePrice) {
		this.moviePrice = moviePrice;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	@Override
	public String toString() {
		return "MovieDetails [movieId=" + movieId + ", movieName=" + movieName + ", moviePrice=" + moviePrice + "]";
	}
	
	
	
	
	

}
