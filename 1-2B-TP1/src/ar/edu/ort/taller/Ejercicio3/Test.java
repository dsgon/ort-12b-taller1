package ar.edu.ort.taller.Ejercicio3;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		// Creo una nueeva competencia
		Competencia carrera1 = new Competencia("100 mts");
		
		// Creo atletas
		Atleta atleta1 = new Atleta("Antonio", 9.81);
		Atleta atleta2 = new Atleta("Bruno", 9.85);
		Atleta atleta3 = new Atleta("Carlos", 9.80);
		Atleta atleta4 = new Atleta("Daniel", 10.01);
		Atleta atleta5 = new Atleta("Esteban", 9.97);
		Atleta atleta11 = new Atleta("Mariana", 10.01);
		
		// Agrego los atletas a la competencia
		carrera1.agregarParticipantes(atleta1);
		carrera1.agregarParticipantes(atleta2);
		carrera1.agregarParticipantes(atleta3);
		carrera1.agregarParticipantes(atleta4);
		carrera1.agregarParticipantes(atleta5);
		carrera1.agregarParticipantes(atleta11);
		
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
		ArrayList<Atleta> ganadores1 = carrera1.getTernaGanadores();
		
		System.out.println("Terna de ganadores");
		for (int i = 0; i < ganadores1.size(); i++) {
			System.out.println("El atleta: " + ganadores1.get(i).getNombre() + " termino la competencia con tiempo: " + ganadores1.get(i).getTiempo() + " y obtuvo el puesto numero: " + (i+1));
		}
		
		System.out.println();
		System.out.println("  ********************************************  ");
		
		/* Competencia 2 */
		System.out.println("Competencia #2");
		System.out.println();
		System.out.println("Participantes");
		
		// Creo una nueeva competencia
		Competencia carrera2 = new Competencia("100 mts");

		// Creo atletas
		Atleta atleta6 = new Atleta("Francisco", 9.79);
		Atleta atleta7 = new Atleta("Gabriel", 9.81);
		Atleta atleta8 = new Atleta("Hector", 9.79);
		Atleta atleta9 = new Atleta("Ignacio", 9.81);
		Atleta atleta10 = new Atleta("Javier", 9.85);
		Atleta atleta12 = new Atleta("Karla", 9.79);
		Atleta atleta13 = new Atleta("Laura", 9.85);

		// Agrego los atletas a la competencia
		carrera2.agregarParticipantes(atleta6);
		carrera2.agregarParticipantes(atleta7);
		carrera2.agregarParticipantes(atleta8);
		carrera2.agregarParticipantes(atleta9);
		carrera2.agregarParticipantes(atleta10);
		carrera2.agregarParticipantes(atleta12);
		carrera2.agregarParticipantes(atleta13);

		//Muestro los atletas que participan en la competencia
		for (Atleta participantes : carrera2.getAtletasConcursantes()) {
			System.out.println(participantes.toString());
		}
		System.out.println();

		System.out.println("Atletas ganadores: ");
		for (Atleta ganadores : carrera2.getGanadores()) {
			System.out.println(ganadores.toString());
		}
		
		System.out.println();
		ArrayList<Atleta> ganadores2 = carrera2.getTernaGanadores();
		
		System.out.println("Terna de ganadores");
		for (int i = 0; i < 3; i++) {
			System.out.println("El atleta: " + ganadores2.get(i).getNombre() + " termino la competencia con tiempo: " + ganadores2.get(i).getTiempo() + " y obtuvo el puesto numero: " + (i+1));
		}
		System.out.println();
		System.out.println("  ********************************************  ");

	}

}