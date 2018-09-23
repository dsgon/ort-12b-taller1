package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Orca extends Animal {
	
	public Orca(String nombre, int peso, int tamanio) {
		super(nombre,peso,tamanio,TIPO_ALIMENTO.CALAMAR);
	}
	
	@Override
	public void realizarTruco(String nombreTruco, Alimento alimento) {
		boolean realizado = false;
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
				System.out.println("Orca "+super.getNombre()+" se le ordeno realizar " + super.getHabilidad(i).getNombre() + " ,pero no tiene suficiente alimento");
			else
				System.out.println("Orca " + super.getNombre() + ", realizo " + super.getHabilidad(i).getNombre() + ", recibio " + super.getHabilidad(i).getCosteAlimento() + " kg de " + alimento.getTipo());
		}
	}

}
