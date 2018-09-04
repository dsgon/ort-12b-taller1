package ar.edu.ort.taller1.tp2.Ejercicio3;

public class Licuadora extends Electrodomestico{

	private String potencia;
	private String velocidades;
	
	public Licuadora(String marca, String modelo, String numeroSerie, String voltaje, String encendido, float precio,
			String potencia, String velocidades) {
		super(marca, modelo, numeroSerie, voltaje, encendido, precio);
		this.potencia = potencia;
		this.velocidades = velocidades;
	}
	
}
