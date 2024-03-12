package ejercicio04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Festival> lista = new ArrayList<>();
		int opcion, id = 2, cantidadArtistas,buscar;
		LocalDate fechaInicio, fechaFin;
		LocalTime horaInicio, horaFin;
		double precioFestival;
		String aux, nombreFestival;
		GestionEventos gestor = new GestionEventos(lista);

		System.out.println("----------------------------------------------");
		System.out.println("Bienvenido al gestor de equipos de futbol");
		System.out.println("----------------------------------------------");
		
		lista.add(new Festival("Rock Fest", 0, LocalDate.of(2024, 6, 15),
                LocalDate.of(2024, 6, 17), LocalTime.of(16, 0), LocalTime.of(22, 0),
                15, 75.0));
		lista.add(new Festival("Electronic Beats", 1, LocalDate.of(2024, 8, 8),
                LocalDate.of(2024, 8, 8), LocalTime.of(20, 0), LocalTime.of(2, 0),
                20, 120.0));
		
		do {
			System.out.println("""
					\n0 - Salir.
					1 - Agregar un evento.
					2 - Buscar un evento.
					3 - Mostrar todos los eventos.
					4 - Modificar la cantidad de artistas de un evento.
					5 - Mostrar los festivales que duren mas de un dia.
					6 - Ordenar por fecha de inicio.
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 0:
				System.out.println("Gracias por usar nuestro programa");
				break;
			case 1:
				System.out.println("Introduzca el nombre del Festival: ");
				nombreFestival = sc.nextLine();
				System.out.println("Introduzca la fecha de inicio: ");
				aux = sc.nextLine();
				fechaInicio = LocalDate.parse(aux);

				System.out.println("Introduzca la fecha de fin: ");
				aux = sc.nextLine();
				fechaFin = LocalDate.parse(aux);

				System.out.println("Introduzca la hora de inicio: ");
				aux = sc.nextLine();
				horaInicio = LocalTime.parse(aux);

				System.out.println("Introduzca la hora de fin: ");
				aux = sc.nextLine();
				horaFin = LocalTime.parse(aux);

				System.out.println("Introduzca la cantidad de artistas: ");
				aux = sc.nextLine();
				cantidadArtistas = Integer.parseInt(aux);
				System.out.println("Introduzca el precio: ");
				aux = sc.nextLine();
				precioFestival = Double.parseDouble(aux);
				gestor.agregarFestival(new Festival(nombreFestival, id, fechaInicio, fechaFin, horaInicio, horaFin,
						cantidadArtistas, precioFestival));
				id++;
				break;
			case 2:
				System.out.println("Introduzca el id del evento: ");
				aux=sc.nextLine();
				buscar=Integer.parseInt(aux);
				gestor.mostrarHorarioFestival(gestor.buscarPorId(buscar));
				break;
			case 3:
				gestor.mostrarLista(gestor.getLista());
				break;
			case 4:
				System.out.println("Introduzca el id del evento: ");
				aux=sc.nextLine();
				buscar=Integer.parseInt(aux);
				System.out.println("Introduzca la nueva cantidad de artistas: ");
				aux=sc.nextLine();
				cantidadArtistas=Integer.parseInt(aux);
				gestor.modificarArtistas(gestor.buscarPorId(buscar), cantidadArtistas);
				break;
			case 5:
				gestor.mostrarLista(gestor.duracionMasDeUnDia());
				break;
			case 6:
				gestor.ordenarPorFecha();
				gestor.mostrarLista(gestor.getLista());
			}
		} while (opcion != 0);
	}
}
