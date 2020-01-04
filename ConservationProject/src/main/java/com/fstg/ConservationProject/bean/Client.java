package com.fstg.ConservationProject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String codenational;
    private String nom;
    private String prenom  ;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCodeNational() {
		return codenational;
	}
	public void setCodeNational(String codeNational) {
		this.codenational = codeNational;
	}
	public String getName() {
		return nom;
	}
	public void setName(String name) {
		this.nom = name;
	}
	public Client() {
		super();
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
	public Client(Long id, String codeNational, String nom, String prenom, Dossier dossier) {
		super();
		this.id = id;
		this.codenational = codeNational;
		this.nom = nom;
		this.prenom = prenom;
	}
}
