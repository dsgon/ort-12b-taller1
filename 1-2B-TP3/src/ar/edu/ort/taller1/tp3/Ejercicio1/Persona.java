package ar.edu.ort.taller1.tp3.Ejercicio1;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	
	
	public Persona (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<NumeroTelefonico>();
		emails = new ArrayList<Email>();
	}
	
	public void mostrarTodo() {
		System.out.println(this.apellido+", "+this.nombre);
		System.out.println("Telefonos");
		for (NumeroTelefonico num : telefonos) {
			System.out.println(num.getTipo()+": "+num.getValor());
		}
		for (Email email : emails) {
			System.out.println("email: "+email.getValor());
		}
	}
	
	public void agregarNumeroTelefonico(int codPais, int caracteristica, int numero, TipoDeLinea tipo) {
		telefonos.add(new NumeroTelefonico(codPais, caracteristica, numero, tipo));
	}
	
	public void agregarEmail(String mail) {
		emails.add(new Email(mail));
	}

}
