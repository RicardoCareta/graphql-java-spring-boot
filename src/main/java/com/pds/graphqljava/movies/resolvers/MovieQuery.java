package com.pds.graphqljava.movies.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pds.graphqljava.movies.Movie;
import com.pds.graphqljava.movies.MovieService;

@Component
public class MovieQuery implements GraphQLQueryResolver{

	@Autowired
	private MovieService movieService;
	
	public List<Movie> getMovies () {
		return movieService.getMovies();
	}
}
