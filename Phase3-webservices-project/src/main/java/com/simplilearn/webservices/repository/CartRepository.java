package com.simplilearn.webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.webservices.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

}
