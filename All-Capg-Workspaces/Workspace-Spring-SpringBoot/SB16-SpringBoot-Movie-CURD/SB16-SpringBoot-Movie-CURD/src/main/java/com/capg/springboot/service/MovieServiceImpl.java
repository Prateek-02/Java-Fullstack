package com.capg.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.springboot.dao.MovieDaol;
import com.capg.springboot.entities.Movie;

@Service
public class MovieServiceImpl implements MovieServicel {

    @Autowired
    private MovieDaol dao;

    @Override
    public Movie AddMovie(Movie movie) {
        return dao.AddMovie(movie);
    }

    @Override
    public Movie findMovieById(long mId) {
        return dao.findMovieById(mId);
    }

    @Override
    public Movie updateMovie(Movie movie) {
        return dao.updateMovie(movie);
    }

    @Override
    public List<Movie> findAllMovies() {
        return dao.findAllMovies();
    }

    @Override
    public void deleteMovie(long mId) {
        dao.deleteMovie(mId);
    }
}