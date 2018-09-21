package ar.edu.ort.taller1.tp2.Ejercicio4;
import java.util.ArrayList;
public class Animal {
	private String nombre;
	private int peso;
	private int tamanio;
	private ArrayList<Habilidad> habilidades;
	private String claseDeAlimento;
	
	
	
	//Constructor de Animal no-Delfin
	public Animal (String nombre, int peso, int tamanio, String alimento) {
		this.nombre = nombre;
		this.peso = peso;
		this.tamanio = tamanio;
		this.claseDeAlimento = alimento;
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
	
	public void realizarTruco(String nombreTruco, Alimento alimento) {
		boolean realizado = false;
		int i = 0;
		if (nombreTruco != "") {
			while (realizado = false && i < habilidades.size()) {
				if (habilidades.get(i).getNombre().equals(nombreTruco)) {
					realizado = habilidades.get(i).ejecutarHabilidad(alimento);
				}
			i++;
			}
		}
	}
	
}

