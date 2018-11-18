package ar.edu.ort.taller1.tp5.Ejercicio2;

public class Cambio extends Evento{

	private Jugador jugadorIn;
	private Jugador jugadorOut;
	
	public Cambio(String min, Equipo e, Jugador jI, Jugador jO) {
		super(min, e);
		this.jugadorIn = jI;
		this.jugadorOut = jO;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Cambio de Jugador - Jugador Out: ["+
	jugadorOut.getNombre()+" Jugador In: ["+jugadorIn.getNombre()+"]";
	}
}
