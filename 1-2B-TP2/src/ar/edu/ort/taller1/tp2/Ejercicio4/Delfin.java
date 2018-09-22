package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Delfin extends Animal {
	private final String claseDeAlimento = "Pulpo";
	private Entrenador entrenador;
	public Delfin(String nombre, int peso, int tamanio,String alimento, Entrenador entrenador) {
		super(nombre,peso,tamanio,alimento);
		this.entrenador = entrenador;
	}
	
	public void realizarTruco(String nombreTruco) {
		boolean realizado = false, fallo = false;
		int i = 0;
		if (nombreTruco != "") {
			while (realizado = false && i < super.cantidadHabilidades()) {
				if (super.getHabilidad(i).getNombre().equals(nombreTruco)) {
//					if (alimento.getNombre().equals(claseDeAlimento)) {
//						fallo = super.getHabilidad(i).ejecutarHabilidad(alimento);
//					}
//					else {
//						System.out.println("ERROR: No es la clase de alimento que consume el animal");
//						fallo = false;
//					}
					
					super.getHabilidad(i).ejecutarHabilidad(super.getCuidador(), this.claseDeAlimento);
					
					if (fallo = false) {
						System.out.println(this.getClass() + "se le ordeno realizar " + super.getHabilidad(i).getNombre() + " ,pero no tiene suficiente alimento");
					}
					else
					{
						System.out.println(this.getClass() + " " + super.getNombre() + ", realizo " + super.getHabilidad(i).getNombre() + ", recibio " + super.getHabilidad(i).getCosteAlimento() + " kg de " + this.claseDeAlimento);
					}
					realizado = true;
				}
			i++;
			}
		}
	}
}
