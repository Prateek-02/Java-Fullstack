package com.capg.springboot.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.capg.springboot.entities.Movie;

@Repository
@Transactional
public class MovieDaoImpl implements MovieDaol{

	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public Movie AddMovie(Movie m) {
		return entityManager.merge(m);
	}

	@Override
	public Movie findMovieById(long mId) {
		return entityManager.find(Movie.class,mId);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		//Employee emp=entityManager.find(Employee.class,employee.getEmpId());
		Movie m=findMovieById(movie.getmId());
		m.setmName(movie.getmName());
		m.setmGenre(movie.getmGenre());
		m.setmRating(movie.getmRating());
		m=entityManager.merge(m);
		return m;
	}
	
	@Override
	public List<Movie> findAllMovies() {
		                                // Select * from Employee
		Query q = entityManager.createQuery("select m from Movie m");
	    List<Movie> list=q.getResultList();
		return list;
	}
	@Override
	public void deleteMovie(long mId) {
		Movie movie=entityManager.find(Movie.class, mId);
		entityManager.remove(movie);
	}
}