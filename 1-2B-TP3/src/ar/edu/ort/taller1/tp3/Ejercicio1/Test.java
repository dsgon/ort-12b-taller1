package ar.edu.ort.taller1.tp3.Ejercicio1;

public class Test {

	public static void main(String[] args) {
		
		Persona p = new Persona("Mariana", "Carballal");
		
		p.agregarEmail("marianacarb@hotmail.com");
		p.agregarEmail("mariana.carballal@hotmail.com");
		p.agregarEmail("guasuguasol1@gmail.com");
		
		p.agregarTelefono(11, 35871648, 54, TIPO_DE_LINEA.CELULAR);
		p.agregarTelefono(237, 4629893, 54, TIPO_DE_LINEA.FIJO);
		
		p.mostrarTodo();

	}

}
