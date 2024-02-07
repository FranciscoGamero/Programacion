package ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String aux;
		int eleccion, opcion;
		boolean resul;
		CaraOCruz juego = new CaraOCruz();
		
		System.out.println("******************************************");
		System.out.println("Bienvenido, vamos jugar al cara o cruz");
		System.out.println("******************************************\n");
		
		System.out.println("Pulse 1 para elegir cara.");
		System.out.println("|||||||||||||||||||||||||||||");
		System.out.println("Pulse 2 para elegir cruz.");
		aux = sc.nextLine();
		eleccion = Integer.parseInt(aux);

		resul = juego.comprobarMoneda(juego.lanzarMoneda(), eleccion);

		juego.mostrarGanador(resul);
		
		do {
			System.out.println("Pulse 1 para jugar.");
			System.out.println("|||||||||||||||||||||||||||||");
			System.out.println("Pulse 0 para salir.");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 1:
				System.out.println("Pulse 1 para elegir cara.");
				System.out.println("|||||||||||||||||||||||||||||");
				System.out.println("Pulse 2 para elegir cruz.");
				aux = sc.nextLine();
				eleccion = Integer.parseInt(aux);

				resul = juego.comprobarMoneda(juego.lanzarMoneda(), eleccion);

				juego.mostrarGanador(resul);
				break;
			case 0:
				System.out.println("--------------------------------------");
				System.out.println("Gracias por usar nuestro programa ^^");
				System.out.println("--------------------------------------");
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 0);

	}

}
