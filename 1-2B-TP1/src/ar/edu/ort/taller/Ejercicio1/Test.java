package ar.edu.ort.taller.Ejercicio1;

public class Test {

	public static void main(String[] args) {
		//Crear instancia de Grupo
		Grupo grupo = new Grupo("1ro 2do B");

		//Agregar miembros reales del Grupo
		agregarAlGrupo("Guillermo Antun", grupo);
		agregarAlGrupo("Mariana Carballal", grupo);
		agregarAlGrupo("David Gonzalez", grupo);

		//Agregar miembro ficticio
		System.out.println();
		agregarAlGrupo("Dwayne Johnson", grupo);

		//Mostrar todos los integrantes del Grupo
		System.out.println();
		grupo.mostrar();

		//Buscar a un integrante del Grupo
		System.out.println();
		buscarEnGrupo("Dwayne Johnson", grupo);

		//Buscar a una persona no cargada en el Grupo
		System.out.println();
		buscarEnGrupo("Sylvester Stallone", grupo);

		//Buscar un estudiante por su posicion
		System.out.println();
		System.out.println(grupo.obtenerIntegrante(2));

		//Eliminar estudiante ficticio
		System.out.println();
		System.out.println("Se ha eliminado " + grupo.removerIntegrante("Dwayne Johnson"));

		//Eliminar nuevamente al estudiante ficticio
		System.out.println();
		System.out.println("Se ha eliminado " + grupo.removerIntegrante("Dwayne Johnson"));

		//Mostrar todos los integrantes del Grupo
		System.out.println();
		grupo.mostrar();

		//Vaciar Grupo
		grupo.vaciar();

		//Mostrar todos los integrantes del Grupo
		System.out.println();
		grupo.mostrar();	
	}
	
	public static void agregarAlGrupo(String nombre, Grupo grupo) {
		grupo.agregarIntegrante(nombre);
	}
	
	public static void buscarEnGrupo(String nombre, Grupo grupo) {
		if (!nombre.isEmpty()) {
			if(grupo.buscarIntegrante(nombre) != null) {
				System.out.println("El Integrante: " + nombre + " se encuentra en el grupo");
			}
			else {
				System.out.println("No se encuentra al Integrante: " + nombre);
			}
		}
		else {
			System.out.println("No se encuentra al Integrante.");
		}
	}
}
