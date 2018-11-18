package ar.edu.ort.taller1.tp5.Ejercicio2;

public class Tarjeta extends Evento{

	private Jugador jugador;
	private TIPO_TARJETA tipoTarjeta;
	
	public Tarjeta(String min, Equipo e, Jugador j, TIPO_TARJETA tt) {
		super(min, e);
		this.jugador = j;
		this.tipoTarjeta = tt;
	}

	@Override
	public String toString() {
		return super.toString()+", Tarjeta [jugador=" + jugador.getNombre() + ", tipoTarjeta=" + tipoTarjeta.toString() + "]";
	}
	
	
}
