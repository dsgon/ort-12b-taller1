package ar.edu.ort.taller1.tp2.Ejercicio4;

import java.util.ArrayList;

public class Show {
	
	private ArrayList<Alimento> alimentos;
	private ArrayList<Animal> animales;
	
	public Show (){
		this.alimentos = new ArrayList<Alimento>();
		this.animales = new ArrayList<Animal>();
	}

	private void getStockActualAlimentos () {
		for (Alimento alimento : alimentos) {
			System.out.println(alimento.getTipo()+ ": " + alimento.getStock() + " kg");
		}
		System.out.println();
	}

	public void agregarAlimento(Alimento alimento) {
		alimentos.add(alimento);
	}
	
	public void darAltaAnimal (Animal animal, Cuidador cuidador) {
		boolean darAlta = false;
		darAlta = cuidador.AgregarAnimalACargo(animal);
		if (darAlta) {
			animal.asignarCuidador(cuidador);
			this.animales.add(animal);
		}
		else {
			System.out.println("Error: El cuidador no se puede hacer cargo del animal, escoja otro o contrate mas cuidadores.");
		}
	}
	
	public void comenzarShow() {
		System.out.println("Stock inicial de alimento:");
		getStockActualAlimentos();
		System.out.println("Comienza el show!");
	}
	
	public void finalizarShow() {
		System.out.println();
		System.out.println("Stock final de alimento:");
		getStockActualAlimentos();
	}
	
}
