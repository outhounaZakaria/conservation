package com.fstg.ConservationProject.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class TauxTaxe {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
	    private Date dateDepartApplication;
	    private Date dateFintApplication;
	    private Double montant;
		public TauxTaxe(Long id, Date dateDepartApplication, Date dateFintApplication, Double montant,
				 Projet typeProjet) {
			super();
			this.id = id;
			this.dateDepartApplication = dateDepartApplication;
			this.dateFintApplication = dateFintApplication;
			this.montant = montant;
			
		}
		public TauxTaxe() {
			super();
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Date getDateDepartApplication() {
			return dateDepartApplication;
		}
		public void setDateDepartApplication(Date dateDepartApplication) {
			this.dateDepartApplication = dateDepartApplication;
		}
		public Date getDateFintApplication() {
			return dateFintApplication;
		}
		public void setDateFintApplication(Date dateFintApplication) {
			this.dateFintApplication = dateFintApplication;
		}
		public Double getMontant() {
			return montant;
		}
		public void setMontant(Double montant) {
			this.montant = montant;
		}
		
	    

}
