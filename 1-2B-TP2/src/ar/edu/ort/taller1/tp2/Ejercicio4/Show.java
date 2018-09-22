package ar.edu.ort.taller1.tp2.Ejercicio4;
import java.util.ArrayList;
public class Show {
	//TODO: Explotar la clase show.
	private ArrayList<Alimento> alimentos;
	private ArrayList<Animal> animales;

	
	private void stockAlimentos () {
		for (Alimento alimento : alimentos) {
			System.out.println(alimento.getNombre()+ ": " + alimento.getPeso() + " kg");
		}
	}
	public Alimento getAlimento(String nombreAlimento) {
		int i = 0;
		while (i < alimentos.size()) {
			if (alimentos.get(i).getNombre().equals(nombreAlimento)) {
				return alimentos.get(i);
			}
			i++;
		}
	}
	
	public void agregarAlimento(Alimento alimento) {
		alimentos.add(alimento);
	}
	public void darAltaAnimal (Animal animal, Cuidador cuidador) {
		boolean darAlta = false;
		darAlta = cuidador.AgregarAnimalACargo(animal);
		if (darAlta) {
			animal.asignarCuidador(cuidador);
			animales.add(animal);
		}
		else {
			System.out.println("Error: El cuidador no se puede hacer cargo del animal, escoja otro o contrate mas cuidadores.");
		}
	}
	public void comenzarShow() {
		System.out.println("Stock inicial de alimento:");
		stockAlimentos();
		System.out.println("Comienza el show!");
	}
	public void finalizarShow() {
		System.out.println("Stock final de alimento:");
		stockAlimentos();
	}
}
