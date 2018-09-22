package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Alimento {
	
	private String nombre;
	private int pesoActual;

	
	public Alimento (String nombre, int peso) {
		this.nombre = nombre;
		this.pesoActual = peso;
	}
	
	public int getPeso () {
		return this.pesoActual;
	}
	
	
	public String getNombre () {
		return this.nombre;
	}
	
	public boolean consumirAlimento (int peso) {
		if (this.pesoActual - peso > 0) {
			this.pesoActual -= peso;
			return true;
		}
		else {
			return false;
		}
		
	}
}
