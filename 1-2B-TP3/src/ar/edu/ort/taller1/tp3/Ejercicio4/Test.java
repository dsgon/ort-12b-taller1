package ar.edu.ort.taller1.tp3.Ejercicio4;

public class Test {

	public static void main(String[] args) {
		
		Direccion d = new Direccion("Monroe", "2861", "4", "C");
		Vivienda v = new Vivienda(d);
		
		Persona p = new Persona("Mariana", "Carballal", 26);
		Persona p2 = new Persona("David", "Gonzalez", 30);
		Persona p3 = new Persona("Guillermo", "Antun", 28);
		
		v.agregarPersona(p);
		v.agregarPersona(p2);
		v.agregarPersona(p3);
		
		Mueble m = new Mueble("mesa", "madera", "cedro");
		Mueble m2 = new Mueble("cama", "tela", "gris");
		Mueble m3 = new Mueble("sofa", "tela", "negro");
		Mueble m4 = new Mueble("silla", "plastico", "rojo");
		
		v.agregarMueble(m);
		v.agregarMueble(m2);
		v.agregarMueble(m3);
		v.agregarMueble(m4);
		
		v.mostrarVivienda();

	}

}
