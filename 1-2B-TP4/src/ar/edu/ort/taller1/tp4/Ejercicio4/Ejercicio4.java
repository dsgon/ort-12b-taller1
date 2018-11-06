package ar.edu.ort.taller1.tp4.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			LectorDeEnteros le = new LectorDeEnteros(input);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		

	}

}
