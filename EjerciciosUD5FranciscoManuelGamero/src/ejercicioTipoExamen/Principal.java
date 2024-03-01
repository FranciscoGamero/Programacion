package ejercicioTipoExamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int opcion, id = 0;
		String aux, nombre, significado;
		Palabra p;
		List<Palabra> lista = new ArrayList<>();

		Diccionario di = new Diccionario(lista);
		di.agregarPalabra(new Palabra(id, "Give", "Dar"));
		id++;
		di.agregarPalabra(new Palabra(id, "Ammo", "Municion"));
		id++;
		di.agregarPalabra(new Palabra(id, "Park", "Parque"));
		id++;
		di.agregarPalabra(new Palabra(id, "For", "Por"));
		id++;

		System.out.println("-".repeat(50));
		System.out.println("Bienvenido al Diccionario de inglés");
		System.out.println("-".repeat(50));
		System.out.println("");
		do {
			System.out.println("""
					0 - Salir.
					1 - Agregar una palabra al diccionario.
					2 - Imprimir todas las palabras del diccionario.
					3 - Buscar una palabra concreta.
					4 - Modificar el significado de una palabra.
					5 - Ordenar la lista de forma alfabética descendente. Ordenar y mostrar
					6 - Eliminar una palabra.
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 0:
				System.out.println("Gracias por usar el diccionario");
				break;
			case 1:
				System.out.println("Inserte el nombre de la palabra en inglés: ");
				nombre = sc.nextLine();
				System.out.println("Inserte el significado de la palabra en español: ");
				significado = sc.nextLine();
				di.getListaPalabras().add(new Palabra(id, nombre, significado));
				id++;
				break;
			case 2:
				di.mostrarPalabras();
				break;
			case 3:
				System.out.println("Inserte el nombre de la palabra: ");
				nombre = sc.nextLine();
				di.mostrarPalabra(di.buscarSignificado(nombre));
				break;
			case 4:
				System.out.println("Inserte el nombre de la palabra en inglés: ");
				nombre = sc.nextLine();
				System.out.println("Inserte el nuevo significado de la palabra: ");
				significado = sc.nextLine();
				di.modificarSignificado(nombre, significado);
				break;
			case 5:
				Collections.sort(di.getListaPalabras(), new ComparaPorNombre());
				di.mostrarPalabras();
				break;
			case 6:
				System.out.println("Inserte el nombre de la palabra en inglés: ");
				nombre = sc.nextLine();
				di.borrarPalabra(nombre);
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		} while (opcion != 0);
	}

}
