package com.fstg.ConservationProject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Concerverie {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String adresse;
	private String president;
	private String prefecture;
	private String commune;
	private String province;
	private int nombreDeMembre;
	public String getPrefecture() {
		return prefecture;
	}
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune = commune;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Concerverie(long id, String adresse, String president,String province, String commune, String prefecture) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.province = province;
		this.president = president;
		this.commune = commune;
		this.prefecture = prefecture;

	}
	public Concerverie() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public int getNombreDeMembre() {
		return nombreDeMembre;
	}
	public void setNombreDeMembre(int nombreDeMembre) {
		this.nombreDeMembre = nombreDeMembre;
	}
	
}
