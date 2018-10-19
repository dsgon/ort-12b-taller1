package ar.edu.ort.taller1.tp3.Ejercicio5;

public class Direccion {
	private String calle;
	private String altura;
	
	public Direccion(String calle, String altura){
		this.calle = calle;
		this.altura = altura;
	}
	
	public String getDireccion(){
		return "Direccion: " + this.calle + " " + this.altura; 
	}
	
	public String getCalle(){
		return this.calle;
	}
	
	public String getAltura(){
		return this.altura;
	}

}
