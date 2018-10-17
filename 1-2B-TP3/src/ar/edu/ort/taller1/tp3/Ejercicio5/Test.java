package ar.edu.ort.taller1.tp3.Ejercicio5;

import ar.edu.ort.taller1.tp3.Ejercicio4.Persona;
import ar.edu.ort.taller1.tp3.Ejercicio4.Mueble;

public class Test {

	public static void main(String[] args) {
		
		Direccion d = new Direccion("Monroe", "2861");
		Edificio e = new Edificio(d);
		
		
		Persona p = new Persona("Mariana", "Carballal", 26);
		Persona p2 = new Persona("David", "Gonzalez", 30);
		Persona p3 = new Persona("Guillermo", "Antun", 28);
		
		e.crearVivienda("4", "c");
		
		e.agregarPersonaVivienda("4", "c", p);
		e.agregarPersonaVivienda("4", "c", p2);
		
		e.crearVivienda("6", "a");
		e.agregarPersonaVivienda("6", "a", p3);
		
		Mueble m = new Mueble("mesa", "madera", "cedro");
		Mueble m2 = new Mueble("cama", "tela", "gris");
		Mueble m3 = new Mueble("sofa", "tela", "negro");
		Mueble m4 = new Mueble("silla", "plastico", "rojo");
		
		e.agregarMuebleVivienda("4", "c", m);
		e.agregarMuebleVivienda("4", "c", m2);
		e.agregarMuebleVivienda("6", "a", m3);
		e.agregarMuebleVivienda("6", "a", m4);
		
		e.mostrarTodo();
		
		e.realizarMudanza("4", "c", "6", "a");
		e.realizarMudanza("6", "a", "3", "b");
		
		e.mostrarTodo();
	}
}
