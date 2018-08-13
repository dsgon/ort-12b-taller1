package ar.edu.ort.taller.Ejercicio4;

public class Anio {
	
	private String[] meses = new String[12];

	public Anio() {
		this.meses = new String[] {"Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	}
	
	public String[] getMeses() { return this.meses; }

}
