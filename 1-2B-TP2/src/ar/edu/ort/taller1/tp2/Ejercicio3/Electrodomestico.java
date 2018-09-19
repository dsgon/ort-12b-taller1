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
	
	public String getInfo() {
		return "Marca = " + marca + ", Modelo = " + modelo ;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public float getPrecio() {
		return this.precio;
	}
	
	@Override
	public String toString() {
		return "Marca=" + this.marca + ", Modelo=" + this.modelo + ", Nmero de Serie=" + this.numeroSerie + ", Voltaje="
				+ this.voltaje + ", Estado=" + this.estado + ", Precio=" + this.precio;
	}
	
	public String getTicketInfo() {
		return "Marca=" + this.marca + ", Modelo=" + this.modelo + ", Precio=" + this.precio;
	}

}
