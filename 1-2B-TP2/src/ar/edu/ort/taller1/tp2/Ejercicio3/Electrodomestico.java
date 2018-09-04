package ar.edu.ort.taller1.tp2.Ejercicio3;

public abstract class Electrodomestico {
	
	private String marca;
	private String modelo;
	private String numeroSerie;
	private String voltaje;
	private String estado;
	private float precio;
	
	public Electrodomestico(String marca, String modelo, 
			String numeroSerie, String voltaje, String encendido,
			float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.voltaje = voltaje;
		this.estado = encendido;
		this.precio = precio;
	}

}
