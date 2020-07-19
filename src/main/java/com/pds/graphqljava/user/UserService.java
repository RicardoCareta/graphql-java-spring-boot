package com.pds.graphqljava.user;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pds.graphqljava.exception.NotFoundException;
import com.pds.graphqljava.movies.Movie;
import com.pds.graphqljava.movies.MovieRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MovieRepository movieRepository;
	
	public List<User> getUsers () {
		return userRepository.findAll();
	}
	
	public User addUser (String name, String email, String password) {
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		user.setName(name);
		
		return userRepository.save(user);
	}

	public User addUserMovieFavorite(String idUser, String idMovie) throws NotFoundException {
		UUID uuidUser = UUID.fromString(idUser);
		UUID uuidMovie = UUID.fromString(idMovie);
		
		Optional<User> optUser = userRepository.findById(uuidUser);
		if (!optUser.isPresent()) {
			throw new NotFoundException("User not found");
		}
		
		User user = optUser.get();
		
		Optional<Movie> optMovie = movieRepository.findById(uuidMovie);
		if (!optMovie.isPresent()) {
			throw new NotFoundException("Movie not found");
		}
		
		user.getFavorites().add(optMovie.get());
		return userRepository.save(user);
	}
}
