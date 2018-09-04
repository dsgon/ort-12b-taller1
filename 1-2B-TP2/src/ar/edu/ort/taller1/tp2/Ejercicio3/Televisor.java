package ar.edu.ort.taller1.tp2.Ejercicio3;

public class Televisor extends Electrodomestico{

	private String dimension;
	private String tipo;
	
	public Televisor(String marca, String modelo, String numeroSerie, String voltaje, String encendido, float precio,
			String dimension, String tipo) {
		super(marca, modelo, numeroSerie, voltaje, encendido, precio);
		this.dimension = dimension;
		this.tipo = tipo;
	}
	
}
