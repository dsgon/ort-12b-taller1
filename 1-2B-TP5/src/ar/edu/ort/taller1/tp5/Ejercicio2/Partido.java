package ar.edu.ort.taller1.tp5.Ejercicio2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Partido {

	private Queue<Evento> eventos;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private Scanner s;
	
	public Partido() {
		this.eventos = new LinkedList<Evento>();
		this.s = new Scanner(System.in);
	}
	
	public void realizarPartido() {
		cargarEquipo("local");
		cargarEquipo("visitante");
		while(!finalizarPartido()) {
			cargarEvento();
		}
		procesarPartido();
	}
	
	
	private void cargarEquipo(String tipo) {
		System.out.println("Ingrese nombre del Equipo "+tipo);
		String nombreEquipo = s.next();
		if (tipo.equals("local")) {
			this.equipoLocal = new Equipo(nombreEquipo);
		} else {
			this.equipoVisitante = new Equipo(nombreEquipo);
		}
		
	}
	
	private String cargaMinuto() {
		System.out.println("Ingrese minuto");
		int min = s.nextInt();
		while(min<0 || min >100){
			System.out.println("Ingrese un minuto valido");
			min = s.nextInt();
		}
		return String.valueOf(min);
	}
	
	private Equipo seleccionarEquipo() {
		System.out.println("Ingrese localidad del equipo (L o V)");
		String opcion = s.next();
		while(true) {
			switch (opcion) {
			case "L":
				return equipoLocal;
			case "V":
				return equipoVisitante;
			default:
				System.out.println("Opcion invalida, ingrese L o V");
				opcion = s.next();
				break;
			}
		}
	}
	
	private Jugador cargarJugador(Equipo e, boolean activo) {
		System.out.println("Ingrese nombre del Jugador (Ejemplo: 'Jugador#')");
		String opcion = s.next();
		int i=0;
		while(true) {
			if(activo) {
				while (i<e.getJugadoresActivos().size()) {
					String nombre = e.getJugadoresActivos().get(i).getNombre();
					if(opcion.equals(nombre)) {
						return e.getJugadoresActivos().get(i);
					}
					i++;
				}
			} else {
				while (i<e.getJugadoresBanca().size()) {
					if(opcion.equals(e.getJugadoresBanca().get(i).getNombre())) {
						return e.getJugadoresBanca().get(i);
					}
					i++;
				}
			}
			System.out.println("El nombre ingresado no existe dentro del equipo: "+ e.getNombre() +". Ingrese de nuevo el nombre");
			opcion = s.next();
		}
	}
	
	private boolean cargarPenal() {
		System.out.println("Ingrese si el gol fue de tipo penal (S o N)");
		String opcion = s.next();
		while(true) {
			switch (opcion) {
			case "S":
				return true;
			case "N":
				return false;
			default:
				System.out.println("Opcion invalida, ingrese S o N");
				opcion = s.next();
				break;
			}
		}
	}
	
	private TIPO_TARJETA cargarTipoTarjeta() {
		System.out.println("Ingrese tipo de Tarjeta (A o R)");
		String opcion = s.next();
		while(true) {
			switch (opcion) {
			case "A":
				return TIPO_TARJETA.AMARILLA;
			case "R":
				return TIPO_TARJETA.ROJA;
			default:
				System.out.println("Opcion invalida, ingrese A o R");
				opcion = s.next();
				break;
			}
		}
	}
	
	private void cargarGol() {
		String min = cargaMinuto();
		Equipo e = seleccionarEquipo();
		Jugador j = cargarJugador(e,true);
		boolean p = cargarPenal();
		eventos.add(new Gol(min,e,j,p));
	}
	
	private void cargarCambio() {
		String min = cargaMinuto();
		Equipo e = seleccionarEquipo();
		Jugador jI = cargarJugador(e,true);
		Jugador jO = cargarJugador(e,false);
		eventos.add(new Cambio(min, e, jI, jO));
	}
	
	private void cargarTarjeta() {
		String min = cargaMinuto();
		Equipo e = seleccionarEquipo();
		Jugador j = cargarJugador(e,true);
		TIPO_TARJETA tt = cargarTipoTarjeta();
		eventos.add(new Tarjeta(min, e, j, tt));
	}
	
	private void cargarEvento() {
		s.nextLine();
		System.out.println("Ingrese tipo de evento a cargar: G para Gol, T para Tarjeta o C para Cambio");
		String opcion = s.nextLine();
		boolean carga = false;
		while (!carga) {
			switch (opcion) {
			case "G":
				cargarGol();
				carga = true;
				break;
			case "T":
				cargarTarjeta();
				carga = true;
				break;
			case "C":
				cargarCambio();
				carga = true;
				break;
			default:
				System.out.println("Opcion invalida. Ingrese G, T o C");
				opcion = s.nextLine();
				break;
			}
		}
	}
	
	private boolean finalizarPartido() {
		System.out.println("Ingrese F para finalizar el partido o C para continuar");
		String opcion = s.next();
		while(true) {
			switch (opcion) {
			case "F":
				return true;
			case "C":
				return false;
			default:
				System.out.println("Opcion Invalida. Seleccione F o C");
				opcion = s.next();
				break;
			}
		}
	}
	
	private void procesarPartido() {
		String min = cargaMinuto();
		int golLocal = 0;
		int golVisitante = 0;
		eventos.add(new FinPartido(min));
		while(!(eventos.peek() instanceof FinPartido)){
			Evento e = eventos.poll();
			System.out.println(e.toString());
			if(e instanceof Gol) {
				if(e.getEquipo().equals(equipoLocal)) {
					golLocal++;
				} else {
					golVisitante++;
				}
			}
		}
		System.out.println(eventos.poll().toString());
		System.out.println();
		if(golLocal>golVisitante) {
			System.out.println("Gano el equipo local: "+this.equipoLocal.getNombre()+" ["+golLocal+" - "+golVisitante+"]");
		} else if(golVisitante > golLocal) {
			System.out.println("Gano el equipo visitante: "+this.equipoVisitante.getNombre()+" ["+golVisitante+" - "+golLocal+"]");
		} else {
			System.out.println("Empate: ["+golLocal+" - "+golVisitante+"]");
		}
	}
	
}
