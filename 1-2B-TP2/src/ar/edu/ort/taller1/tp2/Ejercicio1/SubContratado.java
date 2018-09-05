package ar.edu.ort.taller1.tp2.Ejercicio1;

public class SubContratado extends Empleado {
	private float cantHoras;
	private float precioHora;
	
	public SubContratado() {
		super();
	}
	
	public SubContratado (String Nombre, int edad, float cantHoras, float precioHora) {
		super(Nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}
	
	@Override
	public String toString() {
		return "[Nombre=" + super.getNombre() + ", edad=" + super.getEdad() + " Cantidad Horas: " + this.cantHoras + " Precio Hora: " + this.precioHora + "]";
	}
	public float calcularPago() {
		return precioHora * cantHoras;
	}
		

	
}
