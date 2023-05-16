package T2_ex1;

public class VendaBuidaException extends ArrayIndexOutOfBoundsException {
	
	public VendaBuidaException (){} // és recomanable posar-lo buit, per si no vull posar missatge d'excepció
	
	public VendaBuidaException(String missatge) {
		
		super(missatge);
	}
}
