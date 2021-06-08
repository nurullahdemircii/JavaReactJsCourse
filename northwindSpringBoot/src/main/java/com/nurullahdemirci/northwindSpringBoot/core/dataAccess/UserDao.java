package com.nurullahdemirci.northwindSpringBoot.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nurullahdemirci.northwindSpringBoot.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	User getByEmail(String email); // = User findByEmail(String email); findBy ve getBy ayni isi yapar.
	
}
