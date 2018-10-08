package ar.edu.taller1.tp3.Ejercicio4;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona (String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+this.nombre+" "+this.apellido+", Edad: "+this.edad;
	}

}
