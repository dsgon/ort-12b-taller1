package ar.edu.ort.taller1.tp2.Ejercicio1;

public class SubContratado extends Empleado {
	private float cantHoras;
	private float precioHora;
	
	public SubContratado() {
		super();
	}
	
	public SubContratado (String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}
	
	public float getCantHoras() {
		return cantHoras;
	}
	
	public float getPrecioHora() {
		return precioHora;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Cantidad Horas: " + this.cantHoras + " Precio Hora: " + this.precioHora;
	}
	
	@Override
	public float calcularPago() {
		return precioHora * cantHoras;
	}
		

	
}
