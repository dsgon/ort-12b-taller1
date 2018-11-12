package ar.edu.ort.taller1.tp4.Ejercicio4;

import java.util.Scanner;

import ar.edu.ort.taller1.tp4.util.LectorEnteros;
import ar.edu.ort.taller1.tp4.util.RangoDeEnteros;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String mensaje;
		int limA;
		int limB;
		int finCarga;
		
		System.out.println("** Intentar instanciar LectorEnteros sin Scanner **");
		try {
			LectorEnteros le = new LectorEnteros(null);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		System.out.println();
		
		LectorEnteros le = new LectorEnteros(input);
		
		System.out.println("** Metodo pedir() con mensaje **");
		le = new LectorEnteros(input);
		le.pedir("Ingrese Hola");

		
		System.out.println();
		System.out.println("** Metodo pedir() con mensaje null y Rango null**");
		RangoDeEnteros rango = null;
		le.pedir(null, rango);
		
		System.out.println();
		System.out.println("** Metodo pedir() con mensaje null y Rango valido**");
		rango = new RangoDeEnteros(1, 10);
		le.pedir(null, rango);
		
		System.out.println();
		System.out.println("** Metodo pedir() con mensaje y Rango valido**");
		rango = new RangoDeEnteros(1, 10);
		le.pedir("Ingrese la nota del Alumno", rango);
		
		
		System.out.println();
		System.out.println("** Metodo pedir() con solicitud mensaje, limite A y limite B **");
		mensaje = "Ingrese la nota del alumno:";
		limA = 1;
		limB = 10;
		le.pedir(mensaje,limA, limB);
		
		System.out.println();
		System.out.println("** Metodo pedir() sin parametros **");
		le.pedir();
		
		
		System.out.println();
		System.out.println("** Metodo pedir() con solicitud mensaje, limite A, limite B y Fin de Carga**");
		mensaje = "Ingrese la nota del alumno:";
		limA = 1;
		limB = 10;
		finCarga = -1;
		le.pedir(mensaje,limA,limB,finCarga);
		
		System.out.println();
		System.out.println("** Metodo pedir() con solicitud mensaje, rango valido y Fin de Carga**");
		mensaje = "Ingrese la nota del alumno:";
		rango = new RangoDeEnteros(1, 10);
		finCarga = -1;
		le.pedir(mensaje,rango,finCarga);
		
	}

}
