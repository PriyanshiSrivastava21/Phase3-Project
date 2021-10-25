package com.simplilearn.webservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart_details")
public class Cart {
	@Id
	@GeneratedValue(generator="increment")
	@Column(name="Cart_id")
	private long id;
	
	@Column(name="cart_name")
	private String name;
	
//	@Column(name="user_role")
//	@Enumerated(EnumType.STRING)
	//private String role;
	
	
	public Cart() {
		super();
	}


	public Cart(long id, String name) {
		super();
		this.id = id;
		this.name = name;
//		this.role = role;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


//	public String getRole() {
//		return role;
//	}
//
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//

	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
