package ar.edu.ort.taller1.tp2.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Electrodomestico> inventario = new ArrayList<Electrodomestico>();
		
		Electrodomestico heladera1 = new Heladera("Whirlpool",
				"H2745", "WH2745-0001", "220", "apagado", 14999,
				"250", "no frost");
		Electrodomestico tv1 = new Televisor("Philips", "49PGFS",
				"PTV49GFS-0001", "220", "apagado", 14370, "49", "Smart");
		Electrodomestico lavarropa1 = new Lavarropa("Dream", "CONCEPT 5.05", 
				"LRDC6K-0001", "220", "apagado", 6799, "6Kg", "Semi Automatico");
		Electrodomestico licuadora1 = new Licuadora("Oster", "Plus 4V", 
				"LCOP4V-0001", "220", "apagado", 2000, "40W", "4");
		Electrodomestico heladera2 = new Heladera("LG",
				"LG1234", "LG1234-0001", "220", "apagado", 12999,
				"200", "frost");
		Electrodomestico tv2 = new Televisor("Sony", "50PG4K",
				"STV504K-0001", "220", "apagado", 20000, "50", "Smart");
		Electrodomestico lavarropa2 = new Lavarropa("LG", "ACME 1.01", 
				"LGACME1.01-0001", "220", "apagado", 11999, "9Kg", "Automatico");
		Electrodomestico licuadora2 = new Licuadora("TopHouse", "TP2V", 
				"TP2V-0001", "220", "apagado", 1000, "20W", "2");
		
		inventario.add(heladera1);
		inventario.add(heladera2);
		inventario.add(tv1);
		inventario.add(tv2);
		inventario.add(lavarropa1);
		inventario.add(lavarropa2);
		inventario.add(licuadora1);
		inventario.add(licuadora2);
		
		ArrayList<Electrodomestico> itemsVendidos = new ArrayList<Electrodomestico>();
		
		//Programa
		int option = validarOpcion();
		
		while(option!=0) {
			ArrayList<Electrodomestico> productos = new ArrayList<Electrodomestico>();
			switch (option) {
			case 1:
				System.out.println("** Televisores **");
				productos = getProductosTipo(inventario, option);
				mostrarInfo(productos);
				break;
			case 2:
				System.out.println("** Heladeras **");
				productos = getProductosTipo(inventario, option);
				mostrarInfo(productos);
				break;
			case 3:
				System.out.println("** Lavarropas **");
				productos = getProductosTipo(inventario, option);
				mostrarInfo(productos);
				break;
			default:
				System.out.println("** Licuadoras **");
				productos = getProductosTipo(inventario, option);
				mostrarInfo(productos);
				break;
			}
			
			System.out.println("Escriba la marca que desea comprar o escriba 'Menu' para volver al menu Principal");
			String marca = input.next();
			
			if (!marca.equals("Menu")) {
				Electrodomestico item = getProducto(productos, option, marca);
				switch (option) {
				case 1:
					Televisor itemTv = (Televisor) item;
					itemTv.toString();
					break;
				case 2:
					Heladera itemHeladera = (Heladera) item;
					itemHeladera.toString();
					break;
				case 3:
					Lavarropa itemLavarropa = (Lavarropa) item;
					itemLavarropa.toString();
					break;
				default:
					Licuadora itemLicuadora = (Licuadora) item;
					itemLicuadora.toString();
					break;
				}
				itemsVendidos.add(item);
			}
			System.out.println();
			option = validarOpcion();
		}
		
		if (itemsVendidos.size()==0) {
			System.out.println("No se escogieron productos para comprar");
		} else {
			mostrarTicket(itemsVendidos);
		}

	}
	
	private static void mostrarTicket(ArrayList<Electrodomestico> itemsVendidos) {
		float total = 0;
		System.out.println();
		System.out.println("Ticket de Venta");
		for (Electrodomestico item : itemsVendidos) {
			System.out.println(item.getTicketInfo());
			total += item.getPrecio();
		}
		System.out.println("Total: $"+total);
	}

	private static void mostrarInfo(ArrayList<Electrodomestico> productos) {
		for (Electrodomestico producto : productos) {
			System.out.println(producto.getInfo());
		}
	}

	private static Electrodomestico getProducto (ArrayList<Electrodomestico> inventario, int option, String marca) {
		ArrayList<Electrodomestico> items = getProductosTipo(inventario, option);
		boolean result = true;
		while(result) {
			for (Electrodomestico item : items) {
				if(item.getMarca().equals(marca)) {
					return item;
				} 
			}
			System.out.println("No hay ningun producto con esa Marca, verifique de nuevo");
			System.out.println("Escriba la marca que desea comprar correctamente");
			marca = input.next();
		}
		return null;
	}

	private static int validarOpcion() {
		System.out.println("Seleccione un tipo de producto: '1' para 'TV', "
				+ "'2' para 'Heladera', '3' para 'Lavarropa', '4' para 'Licuadora' o '0' para 'Finalizar'");
		int option = input.nextInt();
		while (option < 0 || option >4) {
			System.out.println("Ingrese una opcion valida");
			option = input.nextInt();
		}
		return option;
	}
	
	private static ArrayList<Electrodomestico> getProductosTipo(ArrayList<Electrodomestico> inventario, int prod) {
		ArrayList<Electrodomestico> productosMostrados = new ArrayList<Electrodomestico>();
		
		switch (prod) {
		case 1:
			for (Electrodomestico electrodomestico : inventario) {
				if (electrodomestico instanceof Televisor) {
					productosMostrados.add(electrodomestico);
				}
			}
			break;
		case 2:
			for (Electrodomestico electrodomestico : inventario) {
				if (electrodomestico instanceof Heladera) {
					productosMostrados.add(electrodomestico);
				}
			}
			break;
		case 3:
			for (Electrodomestico electrodomestico : inventario) {
				if (electrodomestico instanceof Lavarropa) {
					productosMostrados.add(electrodomestico);
				}
			}
			break;
		default:
			for (Electrodomestico electrodomestico : inventario) {
				if (electrodomestico instanceof Licuadora) {
					productosMostrados.add(electrodomestico);
				}
			}
			break;
		}
		return productosMostrados;

	}

}
