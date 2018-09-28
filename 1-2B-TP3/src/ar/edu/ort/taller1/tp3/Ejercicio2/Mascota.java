package ar.edu.ort.taller1.tp3.Ejercicio2;

public class Mascota {
	
	private String nombre;
	private String tipoMascota;
	
	public Mascota (String nombre, String tipo) {
		this.nombre = nombre;
		this.tipoMascota = tipo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getTipo() {
		return this.tipoMascota;
	}

}
