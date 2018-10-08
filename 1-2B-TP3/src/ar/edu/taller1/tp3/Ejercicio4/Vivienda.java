package ar.edu.taller1.tp3.Ejercicio4;

import java.util.ArrayList;

public class Vivienda {
	
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda (Direccion direccion) {
		this.direccion = direccion;
		personas = new ArrayList<Persona>();
		muebles = new ArrayList<Mueble>();
	}
	
	public void agregarPersona(Persona persona) {
		personas.add(persona);
	}
	
	

}
