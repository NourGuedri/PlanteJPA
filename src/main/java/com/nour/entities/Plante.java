package com.nour.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plante implements Serializable{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	//pour autoincrement
	private Long idPlante;
	private String nomPlante;
	private String couleur;
	public Plante() {
	super();
	}
	public Plante(String nomPlante, String couleur) {
	super();
	this.nomPlante = nomPlante;
	this.couleur = couleur;
	}
	public Long getIdPlante() {
	return idPlante;
	}
	public void setIdPlante(Long idPlante) {
	this.idPlante = idPlante;
	}
	public String getNomPlante() {
	return nomPlante;
	}
	public void setNomPlante(String nomPlante) {
	this.nomPlante = nomPlante;
	}
	public String getCouleur() {
	return couleur;
	}
	public void setCouleur(String couleur) {
	this.couleur = couleur;
	}
	@Override
	public String toString() {
	return "Plante [idPlante=" + idPlante + ", nomPlante=" +
			nomPlante + ", couleur=" + couleur + "]";
	}
}
