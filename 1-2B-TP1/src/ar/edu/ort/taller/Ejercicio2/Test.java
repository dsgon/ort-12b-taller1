package ar.edu.ort.taller.Ejercicio2;

import ar.edu.ort.taller.Ejercicio2.Atleta;
import ar.edu.ort.taller.Ejercicio2.Competencia;

public class Test {

	public static void main(String[] args) {
		/* Competencia 1 */
		// Creo una nueva competencia
		Competencia carrera1 = new Competencia("100 mts");
		
		// Creo atletas
		Atleta atleta1 = new Atleta("Antonio", 9.81);
		Atleta atleta2 = new Atleta("Bruno", 9.85);
		Atleta atleta3 = new Atleta("Carlos", 9.80);
		Atleta atleta4 = new Atleta("Daniel", 10.01);
		Atleta atleta5 = new Atleta("Esteban", 9.97);
		
		// Agrego los atletas a la competencia
		carrera1.agregarParticipantes(atleta1);
		carrera1.agregarParticipantes(atleta2);
		carrera1.agregarParticipantes(atleta3);
		carrera1.agregarParticipantes(atleta4);
		carrera1.agregarParticipantes(atleta5);
		
		System.out.println("Competencia #1");
		System.out.println();
		System.out.println("Participantes");
		//Muestro los atletas que participan en la competencia
		for (Atleta participantes : carrera1.getAtletasConcursantes()) {
			System.out.println(participantes.toString());
		}
		
		System.out.println();
		
		System.out.println("Atletas ganadores: ");
		for (Atleta ganadores : carrera1.getGanadores()) {
			System.out.println(ganadores.toString());
		}
		System.out.println();
		System.out.println("  ********************************************  ");
		
		/* Competencia 2 */
		// Creo una nueeva competencia
		Competencia carrera2 = new Competencia("100 mts");

		// Creo atletas
		Atleta atleta6 = new Atleta("Francisco", 9.79);
		Atleta atleta7 = new Atleta("Gabriel", 9.85);
		Atleta atleta8 = new Atleta("Hector", 9.79);
		Atleta atleta9 = new Atleta("Ignacio", 9.81);
		Atleta atleta10 = new Atleta("Javier", 9.85);

		// Agrego los atletas a la competencia
		carrera2.agregarParticipantes(atleta6);
		carrera2.agregarParticipantes(atleta7);
		carrera2.agregarParticipantes(atleta8);
		carrera2.agregarParticipantes(atleta9);
		carrera2.agregarParticipantes(atleta10);
		
		System.out.println("Competencia #2");
		System.out.println();
		System.out.println("Participantes");
		//Muestro los atletas que participan en la competencia
		for (Atleta participantes : carrera2.getAtletasConcursantes()) {
			System.out.println(participantes.toString());
		}
		
		System.out.println();

		System.out.println("Atletas ganadores: ");
		for (Atleta ganadores : carrera2.getGanadores()) {
			System.out.println(ganadores.toString());
		}

	}

}