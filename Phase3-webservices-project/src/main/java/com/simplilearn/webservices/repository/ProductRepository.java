package com.simplilearn.webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.webservices.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
