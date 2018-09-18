package ar.edu.ort.taller1.tp2.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Electrodomestico> inventario = new ArrayList<Electrodomestico>();
		
		Electrodomestico heladera1 = new Heladera("Whirlpool",
				"H2745", "WH2745-0001", "220", "apagado", 14999,
				"250", "no frost");
		Electrodomestico tv1 = new Televisor("Philips", "49PGFS",
				"PTV49GFS-0001", "220", "apagado", 14370, "49", "Smart");
		Electrodomestico lavarropa1 = new Lavarropa("Dream", "CONCEPT 5.05", 
				"LRDC6K-0001", "220", "apagado", 6799, "6Kg", "Semi Automatico");
		Electrodomestico licuadora1 = new Licuadora("Oster", "Plus 4V", 
				"LCOP4V-0001", "220", "apagado", 2000, "40W", "4");
		Electrodomestico heladera2 = new Heladera("LG",
				"LG1234", "LG1234-0001", "220", "apagado", 12999,
				"200", "frost");
		Electrodomestico tv2 = new Televisor("Sony", "50PG4K",
				"STV504K-0001", "220", "apagado", 20000, "50", "Smart");
		Electrodomestico lavarropa2 = new Lavarropa("LG", "ACME 1.01", 
				"LGACME1.01-0001", "220", "apagado", 11999, "9Kg", "Automatico");
		Electrodomestico licuadora2 = new Licuadora("TopHouse", "TP2V", 
				"TP2V-0001", "220", "apagado", 1000, "20W", "2");
		
		//Programa
		System.out.println("Seleccione un tipo de producto: '1' para 'TV', "
				+ "'2' para 'Heladera', '3' para 'Lavarropa', '4' para 'Licuadora' o '0' para 'Finalizar'");
		int option = validarOpcion();
		
		while(option!=0) {
			switch (option) {
			case 1:
				break;

			default:
				break;
			}
		}
		
		System.out.println("Fin de la comunicacion");
		

	}
	
	private static int validarOpcion() {
		int option = input.nextInt();
		while (option < 0 || option >4) {
			System.out.println("Ingrese una opcion valida");
			option = input.nextInt();
		}
		return option;
	}

}
