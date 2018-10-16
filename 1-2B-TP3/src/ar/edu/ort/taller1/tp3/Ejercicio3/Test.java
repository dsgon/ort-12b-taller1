package ar.edu.ort.taller1.tp3.Ejercicio3;

import java.util.ArrayList;

import ar.edu.ort.taller1.tp3.Ejercicio1.Persona;
import ar.edu.ort.taller1.tp3.Ejercicio1.TIPO_DE_LINEA;

public class Test {

	public static void main(String[] args) {
		
		Persona p = new Persona("Mariana", "Carballal");
		
		p.agregarEmail("marianacarb@hotmail.com");
		p.agregarEmail("mariana.carballal@hotmail.com");
		p.agregarEmail("guasuguasol1@gmail.com");
		
		p.agregarTelefono(11, 35871648, 54, TIPO_DE_LINEA.CELULAR);
		p.agregarTelefono(237, 4629893, 54, TIPO_DE_LINEA.FIJO);
		
		p.agregarMascota("sammy", "perro");
		p.agregarMascota("pirata", "gato");
		p.agregarMascota("lionel andres", "tortuga");
		
		ArrayList<Persona> amigos = new ArrayList<Persona>();
		Persona p2 = new Persona("David", "Gonzalez");
		Persona p3 = new Persona("Guillermo", "Antun");
		amigos.add(p2);
		amigos.add(p3);
		
		p.agregarHito("07/12/2009", "Victoria de Campeonato de Natacion", amigos);
		
		p.mostrarTodo();
		
		System.out.println("<<---------------------------------------->>");
		p2.mostrarTodo();
		System.out.println("<<---------------------------------------->>");
		p3.mostrarTodo();

	}

}
