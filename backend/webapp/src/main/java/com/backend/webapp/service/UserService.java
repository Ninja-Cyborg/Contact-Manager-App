package com.backend.webapp.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.webapp.model.User;
import com.backend.webapp.repo.UserRepo;

@Service
public class UserService {
	private final UserRepo userRepo;
	
	@Autowired
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public User addUser(User user) {
		user.setUserId(UUID.randomUUID().toString());
		return userRepo.save(user);
	}
	
	public List<User> findAllUser(){
		return userRepo.findAll();
	}
	
	public Optional<User> findUserById(Long id) {
		return userRepo.findById(id);
	}
	
	public User updateUser(User user) {
		return userRepo.save(user);
	}
	
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}
}
