package com.pds.graphqljava.user;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.pds.graphqljava.movies.Movie;

@Entity
public class User {

	@Id
	private UUID id;
	private String name;
	private String email;
	private String password;
	
	@OneToMany(fetch = FetchType.EAGER)
	public List<Movie> favorites;
	
	public User() {
		this.id = UUID.randomUUID();
		favorites = new ArrayList<>();
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public List<Movie> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Movie> favorites) {
		this.favorites = favorites;
	}
}
