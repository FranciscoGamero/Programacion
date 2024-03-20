package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion;
		double num1, num2;
		boolean salida = false;
		Sumar suma = new Sumar();
		do {
			try {
				System.out.println("""
						0 - Salir.
						1 - Sumar dos numeros.
						""");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				switch (opcion) {
				case 0:
					salida = true;
					System.out.println("Gracias por usar nuestra calculadora.");
					break;
				case 1:
					System.out.println("Introduzca el primer número: ");
					aux = sc.nextLine();
					num1 = Double.parseDouble(aux);
					System.out.println("Introduzca el segundo número: ");
					aux = sc.nextLine();
					num2 = Double.parseDouble(aux);
					System.out.printf("El resultado es: %.1f\n",suma.sumarNumeros(num1, num2));
					break;
				default:
					System.out.println("Opción no válida.");
					break;
				}
			} catch (MayorQueDiez e) {
				System.out.println(e.getMessage());
			} catch (RuntimeException e) {
				System.out.println("No ha introducido un número.");
			}
		} while (!salida);
	}

}
