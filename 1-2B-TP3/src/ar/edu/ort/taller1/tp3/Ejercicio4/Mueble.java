package ar.edu.ort.taller1.tp3.Ejercicio4;

public class Mueble {
	
	private String nombre;
	private String material;
	private String color;
	
	public Mueble(String nombre, String material, String color){
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	
	public String getMueble(){
		return this.nombre + " de " + this.material + " color " + this.color;
	}	

}
