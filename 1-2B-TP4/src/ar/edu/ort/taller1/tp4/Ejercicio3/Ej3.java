package ar.edu.ort.taller1.tp4.Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
	
	public static int pedirNumeroEntero() {
		
		Scanner input = new Scanner(System.in);
		int numero = 0;
		boolean ok = false;
		
		while (!ok) {
			System.out.println("Ingresa un numero entero: ");
			try{
				numero = input.nextInt();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("Hubo un error en la carga del numero.");
				input.next();
			}

		}
		input.close();
		return numero;
	}
	
	public static void main(String[] args) {
		int numero = 0;
		numero = pedirNumeroEntero();
		System.out.println("El numero ingresado fue " + numero + ".");
	}



}
