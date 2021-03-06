package com.api.sample.service;

import java.util.List;

import com.api.sample.model.User;

public interface UserService {
	public List<User> getAll();

	public User get(final String id);

	public User save(final User user);

	public List<User> findUsersByFirstName(final String lastName);

	public List<User> findUsersByLastName(final String firstName);
	
	public List<User> findUsersByAgeBetween(final Integer ageGT, final Integer ageLT);
}
