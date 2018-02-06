package model;

import java.util.ArrayList;

public class utilisateur {
	int id;
	String login;
	String mdp;
	String nom;
	String prenom;
	ArrayList<voiture> garages = new ArrayList<voiture>();
	
	public utilisateur(int id, String login, String mdp, String nom, String prenom, ArrayList<voiture> garages) {
		this.id = id;
		this.login = login;
		this.mdp = mdp;
		this.nom = nom;
		this.prenom = prenom;
		this.garages = garages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
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

	
}
