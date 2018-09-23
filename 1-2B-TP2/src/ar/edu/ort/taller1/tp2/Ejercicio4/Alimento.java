package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Alimento {
	
	private TIPO_ALIMENTO tipo;
	private int stock;

	
	public Alimento (TIPO_ALIMENTO tipo, int cantidad) {
		this.tipo = tipo;
		this.stock = cantidad;
	}
	
	public int getStock () {
		return this.stock;
	}
	
	
	public TIPO_ALIMENTO getTipo () {
		return this.tipo;
	}
	
	public boolean descontarStock (int peso) {
		if (this.stock - peso > 0) {
			this.stock -= peso;
			return true;
		}
		return false;
	}
	
}
