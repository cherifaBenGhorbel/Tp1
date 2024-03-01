package exercice2;

import java.util.HashMap;
import java.util.Map;

public class Annuaire {

	private Map<String, Fiche> anuaire;

	public Annuaire() {
		this.anuaire = new HashMap<>();
	}
	
	public void addAnuaire(Fiche f) {
		this.anuaire.put(f.getNom(), f);
	}
	
	public Fiche getAnuaire(String nom) {
		return this.anuaire.get(nom);
	}

	 
	public Map<String, Fiche> getAnuaire() {
		return anuaire;
	}

	public void setAnuaire(Map<String, Fiche> anuaire) {
		this.anuaire = anuaire;
	}

	public void afficherAnuaire() {
	    if (this.anuaire.isEmpty()) {
	        System.out.println("L'annuaire est vide.");
	    } else {
	        System.out.println("Contenu de l'annuaire :");
	        for (Map.Entry<String, Fiche> entry : anuaire.entrySet()) {
	            Fiche f = entry.getValue();
	            System.out.println(f.toString());
	        }
	    }
	}

}
