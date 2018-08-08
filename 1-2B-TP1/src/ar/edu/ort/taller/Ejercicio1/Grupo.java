package ar.edu.ort.taller.Ejercicio1;
import java.util.ArrayList;
public class Grupo {
	
	
//	 public int getCantidadIntegrantes()
//	Devuelve la cantidad actual de integrantes del grupo.
//	 public void agregarIntegrante(String nombreIntegrante)
//	Agrega al grupo el nombre de un nuevo integrante, siempre y cuando �ste no
//	haya sido cargado con anterioridad. Cuando ya exista, no debe volver a
//	agregarlo.
//	 private int obtenerPosicionIntegrante(String nombreIntegrante)
//	Devuelve la posici�n en el grupo del integrante cuyo nombre se ha recibido por
//	par�metro. En caso de no encontrarlo devolver� -1.
//	 public String obtenerIntegrante(int posicion)
//	Recibe un valor entero que representa la posici�n del integrante en la lista
//	(entero igual o mayor que 1) y devuelve el integrante guardado en (posicion - 1)
//	dentro de la colecci�n de integrantes. Si el integrante no existe se debe
//	devolver null.
//	 public String buscarIntegrante(String nombre)
//	Busca al integrante del grupo cuyo nombre coincida con el par�metro de
//	entrada. En caso de que haya coincidencia, lo devuelve; caso contrario, el
//	m�todo devolver� null.
//	 public String removerIntegrante(String nombreIntegrante)
//	Remueve de la colecci�n de integrantes a aquel cuyo nombre coincide con el
//	nombre recibido como par�metro. Si lo encontr�, luego de removerlo debe
//	devolverlo con return, y si no debe devolver null.
//	 private void mostrarIntegrantes()
//	Muestra por consola la cantidad de integrantes y los nombres de cada uno de
//	ellos.
//	 public void mostrar()
//	Muestra por consola el nombre del grupo, la cantidad de integrantes y el
//	nombre de cada uno de ellos.
//	 public void vaciar()
//	Elimina todos los elementos de la lista de integrantes.

	
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

