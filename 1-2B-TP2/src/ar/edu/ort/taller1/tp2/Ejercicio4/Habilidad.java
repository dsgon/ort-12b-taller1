package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Habilidad {
	
	private String nombre;
	private int costeAlimento;
	
	public Habilidad (String nombre, int costeAlimento) {
		this.nombre = nombre;
		this.costeAlimento = costeAlimento;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCosteAlimento() {
		return this.costeAlimento;
	}
	
	public boolean ejecutarHabilidad(Cuidador cuidador, Alimento alimento) {
		return cuidador.consultarAlimento(alimento, this.costeAlimento);
	}
	
}
