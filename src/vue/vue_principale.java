package vue;

import model.utilisateur;
import model.ville;

import java.util.Iterator;
import controleur.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class vue_principale {
	 public static  int menuDepart() {

	        int selection;
	        Scanner input = new Scanner(System.in);
	        /***************************************************/
	        System.out.println("Menu de depart");
	        System.out.println("-------------------------\n");
	        System.out.println("1 - Inscrire");
	        System.out.println("2 - Connexion");
	        System.out.println("3 - Quitter");
	        selection = input.nextInt();
	        return selection;    
	    }
	 
	 public static ArrayList<utilisateur> inscription(ArrayList<utilisateur> Liste_Utilisateur) throws IOException {
		 utilisateur user = new utilisateur(0, null, null, null, null, null); 
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("Entre votre Login");
	     String Login = br.readLine();
	     System.out.println("Entre votre mdp");
	     String mdp = br.readLine();
	     System.out.println("Entre votre nom");
	     String Nom = br.readLine();
	     System.out.println("Entre votre prenom");
	     String Prenom = br.readLine();
	     user.setLogin(Login);
	     user.setMdp(mdp);
	     user.setNom(Nom);
	     user.setPrenom(Prenom);
	     Liste_Utilisateur.add(user);
	     return Liste_Utilisateur;
		  
	 }
	 
	 
	 public static   void Connexion(ArrayList<utilisateur> Liste_Utilisateur) throws IOException {
		 System.out.println("Verification comptes");
	
		 
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("Entre votre Login");
	     String Login = br.readLine();
	     System.out.println("Entre votre mdp");
	     String mdp = br.readLine();
	     for(int i=0;i<Liste_Utilisateur.size();i++) {
	    	 
	    	if (Liste_Utilisateur.get(i).getLogin().equals(Login) && Liste_Utilisateur.get(i).getMdp().equals(mdp)) {
	    		System.out.println("Bienvenue");
	    	}
	    	else {
	    		System.out.println("Votre compte n'existe pas ");
	    	}
	    	
	     }
	 }
	 
	 public static   void exporterUtilisateur(ArrayList<utilisateur> Liste_Utilisateur) {
		 File f = new File("test.txt");
		 try {
			 FileWriter fw = new FileWriter(f);
			 Iterator<utilisateur> itr = Liste_Utilisateur.iterator();
			 utilisateur user = null;
			
			 while(itr.hasNext()) {
				 user = (utilisateur) itr.next();
				 fw.write(user.getLogin()+"/"+user.getMdp()+"/"+user.getNom()+"/"+user.getPrenom() + "\n");
				 fw.flush(); 
			 }
			 fw.close();
			 System.out.println("Utilisateur enrigister dans le fichier ");	 
		 }
		 catch(IOException ex){
		        System.out.println (ex.toString());
		        System.out.println("Probleme Exportation du fichier");
		    }
	 }
	 
	 public static   ArrayList<utilisateur> ImporterUtilisateur(ArrayList<utilisateur> Liste_Utilisateur) throws IOException {
		 File f = new File("test.txt");
		 FileReader fr = new FileReader(f);
		 BufferedReader br = new BufferedReader(fr);	 
		 try {
			String line = br.readLine();
			 int Position =0;
			
			while(line !=null) {
				 utilisateur user = new utilisateur(Position, line, line, line, line, null);
				String[] tokens = line.split("/");
				int tour=0;
				System.out.println(line);
				line =  br.readLine();
				for (String t : tokens) {
					  System.out.println(t);
					  System.out.println(tour);
					  if(tour==0) {
						  user.setLogin(t);
						  System.out.print("ajout du login :");
						  System.out.println(t);  
					  }
					  if(tour==1) {
						  user.setMdp(t);
						  System.out.print("ajout du mdp :");
						  System.out.println(t);	  
					  }
					  if(tour==2) {
						  user.setNom(t);
						  System.out.print("ajout du nom :");
						  System.out.println(t); 
					  }
					  if(tour==3) {
						  user.setPrenom(t);
						  System.out.print("ajout du prenom :");
						  System.out.println(t);
					  }    
					tour=tour+1;
					
				}
				Liste_Utilisateur.add(Position,user);
			
				System.out.println(Position);
				System.out.println("verification"+user.getLogin()+Position);
		
				
				Position=Position+1;
			
			}
			
			 System.out.println("Nombre d'utilisateur :"+Liste_Utilisateur.size());
			 System.out.println("Nombre d'utilisateur :"+Liste_Utilisateur.get(0).getLogin());
			 System.out.println("Nombre d'utilisateur :"+Liste_Utilisateur.get(1).getLogin());
			br.close();
			fr.close();
			}
		 
		 
		 catch (IOException ex ) {
				// TODO Auto-generated catch block
				System.out.println (ex.toString());
		        System.out.println("Probleme Exportation du fichier");
			}
		 return Liste_Utilisateur; 
	 }
	 
	public static void main(String[] args) throws IOException { 
		ArrayList<utilisateur> toutlesUtilisateur = new ArrayList<utilisateur>();
		  toutlesUtilisateur=ImporterUtilisateur(toutlesUtilisateur);
		  
		
        int choix=menuDepart();

        switch (choix)
        {

          case 1:
        	  inscription(toutlesUtilisateur);
        	  exporterUtilisateur(toutlesUtilisateur);
          
            break;

          case 2:
        	  Connexion(toutlesUtilisateur);
        	  
            break;

          case 3:

            break;

        }

       
	};
}
