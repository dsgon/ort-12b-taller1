package ar.edu.ort.taller1.tp5.Ejercicio2;

public class Gol extends Evento{
	
	private Jugador jugador;
	private boolean penal;
	
	public Gol(String min, Equipo e, Jugador j, boolean p) {
		super(min, e);
		this.jugador = j;
		this.penal = p;
	}

	@Override
	public String toString() {
		return super.toString()+", Gol [jugador=" + jugador.getNombre() + ", fue Penal =" + penal + "]";
	}
	
	

}
