package ar.edu.ort.taller1.tp4.Ejercicio4;

import java.util.Scanner;

public class LectorDeEnteros {
	
	private final String SCANNER_ERROR_MESSAGE = "El objeto Scanner no puede ser null";
	
	private Scanner scanner;
	
	public LectorDeEnteros(Scanner scanner) {
		validarScanner(scanner);
	}
	
	public void validarScanner(Scanner s) {
		if(s==null)
			throw new IllegalArgumentException(SCANNER_ERROR_MESSAGE);
		this.scanner = s;
	}
	
	public int pedir(String message) {
		System.out.println(message);
		int numero = scanner.nextInt();
		return numero;
	}

}
