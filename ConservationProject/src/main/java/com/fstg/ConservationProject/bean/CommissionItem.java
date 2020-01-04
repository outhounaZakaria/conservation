package com.fstg.ConservationProject.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CommissionItem {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToMany
	private List<Dossier> dossiers;
	@OneToOne
    private Commission commission;
	@OneToOne
	private MembreCommission membreCommission;
	public CommissionItem(List<Dossier> dossiers, Commission commission, MembreCommission membreCommission) {
		super();
		this.dossiers = dossiers;
		this.commission = commission;
		this.membreCommission = membreCommission;
	}
	public CommissionItem() {
		super();
	}
	public List<Dossier> getDossiers() {
		return dossiers;
	}
	public void setDossiers(List<Dossier> dossiers) {
		this.dossiers = dossiers;
	}
	public Commission getCommission() {
		return commission;
	}
	public void setCommission(Commission commission) {
		this.commission = commission;
	}
	public MembreCommission getMembreCommission() {
		return membreCommission;
	}
	public void setMembreCommission(MembreCommission membreCommission) {
		this.membreCommission = membreCommission;
	}
	
}
