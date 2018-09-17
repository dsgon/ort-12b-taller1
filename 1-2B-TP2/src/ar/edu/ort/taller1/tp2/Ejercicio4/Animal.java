package ar.edu.ort.taller1.tp2.Ejercicio4;
import java.util.ArrayList;
public class Animal {
	private String nombre;
	private int peso;
	private int tamanio;
	private ArrayList<Habilidad> habilidades;
	private Entrenador entrenador;
	
	//Constructor de Alimento
	public Animal (String nombre, int peso) {
		this.nombre = nombre;
		this.peso = peso;
	}
	
	//Constructor de Animal no-Delfin
	public Animal (String nombre, int peso, int tamanio) {
		this.nombre = nombre;
		this.peso = peso;
		this.tamanio = tamanio;
		habilidades = new ArrayList<Habilidad>();
	}
	
	//Constructor de Delfin
	public Animal (String nombre, int peso, int tamanio, Entrenador entrenador)
	{
		this.nombre = nombre;
		this.peso = peso;
		this.tamanio = tamanio;
		habilidades = new ArrayList<Habilidad>();
		this.entrenador = entrenador;
	}
	public void agregarHabilidad(Habilidad habilidad) {
		habilidades.add(habilidad);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public int getTamanio() {
		return this.tamanio;
	}
	public int getPeso() {
		return this.peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}

