package com.fstg.ConservationProject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private double num ;
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	private String nom;
	private String prenom;
	private String login;
	private String email;
	private String role;
	
	public User(Long id, String login, String email, String nom, String prenom, boolean blocked, String role) {
		super();
		this.id = id;
		this.login = login;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.role = role;
	}
	public User() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
}
