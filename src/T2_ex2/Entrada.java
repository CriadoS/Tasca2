package T2_ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	private static Scanner entrada = new Scanner(System.in);
	
	public static byte llegirByte(String missatge) throws InputMismatchException {
		
		byte dadaUser= 0;
		boolean correcte = true; 
		
		do {

			System.out.println(missatge);
			
			try {
				
				dadaUser = entrada.nextByte();
				correcte = true;
				System.out.println("El número introduit és correcte");
					
			}catch(InputMismatchException e) { //Haig d'importar el java.util sino dona problemes
				
				System.out.println("ERROR!!, Has d'introduir un número dins del rang (-127 / 128)"
						+ " error del tipus: " + e.getClass());
				entrada.nextLine();	// netejar el buffer	
				correcte = false;
			}
		}while(!correcte);
		
	return dadaUser;
	}
	public static int llegirInt(String missatge) throws InputMismatchException {
		
		int dadaUserEnter= 0;
		boolean correcte = true;
			
		do {
            
			System.out.println(missatge);
			
			try {
				
				dadaUserEnter = entrada.nextInt();
				correcte = true;
				System.out.println("El número introduit és correcte");
					
			}catch(InputMismatchException e) { //Haig d'importar el java.util sino dona problemes
				
				System.out.println("ERROR!!, Has d'introduir un número enter, error del tipus: " + e.getClass());
				entrada.nextLine();
				correcte = false;					
			}
			
		}while(!correcte);
		
	return dadaUserEnter;	
	}
	public static float llegirFloat(String missatge) throws InputMismatchException {	
		
		float dadaUserFloat = 0f;
		boolean correcte = true;
		
		do {
            
			System.out.println(missatge);
			
			try {
				
				dadaUserFloat = entrada.nextFloat();
				correcte = true;
				System.out.println("El número introduit és correcte");
					
			}catch(InputMismatchException e) { //Haig d'importar el java.util sino dona problemes
				
				System.out.println("ERROR!!, Has d'introduir un número enter, error del tipus: " + e.getClass());
				entrada.nextLine();
				correcte = false;					
			}
			
		}while(!correcte);
		
	return dadaUserFloat;
	}
	
	public static double llegirDouble(String missatge) throws InputMismatchException {
		
		double dadaUserDouble = 0; 
		boolean correcte = true;
		
		do {
            
			System.out.println(missatge);
			
			try {
				
				dadaUserDouble = entrada.nextDouble();
				correcte = true;
				System.out.println("El número introduit és correcte");
					
			}catch(InputMismatchException e) { //Haig d'importar el java.util sino dona problemes
				
				System.out.println("ERROR!!, Has d'introduir un número double, error del tipus: " + e.getClass());
				entrada.nextLine();
				correcte = false;					
			}
			
		}while(!correcte);
		
	return dadaUserDouble;
	}
	public static char llegirChart(String missatge) throws Exception {
		
		char dadaUserChart = 'b';
		String prova = " ";
		boolean correcte = true; 
		boolean numero = true; 
		
		do {
            
			System.out.println(missatge);
			
			try {
				
				prova = entrada.next();
				
				if (prova.length() == 1 ) { // Si té llarg 1
					
					dadaUserChart = prova.charAt(0); // guardar el chart
					
					numero = Character.isDigit(dadaUserChart); // miro que no sigui número
					
					if (!numero) {
						
						System.out.println("La lletra introduida és correcte: " + dadaUserChart);
						correcte = true;
						
					}
					else {
						
						throw new Exception();
					}
					
				}
				else {
					
					throw new Exception();
				}
				
			}catch(Exception e) {
				
				System.out.println("ERROR!!, Has d'introduir una lletra, error del tipus: " + e.getClass());
				entrada.nextLine();
				correcte = false;					
			}
			
		}while(!correcte);
		
			
	return dadaUserChart;
			
	}
	public static String llegirString(String missatge) throws Exception {
		
		String dadaUserString = "";
		boolean correcte = false; 
		
		do {
            
            System.out.println(missatge);
			
			try {
				
				dadaUserString = entrada.next();
				//entrada.next();// llegir caracters!!
					
				for(int i = 0; i<dadaUserString.length() ; i++) {
					
					if (Character.isDigit(dadaUserString.charAt(i))) { // si es un digit que salti l'exepcio  
						
						 throw new Exception();
						
					}
					else {
						
					    System.out.println("La frase introduida és correcte: " + dadaUserString);
						correcte = true;
					}
					
				}
								
			}catch(Exception e) {
				
				System.out.println("ERROR!!, Has d'introduir una frase, error del tipus: " + e.getClass());
				//entrada.nextLine();
				correcte = false;					
			}
			
		}while(!correcte);

		
	return dadaUserString;
	}
	
	public static boolean llegirBoolean(String missatge) throws Exception {
		
		boolean resultat = true;
		boolean correcte = false;
		char lletra = ' ';
		
		
		do {
			
			System.out.println(missatge);
			
			try {
				lletra = entrada.next().charAt(0);
				
				if(lletra == 's') {
					
					System.out.println("El valor introduit és correcte: " + lletra);
					correcte = true; 
					resultat = true;
					
				}
				else if(lletra == 'n'){
					
					System.out.println("El valor introduit és correcte: " + lletra);
					correcte = true;
					resultat = true;
				}
				else {
					
					throw new Exception();
				}
				
			}catch(Exception e) {
				
				System.out.println("ERROR!!, Has d'introduir s o n, error del tipus: " + e.getClass());
				correcte = false;
				
			}			
			
		}while(!correcte);
		
	return resultat;	
	}

	
	

}
