package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Delfin extends Animal {
	
	private static final TIPO_ALIMENTO alimento = TIPO_ALIMENTO.PULPO;
	private Entrenador entrenador;
	
	public Delfin(String nombre, int peso, int tamanio, Entrenador entrenador) {
		super(nombre,peso,tamanio,alimento);
		this.entrenador = entrenador;
	}
	
	@Override
	public void realizarTruco(String nombreTruco, Alimento alimento) {
		boolean realizado = false, fallo = false;
		int i = 0;
		if (nombreTruco != "") {
			while (realizado == false && i < super.cantidadHabilidades()) {
				if (super.getHabilidad(i).getNombre().equals(nombreTruco)) {
					realizado = super.getHabilidad(i).ejecutarHabilidad(super.getCuidador(), alimento);
					break;
				}
				i++;
			}
			if (!realizado)
				System.out.println("Delfin "+super.getNombre()+" se le ordeno realizar " + super.getHabilidad(i).getNombre() + " ,pero no tiene suficiente alimento");
			else
				System.out.println("Delfin " + super.getNombre() + ", realizo " + super.getHabilidad(i).getNombre() + ", recibio " + super.getHabilidad(i).getCosteAlimento() + " kg de " + alimento.getTipo());
		}
	}
}
