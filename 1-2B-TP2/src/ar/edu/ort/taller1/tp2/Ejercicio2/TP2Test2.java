package ar.edu.ort.taller1.tp2.Ejercicio2;

import ar.edu.ort.taller1.tp2.Ejercicio1.Empleado;

public class TP2Test2 {

	public static void main(String[] args) {

		Empleado pedro = new Vendedor("Pedro", 25, 100, 200, 5);
		Empleado maria = new Vendedor("Maria", 30, 100, 200, 10);
		
		System.out.println("Vendedor 1 "+pedro.getNombre()+" gana: $ "+pedro.calcularPago());
		System.out.println("Vendedor 2 "+maria.getNombre()+" gana: $ "+maria.calcularPago());

	}

}
