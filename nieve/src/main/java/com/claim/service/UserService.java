package com.claim.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.claim.entity.User;
import com.claim.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void save(User user) {
		userRepository.save(user);
		List<User> users = new ArrayList<>();
		users.add(user);
	}
	public User findUserByLogin(String email, String password) {
		return userRepository.findUserByLogin(email, password);
	}
}
