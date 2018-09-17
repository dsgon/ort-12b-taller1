package ar.edu.ort.taller1.tp2.Ejercicio2;

import ar.edu.ort.taller1.tp2.Ejercicio1.SubContratado;;

public class Vendedor extends SubContratado{

	private float porcentaje;
	
	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre,edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return super.toString() + " Porcentaje = "+ this.porcentaje;
	}
	
	@Override
	public float calcularPago() {
		return super.getCantHoras() * super.getPrecioHora() * 
				(1+(this.porcentaje / 100));
	}
	
}
