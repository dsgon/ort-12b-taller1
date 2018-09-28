package ar.edu.ort.taller1.tp3.Ejercicio1;

import java.util.ArrayList;

import ar.edu.ort.taller1.tp3.Ejercicio2.Mascota;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	private ArrayList<Mascota> mascotas;
	
	
	public Persona (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<NumeroTelefonico>();
		emails = new ArrayList<Email>();
		mascotas = new ArrayList<Mascota>();
	}
	
	public void mostrarTodo() {
		System.out.println(this.apellido+", "+this.nombre);
		System.out.println("Telefonos:");
		for (NumeroTelefonico num : telefonos) {
			System.out.println(num.getTipo()+": "+num.getValor());
		}
		System.out.println("Emails:");
		for (Email email : emails) {
			System.out.println("email: "+email.getValor());
		}
		System.out.println("Mascotas:");
		for (Mascota mascota : mascotas) {
			System.out.println(mascota.getTipo()+", "+mascota.getNombre());
		}
	}
	
	public void agregarNumeroTelefonico(int codPais, int caracteristica, int numero, TipoDeLinea tipo) {
		telefonos.add(new NumeroTelefonico(codPais, caracteristica, numero, tipo));
	}
	
	public void agregarEmail(String mail) {
		emails.add(new Email(mail));
	}
	
	public void agregarMascota(String nombre, String tipo) {
		mascotas.add(new Mascota(nombre, tipo));
	}

}
