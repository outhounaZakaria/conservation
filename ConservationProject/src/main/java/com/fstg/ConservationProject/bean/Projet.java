package com.fstg.ConservationProject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Projet {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String referenceProjet ;
	private String statusFiscal;
	private String numAutorisation;
	private String description;
	private String type;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatusFiscal() {
		return statusFiscal;
	}
	public void setStatusFiscal(String statusFiscal) {
		this.statusFiscal = statusFiscal;
	}
	public String getNumAutorisation() {
		return numAutorisation;
	}
	public void setNumAutorisation(String numAutorisation) {
		this.numAutorisation = numAutorisation;
	}
	public Projet(Long id, String referenceProjet, String statusFiscal, String numAutorisation, String description,
			String type) {
		super();
		this.id = id;
		this.referenceProjet = referenceProjet;
		this.statusFiscal = statusFiscal;
		this.numAutorisation = numAutorisation;
		this.description = description;
		this.type = type;
	}
	public Projet() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReferenceProjet() {
		return referenceProjet;
	}
	public void setReferenceProjet(String referenceProjet) {
		this.referenceProjet = referenceProjet;
	}
	
}
