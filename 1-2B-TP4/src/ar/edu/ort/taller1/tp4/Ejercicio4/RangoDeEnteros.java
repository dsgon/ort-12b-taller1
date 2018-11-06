package ar.edu.ort.taller1.tp4.Ejercicio4;

public class RangoDeEnteros {
	
	private int limiteInferior;
	private int limiteSuperior;
	
	public RangoDeEnteros(int a, int b) {
		ordenarValores(a,b);
	}
	
	public void ordenarValores(int x, int y) {
		if(x>y) {
			setMinValue(y);
			setMaxValue(x);
		}else {
			setMinValue(x);
			setMaxValue(y);
		}
	}
	
	public void setMinValue(int min) { this.limiteInferior = min; }
	
	public void setMaxValue(int max) { this.limiteSuperior = max; }
	
	public boolean incluye(int value) {
		return (value >= limiteInferior && value<= limiteSuperior);
	}

}
