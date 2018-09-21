package ar.edu.ort.taller1.tp2.Ejercicio4;
import java.util.ArrayList;
public class Animal {
	private String nombre;
	private int peso;
	private int tamanio;
	private ArrayList<Habilidad> habilidades;
	
	public Animal (String nombre, int peso, int tamanio, String alimento) {
		this.nombre = nombre;
		this.peso = peso;
		this.tamanio = tamanio;
		habilidades = new ArrayList<Habilidad>();
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
	public Habilidad getHabilidad(int numero) {
		return habilidades.get(numero);
	}
	public int cantidadHabilidades(){
		return habilidades.size();
	}
	
}

