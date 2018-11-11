package ar.edu.ort.taller1.tp4.Ejercicio5;

import ar.edu.ort.taller1.tp4.util.RangoDeEnteros;

public class Persona {
	private String nombreCompleto;
	private int anioNacimiento;
	private int dni;
	private boolean vive;
	public boolean vive() {
		return vive;
	}

	
	public Persona(String nombreCompleto,int dni,int anioNacimiento){

		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
		this.anioNacimiento = anioNacimiento;
	
	}
}
