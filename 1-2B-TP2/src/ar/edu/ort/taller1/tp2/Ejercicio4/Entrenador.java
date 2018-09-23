package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Entrenador extends Empleado{
	
		private int aniosExperiencia;
		
		public Entrenador(String nombre, String horarioEntrada, String horarioSalida, int aniosExperiencia) {
			super(nombre, horarioEntrada, horarioSalida);
			this.aniosExperiencia = aniosExperiencia;
		}
		
		public int getAniosExperiencia(){
			return this.aniosExperiencia;
		}
	}