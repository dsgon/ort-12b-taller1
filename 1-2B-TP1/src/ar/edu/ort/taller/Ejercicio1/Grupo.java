package ar.edu.ort.taller.Ejercicio1;
import java.util.ArrayList;
public class Grupo {
	
	private String nombre;
	private int cantidad;
	ArrayList<Integrante> listaIntegrantes = new ArrayList<Integrante>();
	
	public Grupo (String nombre) {
		this.nombre = nombre;
		cantidad = 0;
	}
	public int getCantidadIntegrates() {
		return cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		boolean agregado = false;
		if (listaIntegrantes.size() < 0) {
		Integrante integrante = new Integrante(nombreIntegrante);
		listaIntegrantes.add(integrante);
		}
		else
		{
			if(!agregado) {
				for (int i = 0; i < listaIntegrantes.size(); i++) {
					if(listaIntegrantes.get(i).getNombre().equals(nombreIntegrante)) {
						agregado = true;
					}
				}
				if(!agregado) {
					Integrante integrante = new Integrante(nombreIntegrante);
					listaIntegrantes.add(integrante);
				}
			}
		}
			
	}
	
}

