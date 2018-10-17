package ar.edu.ort.taller1.tp3.Ejercicio4;

import java.util.ArrayList;

public class Vivienda {
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda(Direccion dir){
		this.direccion = dir;
		this.personas = new ArrayList<Persona>();
		this.muebles = new ArrayList<Mueble>();
	}
	
	public void agregarPersona(Persona p){
		this.personas.add(p);
	}
	
	public void agregarMueble(Mueble m){
		this.muebles.add(m);
	}
	
	public void mostrarVivienda(){
		System.out.println(this.direccion.getDireccion());
		listarPersonas();
		listarMuebles();
	}
	
	public void listarPersonas(){
		System.out.println("Personas: ");
		for (int i = 0; i<this.personas.size(); i++){
			System.out.println(this.personas.get(i).getPersona());
		}
	}
	
	public void listarMuebles(){
		System.out.println("Muebles: ");
		for (int i=0; i<this.muebles.size(); i++){
			System.out.println(this.muebles.get(i).getMueble());
		}
	}

}
