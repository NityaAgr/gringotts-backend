package com.grinngotts.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
* /entities/User.java
**/
@Entity
@Table(name = "users")
@Inheritance
//(strategy = InheritanceType.JOINED)
public class User {
 @Id
 private String username;
 @Column(nullable = false)   //
 private String password;
 @Column(nullable = false)
 private int userType;
 @Column(nullable = false, unique = true)
 private String email;
 @Column(nullable = false)
 private String name;
 @ManyToMany
 private Set<Segment> Segment;
 public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getUserType() {
	return userType;
}
public void setUserType(int userType) {
	this.userType = userType;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public Date getBornDate() {
	return bornDate;
}
public void setBornDate(Date bornDate) {
	this.bornDate = bornDate;
}
@Column(nullable = false)
 private String lastName;
 private String tel;
 private Date bornDate;
}