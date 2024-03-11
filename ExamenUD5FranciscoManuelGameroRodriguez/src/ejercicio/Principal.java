package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Jugador> lista = new ArrayList<>();
		int opcion, numCamiseta;
		String aux, nuevaPosicion, nombreEquipo;
		Equipo e;

		// Se agregan algunos jugadores a modo de prueba
		lista.add(new Jugador("Pedro", "Delantero", 11, 9, true));
		lista.add(new Jugador("Alejandro", "Portero", 20, 0, false));
		lista.add(new Jugador("Marco", "Medio", 29, 5, true));
		lista.add(new Jugador("Tomás", "Defensa", 1, 2, false));
		lista.add(new Jugador("Dario", "Portero", 33, 0, true));

		System.out.println("----------------------------------------------");
		System.out.println("Bienvenido al gestor de equipos de futbol");
		System.out.println("----------------------------------------------");

		System.out.println("Introduzca el nombre del equipo:");
		nombreEquipo = sc.nextLine();
		e = new Equipo(lista, nombreEquipo);

		do {
			System.out.println("""
					\n0 - Salir.
					1 - Mostrar todos los jugadores que no han marcado gol.
					2 - Buscar un jugador.
					3 - Calcular la media de goles del equipo.
					4 - Modificar la posición de un jugador.
					5 - Mostrar todo el equipo.
					6 - Ordenar por posición de juego.
					7 - Ordenar por cantidad de goles marcado (de mayor a menor).
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 0:
				System.out.println("Gracias por usar nuestro programa.");
				break;

			case 1:
				e.mostrarLista(e.buscarCeroGoles());
				break;

			case 2:
				System.out.println("Introduzca el número de camiseta del jugador: ");
				aux = sc.nextLine();
				numCamiseta = Integer.parseInt(aux);
				e.mostrarJugador(e.buscarPorCamiseta(numCamiseta));
				break;

			case 3:
				System.out.printf("La media de goles de todo el equipo es de: %.2f goles", e.calcularMediaGoles());
				break;

			case 4:
				System.out.println("Introduzca el número de camiseta del jugador: ");
				aux = sc.nextLine();
				numCamiseta = Integer.parseInt(aux);

				System.out.println("Introduzca la nueva posición del jugador: ");
				nuevaPosicion = sc.nextLine();
				e.modificarPosicion(numCamiseta, nuevaPosicion);
				break;

			case 5:
				e.mostrarLista(lista);
				break;

			case 6:
				e.ordenarPorPosicion();
				e.mostrarLista(lista);
				break;

			case 7:
				e.ordenarPorGoles();
				e.mostrarLista(lista);
				break;

			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 0);
	}

}
