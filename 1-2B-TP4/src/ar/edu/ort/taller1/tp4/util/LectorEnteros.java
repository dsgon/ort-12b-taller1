package ar.edu.ort.taller1.tp4.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.OperationsException;

public class LectorEnteros {
	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_ERROR_RANGO_NULL = "El rango no debe ser null.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_ERROR_CARGA = "Error en la carga! ";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";

	private static final String MASCARA_MENSAJE_CARGA_ENTERO = "%s:";
	private static final String MASCARA_MENSAJE_RANGO = "%s(entre %d y %d):";
	private static final String MASCARA_MENSAJE_RANGO_CON_FIN = "%s (entre %d y %d, %d para abandonar la carga):";
	
	private static final String MASCARA_MENSAJE_DENTRO_DE_RANGO = "el valor %d esta dentro del rango(%d y %d)";  

	private Scanner scanner;

	private int cargar(String mensaje) {
		System.out.printf(MASCARA_MENSAJE_CARGA_ENTERO, mensaje);
		return Integer.parseInt(scanner.nextLine());
	}
	public LectorEnteros(Scanner scanner) throws IllegalArgumentException{
			if (scanner == null){
				throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}
		this.scanner = scanner;
	}

	public int pedir(String mensaje){
		int num = 0;
		boolean ok = false;
		System.out.println(mensaje);
		while (!ok){
			try {
				num = scanner.nextInt();
				ok = true;
			} catch (InputMismatchException e){
				System.out.println(MENSAJE_CARGA_ENTERO);
				scanner.next();
			}
		}		
		return num;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido) {
		int num = 0;
		boolean ok = false;
		
		if (mensaje==null){
			mensaje = MENSAJE_CARGA_ENTERO;
		}
		System.out.println(mensaje);
		while (!ok){
			try {
				num = scanner.nextInt();
				ok = rangoValido.incluye(num);
				if (!ok) {
					throw new IllegalArgumentException();
				}
			} catch (IllegalArgumentException i) {
				System.out.println(String.format(MASCARA_MENSAJE_RANGO, 
						MENSAJE_FUERA_DE_RANGO,
						rangoValido.getLimiteInferior(),
						rangoValido.getLimiteSuperior()));
			} catch (InputMismatchException e){
				System.out.println(mensaje);
			} catch (NullPointerException np) {
				System.out.println(MENSAJE_ERROR_RANGO_NULL);
				break;
			}
			scanner.nextLine();
		}
		
		return num;
	}

	public int pedir(String mensaje, int limA, int limB) {
		boolean ok = false;
		RangoDeEnteros rangoDeEnteros = null;
		int num = 0;
		
		try {
			rangoDeEnteros = new RangoDeEnteros(limA, limB);
		} catch (IllegalArgumentException e){
			System.out.println(MENSAJE_ERROR_CARGA);
		} 
		
		while(!ok) {
			try {
				System.out.println(String.format(MASCARA_MENSAJE_RANGO, mensaje,limA,limB));
				num = scanner.nextInt();
				if(!rangoDeEnteros.incluye(num))
					throw new IllegalArgumentException();
				ok = true;
			} catch (IllegalArgumentException i) {
				System.out.println(MENSAJE_FUERA_DE_RANGO);
			} catch (InputMismatchException e){
				System.out.println(MENSAJE_ERROR_CARGA);
				scanner.next();
			} catch (NullPointerException np) {
				System.out.println(MENSAJE_ERROR_RANGO_NULL);
			}
		}
		System.out.println(String.format(MASCARA_MENSAJE_DENTRO_DE_RANGO, 
				num,
				rangoDeEnteros.getLimiteInferior(),
				rangoDeEnteros.getLimiteSuperior()));
		return num;		
	}
	
	public int pedir() {
		int num = 0;
		boolean result = false;
		while(!result) {
			System.out.println(MENSAJE_CARGA_ENTERO);
			try {
				num = scanner.nextInt();
				result = true;
			} catch (InputMismatchException e) {
				System.out.println(MENSAJE_ERROR_CARGA);
				scanner.next();
			}
		}
		return num;
	}
	
	
	public int pedir(String mensaje, int limiteA, int limiteB, int valorFinCarga) {
		boolean ok = false;
		RangoDeEnteros rangoDeEnteros = null;
		int num = 0;
		
		try {
			rangoDeEnteros = new RangoDeEnteros(limiteA, limiteB);
		} catch (IllegalArgumentException e){
			System.out.println(MENSAJE_ERROR_CARGA);
		}

		while(!ok) {
			try {
				System.out.println(String.format(MASCARA_MENSAJE_RANGO_CON_FIN, mensaje,limiteA,limiteB,valorFinCarga));
				num = scanner.nextInt();
				while(num!=valorFinCarga) {
					if(!rangoDeEnteros.incluye(num))
						throw new IllegalArgumentException();
					System.out.println(String.format(MASCARA_MENSAJE_RANGO_CON_FIN, mensaje,limiteA,limiteB,valorFinCarga));
					num = scanner.nextInt();
				}
				throw new OperationsException();
			} catch (IllegalArgumentException i) {
				System.out.println(MENSAJE_FUERA_DE_RANGO);
			} catch (InputMismatchException e){
				System.out.println(MENSAJE_ERROR_CARGA);
				scanner.next();
			} catch (NullPointerException np) {
				System.out.println(MENSAJE_ERROR_RANGO_NULL);
			} catch (OperationsException oe) {
				System.out.println("Fin");
				ok = true;
			}
		}

		return num;	
	}
	
	public int pedir(String mensaje, RangoDeEnteros rango, int valorFinCarga){
		boolean ok = false;
		int num = 0;

		while(!ok) {
			try {
				System.out.println(String.format(MASCARA_MENSAJE_RANGO_CON_FIN, mensaje,
						rango.getLimiteInferior(),
						rango.getLimiteSuperior(),
						valorFinCarga));
				num = scanner.nextInt();
				while(num!=valorFinCarga) {
					if(!rango.incluye(num))
						throw new IllegalArgumentException();
					System.out.println(String.format(MASCARA_MENSAJE_RANGO_CON_FIN, mensaje,
							rango.getLimiteInferior(),
							rango.getLimiteSuperior(),
							valorFinCarga));
					num = scanner.nextInt();
				}
				throw new OperationsException();
			} catch (IllegalArgumentException i) {
				System.out.println(MENSAJE_FUERA_DE_RANGO);
			} catch (InputMismatchException e){
				System.out.println(MENSAJE_ERROR_CARGA);
				scanner.next();
			} catch (NullPointerException np) {
				System.out.println(MENSAJE_ERROR_RANGO_NULL);
			} catch (OperationsException oe) {
				System.out.println("Fin");
				ok = true;
			}
		}

		return num;	
	}

}
