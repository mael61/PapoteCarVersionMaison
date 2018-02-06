package model;

import java.util.ArrayList;

public class trajets {
	int id;
	ArrayList<etapes> etapes = new ArrayList<etapes>();
	int nombre_etapes;
	
	public trajets(int id, ArrayList<model.etapes> etapes, int nombre_etapes) {
		super();
		this.id = id;
		this.etapes = etapes;
		this.nombre_etapes = nombre_etapes;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getNombre_etapes() {
		return nombre_etapes;
	}
	public void setNombre_etapes(int nombre_etapes) {
		this.nombre_etapes = nombre_etapes;
	}
	
	
	

}
