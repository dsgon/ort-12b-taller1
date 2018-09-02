package ar.edu.ort.taller.Ejercicio4;

public class Test {

	public static void main(String[] args) {
		
		Anio a1 = new Anio();
		
		//Imprimir listado de meses del anio
		for (String meses : a1.getMeses()) {
			System.out.println(meses);
		}
		
		//Imprimir cantidad de dias transcurridos en el anio
		System.out.println();
		printDiasTranscurridos(a1, 1);
		
		//Imprimir cantidad de dias transcurridos hasta el mes 5
		System.out.println();
		printDiasTranscurridos(a1, 5);
		
		//Cumpleanios Guillermo
		System.out.println();
		System.out.println("Guillermo nacio en el mes 2");
		printDiasTranscurridos(a1, 2);
		printMesNaciomiento(a1,2);
		
		//Cumpleanios David
		System.out.println();
		System.out.println("David nacio en el mes 1");
		printDiasTranscurridos(a1, 1);
		printMesNaciomiento(a1,1);
		
		//Cumpleanios Mariana
		System.out.println();
		System.out.println("Mariana nacio en el mes 4");
		printDiasTranscurridos(a1, 4);
		printMesNaciomiento(a1,4);
	}
	
	private static void printMesNaciomiento(Anio a, int mes) {
		System.out.println("El mes de nacimiento es: "+a.getNombreMes(mes));
		
	}

	public static void printDiasTranscurridos(Anio a,int mes) {
		System.out.println("han transcurrido: "+a.diasTranscurridos(mes)+" dias");
	}

}
