package ar.edu.ort.taller1.tp4.Ejercicio1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;
		
		System.out.println("El numero antes de la carga vale: " + numero);
		System.out.println("Ingrese un numero : ");
		try {	
			numero = Integer.parseInt(input.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Hubo un error en la carga del numero: " + e.getMessage());
		} finally {
			System.out.println("El numero despues de la carga vale: " + numero);
		}
		
		input.close();
	}

}
