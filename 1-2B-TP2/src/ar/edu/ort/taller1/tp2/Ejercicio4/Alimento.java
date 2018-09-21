package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Alimento {
	
	private String nombre;
	private int peso;
	// La clase Alimento es una implementacion parcial de la Animal osea solo utiliza dos atributos de Animal, nombre y peso.
	// por ende se genera utilizando el constructor que tiene solo dos parametros.
	public Alimento (String nombre, int peso) {
		this.nombre = nombre;
		this.peso = peso;
	}
	public int getPeso () {
		return this.peso;
	}
	public String getNombre () {
		return this.nombre;
	}
	public boolean consumirAlimento (int peso) {
		if (this.peso - peso > 0) {
			int pesoActual = peso;
			pesoActual -= peso;
			this.peso = peso;
			return true;
		}
		else {
			return false;
		}
		
	}
}
