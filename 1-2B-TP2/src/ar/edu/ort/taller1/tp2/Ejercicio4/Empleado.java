package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Empleado {
	private String nombre;
	private String horarioEntrada;
	private String horarioSalida;
	
	public Empleado (String nombre, String horarioEntrada, String horarioSalida) {
		this.nombre = nombre;
		this.horarioEntrada = horarioEntrada;
		this.horarioSalida = horarioSalida;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getHorarioEntrada() {
		return this.horarioEntrada;
	}
	public String getHorarioSalida() {
		return this.horarioSalida;
	}
}

