package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux, nombre;
		int opcion;
		double saldo, cambios, valorDolares;
		Scanner sc = new Scanner(System.in);
		CuentaCorriente cc1;

		System.out.println("----------------------------------");
		System.out.println("Bienvenido al cajero automatico");
		System.out.println("----------------------------------\n");

		System.out.println("Introduzca el nombre del titular: ");
		nombre = sc.nextLine();

		System.out.println("Introduzca el saldo de la cuenta:");
		aux = sc.nextLine();
		saldo = Integer.parseInt(aux);

		cc1 = new CuentaCorriente(saldo, nombre);
		do {
			System.out.println("\n**********************************");
			System.out.println("Pulse 1 para ver el saldo actual.");
			System.out.println("");
			System.out.println("Pulse 2 para ingresar dinero.");
			System.out.println("");
			System.out.println("Pulse 3 para retirar dinero.");
			System.out.println("");
			System.out.println("Pulse 4 para cambiar a dólares.");
			System.out.println("");
			System.out.println("Pulse 0 para ver salir.");
			System.out.println("");
			System.out.println("**********************************");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 1:
				cc1.mostrarSaldo();
				break;
			case 2:
				System.out.println("Introduzca cuanto desea ingresar: ");
				aux = sc.nextLine();
				cambios = Double.parseDouble(aux);
				cc1.ingresarSaldo(cambios);
				break;
			case 3:
				do  {
					System.out.println("Introduzca cuanto desea retirar: ");
					aux = sc.nextLine();
					cambios = Double.parseDouble(aux);
					if (cc1.getSaldo() < cambios) {
						System.out.println( "No se puede realizar la operación, ha insertado una cantidad más alta que su saldo actual.\n");
					} else {
						cc1.retirarSaldo(cambios);
					}
				} while (cc1.getSaldo() < cambios);
				break;
			case 4:
				System.out.println("Introduzca el valor del cambio: ");
				aux = sc.nextLine();
				valorDolares = Double.parseDouble(aux);
				cc1.pasarADolares(valorDolares);
				System.out.printf("Su saldo en dólares sería: %.2f $", cc1.pasarADolares(valorDolares));
				break;
			case 0:
				System.out.println("Gracias por usar nuestro cajero.");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		} while (opcion != 0);
	}

}
