package com.simplilearn.webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.webservices.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
