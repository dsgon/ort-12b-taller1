package ar.edu.ort.taller.Ejercicio4;

public class Anio {
	
	private String[] meses = new String[12];
	private int[] cantidadDiasMes = new int[12];

	public Anio() {
		this.meses = new String[] {"Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		this.cantidadDiasMes = new int[]{31,28,31,30,31,30,31,31,30,31,30,31}; 
	}
	
	public String[] getMeses() { return this.meses; }
	
	public String getNombreMes(int numeroMes) {
		String result;
		if((numeroMes<0)&&(numeroMes>12)){
			result = this.meses[numeroMes-1];
		} else {
			result = "Mes inexistente. Por favor verifique";
		}
		return result;
	}
	
	public int diasTranscurridos(int numeroMes){
		int result = 0;
		
		if (numeroMes==1) {
			for (int i=0;i<cantidadDiasMes.length;i++) {
				result += this.cantidadDiasMes[i];
			}
		} else if((numeroMes>1)&&(numeroMes<=12)){
			for (int i=0; i<=numeroMes-1; i++) {
				result += this.cantidadDiasMes[i];
			}
		}
		return result;
	}

}
