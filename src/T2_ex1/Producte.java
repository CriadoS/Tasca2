package T2_ex1;

public class Producte {
	
	private String nom; 
	private float preu;
	
	public Producte(String nom, float preu) {
		
		this.nom = nom;
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public float getPreu() {
		return preu;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	public String toString() {
		return " El  producte és nom=" + this.nom + ", i té un preu de " + this.preu + "]";
		
		
	} 
	
	
	
	

}
