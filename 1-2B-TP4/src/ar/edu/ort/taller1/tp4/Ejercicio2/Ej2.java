package ar.edu.ort.taller1.tp4.Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;
		
		System.out.println("La variable \"numero\" actualmente vale " + numero + ".");
		System.out.println("Ingrese un nuevo valor para \"numero\":");
		try {
			numero = input.nextInt();
		} catch (InputMismatchException e){
			System.out.println("Hubo un error en la carga del numero: " + e.getMessage());
		} finally {
			System.out.println("\"numero\" despues de la carga vale: " + numero);
		}
		input.next();
		input.close();
	}

}
