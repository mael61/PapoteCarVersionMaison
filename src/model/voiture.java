package model;

public class voiture {
	int id;
	String plaque;
	String modele;
	int nombre_de_places ;
	
	
	public voiture(int id, String plaque, String modele, int nombre_de_places) {
		this.id = id;
		this.plaque = plaque;
		this.modele = modele;
		this.nombre_de_places = nombre_de_places;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaque() {
		return plaque;
	}
	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getNombre_de_places() {
		return nombre_de_places;
	}
	public void setNombre_de_places(int nombre_de_places) {
		this.nombre_de_places = nombre_de_places;
	}

}
