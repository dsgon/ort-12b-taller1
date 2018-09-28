package ar.edu.ort.taller1.tp3.Ejercicio1;

public class Test {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Kimi", "Raikkonen");
		
		p1.agregarNumeroTelefonico(54, 114111, 2222, TipoDeLinea.CELULAR);
		p1.agregarNumeroTelefonico(68, 032444, 5678, TipoDeLinea.CELULAR);
		p1.agregarNumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);
		p1.agregarEmail("kimi@raikkonen.com");
		
		p1.mostrarTodo();

	}

}
