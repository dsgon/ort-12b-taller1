package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Delfin extends Animal {
	private Entrenador entrenador;
	public Delfin(String nombre, int peso, int tamanio,String alimento, Entrenador entrenador) {
		super(nombre,peso,tamanio,alimento);
		this.entrenador = entrenador;
	}
	
}
