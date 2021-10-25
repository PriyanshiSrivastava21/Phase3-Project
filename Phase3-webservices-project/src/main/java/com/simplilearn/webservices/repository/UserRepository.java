package com.simplilearn.webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.webservices.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
