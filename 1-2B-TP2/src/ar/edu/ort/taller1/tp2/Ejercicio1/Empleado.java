package ar.edu.ort.taller1.tp2.Ejercicio1;

public class Empleado {
	private String nombre;
	private int edad;
	
	public Empleado() {
		this.nombre = "";
		this.edad = 0;
	}
	
	public Empleado (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre () {
		return this.nombre;
	}
	
	public String toString() {
		return "Nombre=" + nombre + ", edad=" + edad ;
	}
	
	public float calcularPago() {
		return 0.0f; 
	}

	
}
