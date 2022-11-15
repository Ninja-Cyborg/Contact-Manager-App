package com.backend.webapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.webapp.model.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
