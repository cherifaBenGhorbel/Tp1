package exercice2;

public class Fiche {
	private String nom;
    private String numero;
    private String adresse;
    
    

	public Fiche(String nom, String numero, String adresse) {
		this.nom = nom;
		this.numero = numero;
		this.adresse = adresse;
	}
	
	

	@Override
	public String toString() {
		return "Name = " + this.getNom() + "\n Number = " + this.getNumero() + "\n Adresse = " + this.getAdresse() + "\n";
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	

}
