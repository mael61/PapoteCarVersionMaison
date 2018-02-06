package model;

public class message {
	int id;
	utilisateur destinataire;
	utilisateur expediteur;
	String contenu;
	
	
	public message(int id, utilisateur destinataire, utilisateur expediteur, String contenu) {
		this.id = id;
		this.destinataire = destinataire;
		this.expediteur = expediteur;
		this.contenu = contenu;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public utilisateur getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(utilisateur destinataire) {
		this.destinataire = destinataire;
	}
	public utilisateur getExpediteur() {
		return expediteur;
	}
	public void setExpediteur(utilisateur expediteur) {
		this.expediteur = expediteur;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

}
