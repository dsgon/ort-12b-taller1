package ar.edu.ort.taller1.tp4.Ejercicio5;

import ar.edu.ort.taller1.tp4.util.*;

public class Alumno extends Persona {
	public Alumno(String nombreCompleto, int dni, int anioNacimiento, RangoDeEnteros rango) {
		super(nombreCompleto, anioNacimiento, anioNacimiento);
		if (nombreCompleto.equals(null) || nombreCompleto.isEmpty())
			throw new IllegalArgumentException();
		if (dni < rango.getLimiteInferior() || dni > rango.getLimiteSuperior())
			throw new IllegalArgumentException();
		if (anioNacimiento < 1900 )
			throw new IllegalArgumentException();
	}


}
