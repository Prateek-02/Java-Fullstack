package com.capg.springboot.service;

import java.util.List;

import com.capg.springboot.entities.Movie;


public interface MovieServicel {
	   Movie AddMovie(Movie movie);
 
	   Movie findMovieById(long mId);
		
	   Movie updateMovie(Movie movie); 
		
	   List<Movie> findAllMovies();
		
	   void deleteMovie(long mId);
}
