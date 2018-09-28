package ar.edu.ort.taller1.tp3.Ejercicio2;

import ar.edu.ort.taller1.tp3.Ejercicio1.Persona;
import ar.edu.ort.taller1.tp3.Ejercicio1.TipoDeLinea;

public class Test {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Kimi", "Raikkonen");
		
		p1.agregarNumeroTelefonico(54, 114111, 2222, TipoDeLinea.CELULAR);
		p1.agregarNumeroTelefonico(68, 032444, 5678, TipoDeLinea.CELULAR);
		p1.agregarNumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);
		p1.agregarEmail("kimi@raikkonen.com");
		p1.agregarEmail("kimi_newells@hotmail.com");
		p1.agregarMascota("Pluto", "Perro");
		p1.agregarMascota("Felix", "Gato");
		p1.agregarMascota("Bugs", "Conejo");
		
		p1.mostrarTodo();

	}

}
