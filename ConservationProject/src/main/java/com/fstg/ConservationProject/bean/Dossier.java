package com.fstg.ConservationProject.bean;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Dossier {
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String reference;
    @ManyToOne
    private Client client;
    private Date dateArrive;
    private double  montantPaye; 
    private Date datePaiement;
    private String avis;
    private boolean traitement;
	public Dossier(Long id, String reference, Client client,  Date dateArrive, double montantPaye,
			Date datePaiement, String avis , boolean traitement) {
		super();
		this.id = id;
		this.reference = reference;
		this.client = client;
		this.dateArrive = dateArrive;
		this.montantPaye = montantPaye;
		this.datePaiement = datePaiement;
		this.avis = avis;
		this.traitement=traitement;
	}
	public Dossier() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Date getDateArrive() {
		return dateArrive;
	}
	public void setDateArrive(Date dateArrive) {
		this.dateArrive = dateArrive;
	}
	public double getMontantPaye() {
		return montantPaye;
	}
	public void setMontantPaye(double montantPaye) {
		this.montantPaye = montantPaye;
	}
	public Date getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}
	public String getAvis() {
		return avis;
	}
	public void setAvis(String avis) {
		this.avis = avis;
	}
	public boolean isTraitement() {
		return traitement;
	}
	public void setTraitement(boolean traitement) {
		this.traitement = traitement;
	}
   
}
