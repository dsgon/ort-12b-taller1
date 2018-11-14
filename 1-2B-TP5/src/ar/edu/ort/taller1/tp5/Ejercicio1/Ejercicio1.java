package ar.edu.ort.taller1.tp5.Ejercicio1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ejercicio1 {

	public static void main(String[] args) {
		Queue<String> cola = new LinkedList<String>();
		
		// Este programa esta balanceado
		cola.add("public");
		cola.add("class");
		cola.add("Ejercicio1");
		cola.add("{");
		cola.add("public");
		cola.add("static");
		cola.add("void");
		cola.add("main");
		cola.add("(");
		cola.add("String");
		cola.add("[");
		cola.add("]");
		cola.add("args");
		cola.add(")");
		cola.add("{");
		cola.add("}");
		cola.add("}");
		
		if(isBalanced(cola)) {
			System.out.println("El codigo esta balanceado");
		} else {
			System.out.println("El codigo NO esta balanceado");
		}
		
	}
	
	private static boolean isBalanced(Queue<String> cola) {
		String instruccion;
		Stack<String> pila = new Stack<String>();;
		while (!cola.isEmpty()){
			instruccion = cola.poll();
			if(isOpened(instruccion)) {
				pila.add(instruccion);
			} else if(isClosed(instruccion)) {
				if(!pila.isEmpty()) {
					String auxIn = pila.pop();
					if(!compareInOut(auxIn,instruccion)) {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		if (!pila.isEmpty())
			return false;
		return true;
	}
	
	private static boolean isOpened(String value) {
		switch (value) {
		case "{": case "[": case "(":
			return true;
		default:
			return false;
		}
	}
	
	private static boolean isClosed(String value) {
		switch (value) {
		case "}": case "]": case ")":
			return true;
		default:
			return false;
		}
	}
	
	private static boolean compareInOut(String in, String out) {
		switch (in) {
		case "{":
			return out.equals("}");
		case "[":
			return out.equals("]");
		case "(":
			return out.equals(")");
		default:
			return false;
		}
	}
}

