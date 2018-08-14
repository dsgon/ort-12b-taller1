package ar.edu.ort.taller.Ejercicio4;

public class Test {

	public static void main(String[] args) {
		
		Anio a1 = new Anio();
		
		System.out.println("Listado de meses en el año");
		for (String meses : a1.getMeses()) {
			System.out.println(meses);
		}
		System.out.println();
		System.out.println("Cantidad de dias transcurridos en todo el año");
		printDiasTranscurridos(a1, 1);
		System.out.println();
		System.out.println("Cantidad de dias transcurridos hasta el mes 5");
		printDiasTranscurridos(a1, 5);
		System.out.println();
		System.out.println("Guillermo nacio en el mes 2");
		printDiasTranscurridos(a1, 2);
		printMesNaciomiento(a1,2);
		System.out.println();
		System.out.println("David nacio en el mes 1");
		printDiasTranscurridos(a1, 1);
		printMesNaciomiento(a1,1);
		System.out.println();
		System.out.println("Mariana nacio en el mes 9");
		printDiasTranscurridos(a1, 9);
		printMesNaciomiento(a1,9);

	}
	
	private static void printMesNaciomiento(Anio a, int mes) {
		System.out.println("El mes de nacimiento es: "+a.getNombreMes(mes));
		
	}

	public static void printDiasTranscurridos(Anio a,int mes) {
		System.out.println("han transcurrido: "+a.diasTranscurridos(mes)+" dias");
	}

}
