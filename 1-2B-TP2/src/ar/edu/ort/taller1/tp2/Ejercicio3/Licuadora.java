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
	
	@Override
	public String getInfo() {
		return "Licuadora: "+super.getInfo();
	}
	
	@Override
	public String toString() {
		return super.toString()+" Potencia =" + this.potencia + ", Velocidades =" + this.velocidades;
	}
	
	@Override
	public String getTicketInfo() {
		return "Lavarropas "+super.getMarca()+", potencia "+this.potencia+"w, modelo"
	+super.getModelo()+" velocidades "+this.velocidades+": $"+getPrecio();
	}
	
}
