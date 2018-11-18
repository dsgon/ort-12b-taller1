package ar.edu.ort.taller1.tp5.Ejercicio2;

import java.util.ArrayList;

public class Equipo {

	private ArrayList<Jugador> jugadoresActivos;
	private ArrayList<Jugador> jugadoresBanca;
	private String nombre;
	
	public Equipo(String n) {
		this.nombre = n;
		this.jugadoresActivos = new ArrayList<Jugador>();
		this.jugadoresBanca = new ArrayList<Jugador>();
		cargarJugadoresActivos();
		cargarJugadoresBanca();
	}
	
	public ArrayList<Jugador> getJugadoresActivos(){
		return this.jugadoresActivos;
	}
	public ArrayList<Jugador> getJugadoresBanca(){
		return this.jugadoresBanca;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private void cargarJugadoresActivos(){
		for (int i=0; i <= 11; i++) {
			Jugador j = new Jugador(String.format("Jugador%d", i),String.valueOf(i));
			jugadoresActivos.add(j);
		}
	}
	
	private void cargarJugadoresBanca(){
		for (int i=12; i <= 23; i++) {
			jugadoresBanca.add(new Jugador(String.format("Jugador%d", i),String.valueOf(i)));
		}
	}
}
