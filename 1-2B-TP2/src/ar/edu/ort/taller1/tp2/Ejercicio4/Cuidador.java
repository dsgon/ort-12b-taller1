package ar.edu.ort.taller1.tp2.Ejercicio4;

import java.util.ArrayList;

public class Cuidador extends Empleado {
	
	private int animalesMaxACargo;
	private ArrayList<Animal> animalesACargo;
	
	public Cuidador(String nombre, String horarioEntrada, String horarioSalida, int animalesMaxACargo) {
		super(nombre, horarioEntrada, horarioSalida);
		animalesACargo = new ArrayList<Animal>();
		this.animalesMaxACargo = animalesMaxACargo;
	}
	
	public Boolean AgregarAnimalACargo (Animal animal) {
		if (animalesACargo.size() < animalesMaxACargo  ) {
			animalesACargo.add(animal);
			return true;
		}
		return false;
	}
	
	public Boolean consultarAlimento (Alimento alimento, int alimentoAConsumir) {
		if (alimento.getStock() > alimentoAConsumir){
			alimento.descontarStock(alimentoAConsumir);
			return true;
		}
		return false;
	}
	
}
