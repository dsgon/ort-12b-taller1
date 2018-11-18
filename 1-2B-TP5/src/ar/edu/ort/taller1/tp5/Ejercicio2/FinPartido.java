package ar.edu.ort.taller1.tp5.Ejercicio2;

public class FinPartido extends Evento {

	public FinPartido(String min) {
		super(min, null);
	}
	
	@Override
	public String toString() {
		return "[minuto="+ super.getMin()+" Fin de Partido";
	}
	
}
