package com.fstg.ConservationProject.bean;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Observation {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String refObservation;
	private Date dateObservation;
    private String observation;
    @ManyToOne
    private Dossier dossier;
    @OneToMany
    private List<User> users ;
	public Observation(String refObservation, Date dateObservation, String observation, Dossier dossier, List<User> users) {
		super();
		this.refObservation = refObservation;
		this.dateObservation = dateObservation;
		this.observation = observation;
		this.dossier = dossier;
		this.users = users;
	}
	public Observation() {
		super();
	}
	public String getRefObservation() {
		return refObservation;
	}
	public void setRefObservation(String refObservation) {
		this.refObservation = refObservation;
	}
	public Date getDateObservation() {
		return dateObservation;
	}
	public void setDateObservation(Date dateObservation) {
		this.dateObservation = dateObservation;
	}
	public String getObservatione() {
		return observation;
	}
	public void setObservation(String message) {
		this.observation = message;
	}
	public Dossier getDossier() {
		return dossier;
	}
	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
   
    
}

