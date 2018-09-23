package ar.edu.ort.taller1.tp2.Ejercicio4;

import java.util.ArrayList;

public class Animal {
	
	private String nombre;
	private int peso;
	private int tamanio;
	private ArrayList<Habilidad> habilidades;
	private Cuidador cuidador;
	private TIPO_ALIMENTO tipoAlimento;
	
	public Animal (String nombre, int peso, int tamanio, TIPO_ALIMENTO alimento) {
		this.nombre = nombre;
		this.peso = peso;
		this.tamanio = tamanio;
		this.tipoAlimento = alimento;
		this.habilidades = new ArrayList<Habilidad>();
	}
	
	public void asignarCuidador (Cuidador cuidador) {
		this.cuidador = cuidador;
	}
	
	public Cuidador getCuidador () {
		return this.cuidador;
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
	
	public void realizarTruco(String nombreTruco, Alimento alimento){
		boolean realizado = false;
		int i = 0;
		if (nombreTruco != "") {
			while (realizado == false && i < cantidadHabilidades()) {
				if (getHabilidad(i).getNombre().equals(nombreTruco)) {
					realizado = getHabilidad(i).ejecutarHabilidad(getCuidador(), alimento);
					break;
				}
				i++;
			}
			if (!realizado)
				System.out.println(" se le ordeno realizar " + getHabilidad(i).getNombre() + " ,pero no tiene suficiente alimento");
			else
				System.out.println(getNombre() + ", realizo " + getHabilidad(i).getNombre() + ", recibio " + getHabilidad(i).getCosteAlimento() + " kg de " + alimento.getTipo());
		}
	}
	
}

