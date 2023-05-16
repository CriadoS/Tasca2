package T2_ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProductes {
	
	public static void main(String[] args) {
		
		// crear arraylist de productes
		Producte producte1 = new Producte("teclat", 12f);
			
		ArrayList<Producte> productes = new ArrayList<Producte>(); // crear el array de productes
		
		Venda venda1 = new Venda(productes); // venda 
		
		// Provant que capturi l'error 
		
		try {
			
			System.out.println(venda1.calcularTotal()); // mostra el preu total
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
			
		//Provant que no surti l'error i que faci la suma de preus
		
		System.out.println("---------------------------------------");
		
		productes.add(producte1);
		Producte producte2 = new Producte("Pantalla",60.50f);
		productes.add(producte2);
		
		try {
			
			System.out.println(venda1.calcularTotal()); // mostra el preu total
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
			
		
		
		
		
		
		

	}
}
