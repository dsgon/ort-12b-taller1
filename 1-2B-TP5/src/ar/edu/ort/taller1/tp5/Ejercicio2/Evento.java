package ar.edu.ort.taller1.tp5.Ejercicio2;

public abstract class Evento {
	
	private String minuto;
	private Equipo equipo;
	
	public Evento(String min, Equipo e) {
		this.minuto = min;
		this.equipo = e;
	}
	
	public Equipo getEquipo() {
		return this.equipo;
	}
	
	public String getMin() {
		return this.minuto;
	}

	@Override
	public String toString() {
		return "[minuto=" + minuto + ", equipo=" + equipo.getNombre();
	}	

}
