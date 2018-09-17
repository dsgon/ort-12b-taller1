package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Alimento extends Animal {
	
	// La clase Alimento es una implementacion parcial de la Animal osea solo utiliza dos atributos de Animal, nombre y peso.
	// por ende se genera utilizando el constructor que tiene solo dos parametros.
	public Alimento (String nombre, int peso) {
		super(nombre, peso);
	}
	
	public boolean consumirAlimento (int peso) {
		if ((super.getPeso() - peso > 0)) {
			int pesoActual = super.getPeso();
			pesoActual -= peso;
			super.setPeso(pesoActual);
			return true;
		}
		else {
			return false;
		}
	}
	
}
