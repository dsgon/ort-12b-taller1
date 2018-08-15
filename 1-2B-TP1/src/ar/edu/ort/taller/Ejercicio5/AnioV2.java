package ar.edu.ort.taller.Ejercicio5;

public class AnioV2 {
	
	private int[] cantidadDiasMes = new int[12];

	public AnioV2() {
		this.cantidadDiasMes = new int[]{31,28,31,30,31,30,31,31,30,31,30,31}; 
	}
	
	public String[] getMeses() {
		String[] meses = new String [MESES.values().length];
		for (int i=0; i<meses.length; i++) {
			meses[i] = MESES.values()[i].name();
		}		
		return meses;
	}
	
	public String getNombreMes(int numeroMes) {
		return MESES.values()[numeroMes-1].name();
	}
	
	public int diasTranscurridos(int numeroMes){
		int result = 0;
		
		if (numeroMes==1) {
			for (int i=0;i<cantidadDiasMes.length;i++) {
				result += this.cantidadDiasMes[i];
			}
		} else if((numeroMes>1)&&(numeroMes<=12)){
			for (int i=0; i<numeroMes-1; i++) {
				result += this.cantidadDiasMes[i];
			}
		}
		return result;
	}

}
