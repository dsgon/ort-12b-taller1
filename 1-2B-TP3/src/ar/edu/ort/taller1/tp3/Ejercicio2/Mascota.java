package ar.edu.ort.taller1.tp3.Ejercicio2;

public class Mascota {
	private String nombre;
	private String tipoMascota;
	
	public Mascota(String nombre, String tipoMascota){
		this.nombre = nombre;
		this.tipoMascota = tipoMascota;
	}
	
	public String getMascota(){
		return this.tipoMascota + ", " + this.nombre;
	}
}
