package ar.edu.ort.taller1.tp3.Ejercicio5;

import java.util.ArrayList;

import ar.edu.ort.taller1.tp3.Ejercicio4.Persona;
import ar.edu.ort.taller1.tp3.Ejercicio4.Mueble;

public class Edificio {
	
	private class Vivienda {
		private String nombre;
		private ArrayList<Persona> personas;
		private ArrayList<Mueble> muebles;
		private String piso;
		private String departamento;
		
		public Vivienda(String piso, String departamento){
			this.nombre = "Vivienda ";
			this.piso = piso;
			this.departamento = departamento;
			this.personas = new ArrayList<Persona>();
			this.muebles = new ArrayList<Mueble>();
		}
		
		public void agregarPersona(Persona p){
			this.personas.add(p);
		}
		
		public void agregarMueble(Mueble m){
			this.muebles.add(m);
		}
		
		public void mostrarVivienda(Direccion dire){
			System.out.println(getNombre());
			System.out.println(dire.getDireccion()+" "+this.piso+" "+this.departamento);
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
		
		public ArrayList<Persona> getPersonas(){
			return this.personas;
		}
		
		public void vaciarVivienda(){
			getPersonas().clear();
			getMuebles().clear();
		}
		
		public void llenarVivienda(Vivienda o){
			getPersonas().addAll(o.getPersonas());
			getMuebles().addAll(o.getMuebles());
		}
		
		public ArrayList<Mueble> getMuebles(){
			return this.muebles;
		}
		
		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		
		public String getNombre(){
			return this.nombre;
		}
		
		public String getPiso() {
			return this.piso;
		}
		
		public String getDepartamento() {
			return this.departamento;
		}

	}
	
	private ArrayList<Vivienda> viviendas;
	private Direccion direccion;
	
	public Edificio(Direccion dir){
		this.direccion = dir;
		this.viviendas = new ArrayList<Vivienda>();
	}
	
	public void crearVivienda(String piso, String departamento){
		Vivienda v = new Vivienda(piso, departamento);
		agregarVivienda(v);
	}
	
	public void agregarVivienda(Vivienda v){
		viviendas.add(v);
		v.setNombre("Vivienda "+ (viviendas.indexOf(v)+1));
	}
	
	public void realizarMudanza(String pisoO, String deptoO, String pisoD, String deptoD){
		Vivienda viviendaO = buscarVivienda(pisoO, deptoO);
		Vivienda viviendaD = buscarVivienda(pisoD, deptoD);
		
		if (viviendaO!=null){
			if (viviendaD!=null && viviendaD.getPersonas().isEmpty() && viviendaD.getMuebles().isEmpty()){
				viviendaD.llenarVivienda(viviendaO);
				viviendaO.vaciarVivienda();
				System.out.println("Se ha realizado la mudanza de " + viviendaO.getNombre() + " a " + viviendaD.getNombre());
			} 
			else if (viviendaD!=null && (!viviendaD.getPersonas().isEmpty() || !viviendaD.getMuebles().isEmpty())) {
				System.out.println("No se puede realizar la mudanza porque la " + viviendaD.getNombre() + " está ocupada.");
			} 
			else {
				viviendaD = new Vivienda(pisoD, deptoD);
				agregarVivienda(viviendaD);
				viviendaD.llenarVivienda(viviendaO);
				viviendaO.vaciarVivienda();
				System.out.println("Se ha realizado la mudanza de " + viviendaO.getNombre() + " a " + viviendaD.getNombre());
			}
		} else {
			System.out.println("No se puede realizar la mudanza porque no existe la vivienda de origen.");
		}
	}
	
	public Vivienda buscarVivienda(String piso, String depto){
		Vivienda v = null;
		int i = 0;
		while (i<this.viviendas.size()){
			if (this.viviendas.get(i).getPiso().equals(piso) && this.viviendas.get(i).getDepartamento().equals(depto)){
				return this.viviendas.get(i);
			} 
			i++;
		}
		return v;
	}
	
	public void agregarPersonaVivienda(String piso, String depto, Persona p){
		Vivienda v = buscarVivienda(piso, depto);
		if (v!=null){
			v.agregarPersona(p);	
		} else {
			System.out.println("No se pudo agregar la persona porque la vivienda no existe.");
		}
		
	}
	
	public void agregarMuebleVivienda(String piso, String depto, Mueble m) {
		Vivienda v = buscarVivienda(piso, depto);
		if (v!=null){
			v.agregarMueble(m);
		} else {
			System.out.println("No se pudo agregar el mueble porque la vivienda no existe.");
		}
	}
	
	public void mostrarTodo(){
		for (int i=0; i<this.viviendas.size(); i++){
			this.viviendas.get(i).mostrarVivienda(this.direccion);
			System.out.println("<<------------------------------>>");
		}
	}

}
