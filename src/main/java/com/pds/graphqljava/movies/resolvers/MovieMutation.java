package com.pds.graphqljava.movies.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.pds.graphqljava.movies.Movie;
import com.pds.graphqljava.movies.MovieService;

@Component
public class MovieMutation implements GraphQLMutationResolver {

	@Autowired
	private MovieService movieService;
	
	public Movie addMovie (String name) {
		return movieService.addMovie(name);
	}
	
}
