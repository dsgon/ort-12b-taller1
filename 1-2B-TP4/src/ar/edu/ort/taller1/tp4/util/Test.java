package ar.edu.ort.taller1.tp4.util;

import java.time.Year;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int nacimiento = 0;
		int fallecimiento=0;
		Scanner input = new Scanner(System.in);
		LectorEnteros le = new LectorEnteros(input);
		int anioActual;
		
		le.pedir("ingrese un numero entero");
		
		
		
		input.close();
	}
}
