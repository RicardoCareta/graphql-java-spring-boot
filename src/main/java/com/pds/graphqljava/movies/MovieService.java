package com.pds.graphqljava.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public Movie addMovie (String name) {
		Movie movie = new Movie();
		movie.setName(name);
		
		return movieRepository.save(movie);
	}

	public List<Movie> getMovies() {
		return movieRepository.findAll();
	}
}
