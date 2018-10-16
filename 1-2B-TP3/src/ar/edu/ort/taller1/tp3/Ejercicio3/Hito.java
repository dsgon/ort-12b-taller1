package ar.edu.ort.taller1.tp3.Ejercicio3;

import java.util.ArrayList;

import ar.edu.ort.taller1.tp3.Ejercicio1.Persona;

public class Hito {
	
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> personasInvolucradas;
	
	public Hito (String fecha, String descripcion){
		this.fecha = fecha;
		this.descripcion = descripcion;
		personasInvolucradas = new ArrayList<Persona>();
	}
	
	public void agregarPersonasInvolucradas(Persona persona){
		personasInvolucradas.add(persona);
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	public String getFecha(){
		return this.fecha;
	}
	
	public ArrayList<Persona> getPersonasInvolucradas(){
		return this.personasInvolucradas;
	}
}
