package com.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User{
private @Id @GeneratedValue Long id;
private String firstName;
private String lastName;

public User() {
	
}
public User(String firstName,String lastName) {
	this.firstName =firstName;
	this.lastName=lastName;
}
}
