package ar.edu.ort.taller.Ejercicio5;

import ar.edu.ort.taller.Ejercicio5.AnioV2;

public class Test {

	public static void main(String[] args) {
		
		AnioV2 a2 = new AnioV2();
		
		System.out.println("Listado de Meses");
		for (int i = 0; i < a2.getMeses().length; i++) {
			System.out.println(a2.getMeses()[i]);
		}
		
		System.out.println();
		System.out.println("Obtener Nombre de un mes:");
		System.out.println(a2.getNombreMes(7));

	}

}
