package ar.edu.ort.taller1.tp2.Ejercicio4;
import java.util.ArrayList;
public class Show {
	//TODO: Explotar la clase show.
	private ArrayList<Alimento> alimentos;
	private ArrayList<Animal> animales;
	private ArrayList<Cuidador> cuidadores;
	private ArrayList<Entrenador> entrenadores;
	
	public void stockAlimentos () {
		for (Alimento alimento : alimentos) {
			System.out.println(alimento.getNombre()+ ": " + alimento.getPeso() + " kg");
		}
	}
	public void darAltaAnimal (Animal animal, Cuidador cuidador) {
		boolean darAlta = false;
		darAlta = cuidador.AgregarAnimalACargo(animal);
		if (darAlta) {
			animales.add(animal);
		}
		else {
			System.out.println("Error: El cuidador no se puede hacer cargo del animal, escoja otro o contrate mas cuidadores.");
		}
	}
	public void comenzarShow() {
		
	}
}
