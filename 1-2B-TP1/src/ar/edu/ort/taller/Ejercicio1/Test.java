package ar.edu.ort.taller.Ejercicio1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grupo grupo = new Grupo("1ero 1ero B");
		agregarAlGrupo("Guillermo Antun", grupo);
		agregarAlGrupo("Mariana Carballal", grupo);
		agregarAlGrupo("David Gonzalez", grupo);
		agregarAlGrupo("Dwayne Johnson", grupo);
		grupo.mostrar();
		buscarEnGrupo("Dwayne Johnson", grupo);
		buscarEnGrupo("Sylvester Stallone", grupo);
		System.out.println("Se ha eliminado " + grupo.removerIntegrante("Dwayne Johnson"));
		System.out.println("Se ha eliminado " + grupo.removerIntegrante("Dwayne Johnson"));
		grupo.mostrar();
		grupo.vaciar();
		grupo.mostrar();
	}
	public static void agregarAlGrupo(String nombre, Grupo grupo) {
		grupo.agregarIntegrante(nombre);
		System.out.println("Se agrego "+ nombre + " al grupo: " + grupo.getNombre());
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
