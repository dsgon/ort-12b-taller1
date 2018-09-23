package ar.edu.ort.taller1.tp2.Ejercicio4;

public class Test {

	public static void main(String[] args) {
		
		Show ej4 = new Show();
		
		Entrenador ent1 = new Entrenador("Guillermo", "0800", "1300", 3);
		Entrenador ent2 = new Entrenador("Mariana", "1200", "1900", 4);
		Entrenador ent3 = new Entrenador("David", "1800", "2300", 2);
		
		Cuidador cuid1 = new Cuidador("Pedro", "0800", "1300", 5);
		Cuidador cuid2 = new Cuidador("Juan", "1200", "1900", 5);
		Cuidador cuid3 = new Cuidador("Ana", "1800", "2300", 5);
		
		Animal flipper = new Delfin("Flipper", 50, 100,ent1);
		Animal willy = new Orca("Willy", 50, 100);
		Animal kuni = new Delfin("Kuni", 50, 100,ent2);
		Animal rupert = new LoboMarino("Rupert", 50, 100);
		
		flipper.agregarHabilidad(new Habilidad("Truco 1", 6));
		flipper.agregarHabilidad(new Habilidad("Truco 2", 8));
		willy.agregarHabilidad(new Habilidad("Truco 1", 12));
		kuni.agregarHabilidad(new Habilidad("Truco 2", 8));
		kuni.agregarHabilidad(new Habilidad("Truco 1", 6));
		rupert.agregarHabilidad(new Habilidad("Truco 3", 13));
		
		
		ej4.darAltaAnimal(flipper,cuid1);
		ej4.darAltaAnimal(willy,cuid2);
		ej4.darAltaAnimal(kuni,cuid2);
		ej4.darAltaAnimal(rupert,cuid3);
		
		Alimento pulpo = new Alimento(TIPO_ALIMENTO.PULPO, 30);
		Alimento cangrejo = new Alimento(TIPO_ALIMENTO.CANGREJO, 25);
		Alimento calamar = new Alimento(TIPO_ALIMENTO.CALAMAR, 50);
		
		ej4.agregarAlimento(pulpo);
		ej4.agregarAlimento(cangrejo);
		ej4.agregarAlimento(calamar);
		
		ej4.comenzarShow();
		
		flipper.realizarTruco("Truco 1", pulpo);
		willy.realizarTruco("Truco 1", calamar);
		kuni.realizarTruco("Truco 2", pulpo);
		flipper.realizarTruco("Truco 2", pulpo);
		rupert.realizarTruco("Truco 3", cangrejo);
		kuni.realizarTruco("Truco 1", pulpo);
		rupert.realizarTruco("Truco 3", cangrejo);
		
		ej4.finalizarShow();

	}

}
