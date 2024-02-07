package ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion, decimo;
		Sorteo sor1 = new Sorteo();

		System.out.println("----------------------------------------");
		System.out.println("Bienvenido a la Lotería de Navidad");
		System.out.println("----------------------------------------\n");

		sor1.generarGanador();
		do {
			System.out.println("*************************************************\n");
			System.out.println("Pulse 1 para elegir un décimo.");
			System.out.println("");
			System.out.println("Pulse 2 para elegir un décimo automáticamente.");
			System.out.println("");
			System.out.println("Pulse 3 para mostrar el resultado.");
			System.out.println("");
			System.out.println("Pulse 0 para salir.");
			System.out.println("\n*************************************************");

			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				System.out.println("Introduzca el décimo que desea escoger: ");
				// comprobar si el numero elegido es válido o no (hacer un método en Sorteo para hacerlo)
				aux = sc.nextLine();
				decimo = Integer.parseInt(aux);
				sor1.comprarDecimoElegido(decimo);
				break;
			case 2:
				decimo = sor1.comprarDecimoAutomatico();
				System.out.println("Su décimo es: " + decimo);
				break;
			case 3:
				if (sor1.comprobarDecimo(sor1.getElegido())) {
					System.out.println("¡¡HAS GANADO LA LOTERIA DE NAVIDAD!!");
				} else {
					System.out.println("Tu decimo no ha sido premiado.");
				}
				break;
			case 0:
				System.out.println("Gracias por usar nuestra lotería");
				break;
			}
		} while (opcion != 0);
	}

}
