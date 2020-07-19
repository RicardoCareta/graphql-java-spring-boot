package com.pds.graphqljava.user.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.pds.graphqljava.exception.NotFoundException;
import com.pds.graphqljava.user.User;
import com.pds.graphqljava.user.UserService;

@Component
public class UserMutation implements GraphQLMutationResolver{

	@Autowired
	private UserService userService;

	public User addUser (String name, String email, String password) {
		return userService.addUser(name, email, password);
	}
	
	public User addUserMovieFavorite (String idUser, String idMovie) throws NotFoundException {
		return userService.addUserMovieFavorite(idUser, idMovie);
	}
}
