package excepciones2;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion, mes, dia, anio;
		GestionReserva ges = new GestionReserva();
		// Excepcion donde si reservas el dia de ayer no te deje
		LocalDate fecha;
		boolean salir = false;
		do {
			try {
				System.out.println("""
						0 - Salir.
						1 - Realizar reserva
						""");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				switch (opcion) {
				case 0:
					salir = true;
					System.out.println("Gracias por usar nuestro gestor de reservas.");
					break;
				case 1:
					System.out.println("Inserte el mes");
					aux = sc.nextLine();
					mes = Integer.parseInt(aux);
					System.out.println("Inserte el dia");
					aux = sc.nextLine();
					dia = Integer.parseInt(aux);
					System.out.println("Inserte el año");
					aux = sc.nextLine();
					anio = Integer.parseInt(aux);
					fecha = LocalDate.of(anio,mes,dia);
					ges.generarReserva(fecha);
					break;
				default:
					System.out.println("Opción no válida.");
					break;
				}
			} catch (ReservaPasada rp) {
				System.out.println(rp.getMessage());
			}catch (RuntimeException e) {
				System.out.println("No ha insertado una fecha");
			}
		} while (!salir);
		
		// "2002-02-11"
	}

}
