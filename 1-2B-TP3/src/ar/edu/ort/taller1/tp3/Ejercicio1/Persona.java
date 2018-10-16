package ar.edu.ort.taller1.tp3.Ejercicio1;

import java.util.ArrayList;

import ar.edu.ort.taller1.tp3.Ejercicio1.Persona;
import ar.edu.ort.taller1.tp3.Ejercicio2.Mascota;
import ar.edu.ort.taller1.tp3.Ejercicio3.Hito;

public class Persona {
	
	private class EMail {
		private String cuenta;
		private String dominio;	
		
		public EMail(String mail){
			String[] partes = mail.split("@");
			String cuenta = partes[0];
			String dominio = partes[1];
			this.cuenta = cuenta;
			this.dominio = dominio;
		}
		
		public String getValor(){
			return this.cuenta + "@" + this.dominio;
		}
	}
	private class NumeroTelefonico {
		private int caracteristica;
		private int numeroDeAbonado;
		private int codigoDePais;
		private TIPO_DE_LINEA tipoLinea;

		public NumeroTelefonico(int caracteristica, int numeroDeAbonado, int codigoDePais, TIPO_DE_LINEA tipoLinea) {
			this.caracteristica = caracteristica;
			this.numeroDeAbonado = numeroDeAbonado;
			this.codigoDePais = codigoDePais;
			this.tipoLinea = tipoLinea;
		}
		
		public String getValor(){
			return this.tipoLinea+": (+" + this.codigoDePais + ")" + this.caracteristica + "-" + this.numeroDeAbonado;		
		}
	}
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<EMail> emails;
	private ArrayList<Mascota> mascotas;
	private ArrayList<Hito> hitos;
	
	public Persona (String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<NumeroTelefonico>();
		this.emails = new ArrayList<EMail>();
		this.mascotas = new ArrayList<Mascota>();
		this.hitos = new ArrayList<Hito>();
	}
	
	public String getNombre() { return this.nombre; }
	
	public void agregarTelefono(int caracteristica, int numeroDeAbonado, int codigoDePais, TIPO_DE_LINEA tipoLinea) {
		NumeroTelefonico tel = new NumeroTelefonico(caracteristica, numeroDeAbonado, codigoDePais, tipoLinea);
		this.telefonos.add(tel);
	}
	
	public void agregarEmail (String mail) {
		EMail email = new EMail(mail);
		this.emails.add(email);
	}
	
	public void agregarMascota(String nombre, String tipoMascota){
		Mascota m = new Mascota(nombre, tipoMascota);
		this.mascotas.add(m);
	}
	
	public void agregarHito(String fecha, String descripcion, ArrayList<Persona> personasInvolucradas){
		Hito hito = new Hito (fecha, descripcion);
		hitos.add(hito);
		hito.agregarPersonasInvolucradas(this);
		for (Persona persona : personasInvolucradas) {
			persona.agregarHito(hito);
			hito.agregarPersonasInvolucradas(persona);
		}
	}
	
	public void agregarHito(Hito hito) {
		hitos.add(hito);
	}
	
	public String getPersona(){
		return this.nombre + " " + this.apellido;
	}
	
	public void mostrarTodo(){
		System.out.println(getPersona());
		mostrarTelefonos();
		mostrarEmails();
		mostrarMascotas();
		mostrarHitos();
	}
	
	private void mostrarTelefonos(){
		for (int i =0; i<telefonos.size();i++){
			System.out.println(this.telefonos.get(i).getValor());
		}
	}
	
	private void mostrarEmails(){
		System.out.println("Emails:");
		for (int i = 0; i<emails.size();i++){
			System.out.println(this.emails.get(i).getValor());
		}
	}
	
	private void mostrarMascotas(){
		if(mascotas.size()>0) {
			System.out.println("Mascotas:");
			for (int i = 0; i<mascotas.size(); i++){
				System.out.println(this.mascotas.get(i).getMascota());
			}
		}
	}
	
	private void mostrarHitos() {
		if (hitos.size()>0) {
			System.out.println("Hitos:");
			for (Hito hito : hitos) {
				System.out.println(hito.getFecha()+" - "+hito.getDescripcion()+" y estuve con:");
				for (Persona  persona : hito.getPersonasInvolucradas()){
					if(!persona.getNombre().equals(this.nombre)) 
						System.out.println(persona.nombre+" "+persona.apellido);
				}
			}
		}
	}

}
