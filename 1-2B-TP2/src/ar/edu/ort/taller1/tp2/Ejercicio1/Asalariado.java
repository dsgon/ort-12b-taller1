package ar.edu.ort.taller1.tp2.Ejercicio1;

public class Asalariado extends Empleado {
	
	private float sueldo;
	
	public Asalariado(String nombre, int edad,float sueldo) {
		super(nombre,edad);
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "[Nombre=" + super.getNombre() + ", edad=" + super.getEdad() + " salario: " + this.sueldo + "]";
	}	
	public float calcularPago() {
		return this.sueldo;
	}
	
}
