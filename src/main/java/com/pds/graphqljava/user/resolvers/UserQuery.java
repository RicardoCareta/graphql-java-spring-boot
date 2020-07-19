package com.pds.graphqljava.user.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pds.graphqljava.user.User;
import com.pds.graphqljava.user.UserService;

@Component 
public class UserQuery implements GraphQLQueryResolver{

	@Autowired
	private UserService userService;
	
	public List<User> getUsers () {
		return userService.getUsers();
	}
}
