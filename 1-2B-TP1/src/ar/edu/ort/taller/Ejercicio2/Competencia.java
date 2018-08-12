package ar.edu.ort.taller.Ejercicio2;

import java.util.ArrayList;

public class Competencia {

	private String nombre;
	private ArrayList<Atleta> atletasConcursantes;
	
	public Competencia(String nombre){
		this.nombre = nombre;
		this.atletasConcursantes = new ArrayList<Atleta>();
	}
	
	public String getNombre(){ return this.nombre; }
	
	public ArrayList<Atleta> getAtletasConcursantes(){ return this.atletasConcursantes; }
	
	public void agregarParticipantes(Atleta atletaParticipante){
		this.atletasConcursantes.add(atletaParticipante);
	}
	
	public ArrayList<Atleta> getGanadores(){
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
		double mejorTiempo = atletasConcursantes.get(0).getTiempo();
		
		for (Atleta atleta : atletasConcursantes) {
			if (atleta.getTiempo()<mejorTiempo){
				ganadores.clear();
				ganadores.add(atleta);
			} else if(atleta.getTiempo()==mejorTiempo){
				ganadores.add(atleta);
			}
		}		
		return ganadores;
	}
	
}
