package ar.edu.ort.taller1.tp2.Ejercicio1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado jose = new Asalariado("Jose", 30, 10000f);
		Empleado carlos = new SubContratado("Carlos", 23, 50f, 100f);
		System.out.println("Asalariado: " + jose.getNombre() + " gana: " + jose.calcularPago());
		System.out.println("Subcontratado " + carlos.getNombre() + " gana: " + carlos.calcularPago());
	}

}
