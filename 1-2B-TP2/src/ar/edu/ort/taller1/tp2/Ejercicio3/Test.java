package ar.edu.ort.taller1.tp2.Ejercicio3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Electrodomestico> inventario = new ArrayList<Electrodomestico>();
		
		Electrodomestico heladera1 = new Heladera("Whirlpool",
				"H2745", "WH2745-0001", "220", "apagado", 14999,
				"250", "no frost");
		Electrodomestico tv1 = new Televisor("Philips", "49PGFS",
				"PTV49GFS-0001", "220", "apagado", 14370, "49", "Smart");
		
		
	}

}
