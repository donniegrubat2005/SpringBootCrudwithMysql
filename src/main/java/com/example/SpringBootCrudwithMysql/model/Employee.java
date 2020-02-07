package com.example.SpringBootCrudwithMysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
@Column(name = "id")	
 private Long id;
 
 @Column(name = "firstname")
 private String firstname;
 
 @Column(name = "lastname")
 private String lastname;
 
 @Column(name = "address")
 private String address;

 public Employee() {
	 super();
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}



}


