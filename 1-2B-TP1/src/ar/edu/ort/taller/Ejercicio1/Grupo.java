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
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadIntegrantes() {
		return listaIntegrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		boolean agregado = false;
		if (listaIntegrantes.size() == 0) {
		Integrante integrante = new Integrante(nombreIntegrante);
		listaIntegrantes.add(integrante);
		cantidad++;
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
					cantidad++;
				}
			}
		}		
	}
	
	public int obtenerPosicionIntegrante(String nombreIntegrante) {
		for (int i = 0; i < listaIntegrantes.size(); i++) {
			if(listaIntegrantes.get(i).getNombre().equals(nombreIntegrante)) {
				return i;
			}
		}
		return -1;
	}
	
	public String obtenerIntegrante(int posicion) {
		if (posicion > listaIntegrantes.size())
			return listaIntegrantes.get(posicion).getNombre();
		else
			return null;
	}
	
	public String buscarIntegrante(String nombre) {
		for (int i = 0; i < listaIntegrantes.size(); i++) {
			if(listaIntegrantes.get(i).getNombre().equals(nombre)) {
				return listaIntegrantes.get(i).getNombre();
			}
		}
		return null;
	}
	public String removerIntegrante(String nombreIntegrante) {
		Integrante integranteABorrar = new Integrante();
		for (int i = 0; i < listaIntegrantes.size(); i++) {
			if(listaIntegrantes.get(i).getNombre().equals(nombreIntegrante)) {
				integranteABorrar = listaIntegrantes.get(i);
				listaIntegrantes.remove(i);
				cantidad--;
				return integranteABorrar.getNombre();
			}
		}
		return null;
	}
	
	private void mostrarIntegrantes() {
		if (listaIntegrantes.size() > 0) {
			System.out.println("en total " + this.cantidad + " Integrantes y sus nombres son:");
			for (int i = 0; i < listaIntegrantes.size(); i++) {
				System.out.println("Integrante: " + listaIntegrantes.get(i).getNombre());
			}
		} else {
			System.out.println("No hay integrantes.");
		}
	}
	
	public void mostrar() {
		if (listaIntegrantes.size() > 0) {
			System.out.println("El Grupo: " + this.nombre + " tiene ");
			mostrarIntegrantes();
		}else {
			System.out.println("No hay integrantes.");
		}
	}
	
	public void vaciar() {
		listaIntegrantes.clear();
	}
	
}

