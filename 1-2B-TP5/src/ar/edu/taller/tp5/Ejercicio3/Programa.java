package ar.edu.taller.tp5.Ejercicio3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Programa {
	
	private Scanner scanner;
	private Stack<String> memoria;
	private Stack<String> procesamiento;
	private Queue<String> programa;
	
	public Programa() {
		this.memoria = new Stack<String>();
		this.procesamiento = new Stack<String>();
		this.programa = new LinkedList<String>();
		this.scanner = new Scanner(System.in);
	}
	
	public void ejecutarPrograma() {
		mensajeIntruccion();
		String inst = scanner.nextLine();
		while(!inst.equals("FIN")) {
			if(inst.equals("DESHACER")) {
				memoria.pop();
			} else {
				memoria.push(inst);
			}
			mensajeIntruccion();
			inst = scanner.nextLine();
		}
		memoria.push(inst);
		procesarPrograma();
		mostrarPrograma();
		
	}
	
	private void mostrarPrograma() {
		while(!procesamiento.peek().equals("FIN")) {
			String inst = procesamiento.pop();
			System.out.println(inst);
			programa.add(inst);
		}
	}
	
	private void procesarPrograma() {
		while(!memoria.isEmpty()) {
			String inst = memoria.pop();
			procesamiento.push(inst);
		}
	}
	
	private void mensajeIntruccion() {
		System.out.println("Cargue una instruccion");
		System.out.println("o escriba 'DESHACER' para deshacer la ultima instruccion guardada");
		System.out.println("o escriba 'FIN' para finalizar.");
	}

}
