package ar.edu.ort.taller1.tp4.Ejercicio5;

import java.time.Year;
import java.util.Scanner;
import ar.edu.ort.taller1.tp4.util.LectorEnteros;
import ar.edu.ort.taller1.tp4.util.RangoDeEnteros;

public class Ejer5 {
	public static final RangoDeEnteros rango = new RangoDeEnteros(10000000, 999999999);
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		LectorEnteros lector = new LectorEnteros(input);
		Alumno alu = null;
		int dni, anioNacimiento = 0;
		String nombreCompleto;

		while (alu==null) {
			System.out.println("Ingrese el nombre de la persona");
			nombreCompleto = input.nextLine();
			dni = lector.pedir("Ingrese el dni de la persona entre (10000000 y 99999999)", rango);
			anioNacimiento = lector.pedir("Ingrese el año de nacimiento");
			try {
				alu = new Alumno(nombreCompleto,dni,anioNacimiento, rango);
			} catch (IllegalArgumentException e) {
				System.out.println("Ingrese bien el valor que pide el campo");
				input.nextLine();
			}
		}
		input.close();
		System.out.println(alu.toString());
	}
}
