package model;

import java.util.ArrayList;

public class etapes {
	int id;
	ville depart;
	ville arriver;
	utilisateur conducteur;
	ArrayList<utilisateur> passagers = new ArrayList<utilisateur>();
	int nb_personnes;
	
	public etapes(int id, ville depart, ville arriver, utilisateur conducteur, ArrayList<utilisateur> passagers,
			int nb_personnes) {
		this.id = id;
		this.depart = depart;
		this.arriver = arriver;
		this.conducteur = conducteur;
		this.passagers = passagers;
		this.nb_personnes = nb_personnes;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ville getDepart() {
		return depart;
	}
	public void setDepart(ville depart) {
		this.depart = depart;
	}
	public ville getArriver() {
		return arriver;
	}
	public void setArriver(ville arriver) {
		this.arriver = arriver;
	}
	public utilisateur getConducteur() {
		return conducteur;
	}
	public void setConducteur(utilisateur conducteur) {
		this.conducteur = conducteur;
	}
	public ArrayList<utilisateur> getPassagers() {
		return passagers;
	}
	public void setPassagers(ArrayList<utilisateur> passagers) {
		this.passagers = passagers;
	}
	public int getNb_personnes() {
		return nb_personnes;
	}
	public void setNb_personnes(int nb_personnes) {
		this.nb_personnes = nb_personnes;
	}
	
	

}
