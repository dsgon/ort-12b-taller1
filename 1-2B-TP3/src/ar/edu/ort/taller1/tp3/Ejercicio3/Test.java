package ar.edu.ort.taller1.tp3.Ejercicio3;

import java.util.ArrayList;

import ar.edu.ort.taller1.tp3.Ejercicio1.Persona;
import ar.edu.ort.taller1.tp3.Ejercicio1.TipoDeLinea;

public class Test {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Kimi", "Raikkonen");
		
		ArrayList<Persona> team = new ArrayList<Persona>();
		team.add(new Persona ("Felipe", "Massa"));
		team.add(new Persona ("Jean", "Todt"));
		
		ArrayList<Persona> team2 = new ArrayList<Persona>();
		team2.add(new Persona ("Romain", "Grosjean"));
		team2.add(new Persona ("Eric", "Boulier"));
		
		p1.agregarNumeroTelefonico(54, 114111, 2222, TipoDeLinea.CELULAR);
		p1.agregarNumeroTelefonico(68, 032444, 5678, TipoDeLinea.CELULAR);
		p1.agregarNumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);
		p1.agregarEmail("kimi@raikkonen.com");
		p1.agregarEmail("kimi_newells@hotmail.com");
		p1.agregarMascota("Pluto", "Perro");
		p1.agregarMascota("Felix", "Gato");
		p1.agregarMascota("Bugs", "Conejo");
		p1.agregarHito("21/10/2007", "Campeonato Mundial de F1", team);
		p1.agregarHito("04/11/2012", "Victoria en Abu Dhabi", team2);
		
		p1.mostrarTodo();

	}

}
