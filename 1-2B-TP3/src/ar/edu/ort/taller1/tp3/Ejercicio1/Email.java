package ar.edu.ort.taller1.tp3.Ejercicio1;

public class Email {
	
	private String cuenta;
	private String dominio;
	
	public Email (String email) {
		String [] splitEmail = email.split("@");
		this.cuenta = splitEmail[0];
		this.dominio = splitEmail[1];
	}
	
	public String getValor() {
		return this.cuenta+"@"+this.dominio;
	}
	
	

}
