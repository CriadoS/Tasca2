package T2_ex1;

import java.util.ArrayList;

public class Venda {
	
	private ArrayList<Producte> productes = new ArrayList<Producte>();
	private float preuTotal;
	
	public Venda(ArrayList<Producte> productes) {
		
		this.productes = productes;
		this.preuTotal = 0;
	}

	public ArrayList<Producte> getProductes() {
		return productes;
	}

	public float getPreuTotal() {
		return preuTotal;
	}

	public void setProductes(ArrayList<Producte> productes) {
		this.productes = productes;
	}

	public void setPreuTotal(float preuTotal) {
		this.preuTotal = preuTotal;
	}
	
	public float calcularTotal() throws VendaBuidaException {
				
			if(productes.size()> 0) {
				
				for(Producte p : productes) {
					
					//recorre tot i sumar el preu 
					
					preuTotal = preuTotal + p.getPreu();									
				}
			}
			else {
				
				throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
			}
  					
		return preuTotal;	
	}
		
	@Override
	public String toString() {
		return " la venda  té els següents productes:" + this.productes + ", i un preuTotal de " + this.preuTotal + "]";
	} 
	
	
	
	
	
	

}
