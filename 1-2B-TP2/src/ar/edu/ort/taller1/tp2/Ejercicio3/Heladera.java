package ar.edu.ort.taller1.tp2.Ejercicio3;

public class Heladera extends Electrodomestico {

	private String capacidad;
	private String tipo;
	
	public Heladera(String marca, String modelo, String numeroSerie, String voltaje, String encendido, float precio,
			String capacidad, String tipo) {
		super(marca, modelo, numeroSerie, voltaje, encendido, precio);
		this.capacidad = capacidad;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString()+" Capacidad=" + this.capacidad + ", Tipo=" + this.tipo;
	}	
	
	@Override
	public String getInfo() {
		return "Heladera: "+super.getInfo();
	}
	
	@Override
	public String getTicketInfo() {
		return "Heladera "+super.getMarca()+", modelo "+super.getModelo()+", "
	+this.tipo+", capacidad "+this.capacidad+" litros: $"+super.getPrecio();
	}
	
}
