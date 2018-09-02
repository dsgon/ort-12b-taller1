package ar.edu.ort.taller.Ejercicio3;

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
	
	public ArrayList<Atleta> getTernaGanadores() {
			ArrayList<Atleta> ternaGanadora = new ArrayList<Atleta>();
			int min = 0;
			if (atletasConcursantes.size() > 0 ) {
				for (int i = 0; i < (atletasConcursantes.size() - 1); i++) {
					min = i;
					for (int j = (i+1); j < atletasConcursantes.size(); j++) {
						if (atletasConcursantes.get(j).getTiempo() < atletasConcursantes.get(min).getTiempo()) {
							min = j;
						}
					}
					Atleta currentAtleta = atletasConcursantes.get(i);
					atletasConcursantes.set(i, atletasConcursantes.get(min));
					atletasConcursantes.set(min, currentAtleta);
					
				}
				ternaGanadora.add(atletasConcursantes.get(0));
				for (int k = 1; k < atletasConcursantes.size(); k++) {
					if(atletasConcursantes.get(k).getTiempo()!=atletasConcursantes.get(k-1).getTiempo()){
						ternaGanadora.add(atletasConcursantes.get(k));
					}
				}
			}
			return ternaGanadora;
		}
	
}
