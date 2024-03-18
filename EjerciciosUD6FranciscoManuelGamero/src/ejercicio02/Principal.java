package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws AvisoTemperatura {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion, limiteGrados = -273;
		double grados;
		boolean salida = false;
		do {
			try {
				System.out.println("""
						0 - Salir.
						1 - Sumar.
						""");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				switch (opcion) {
				case 0:
					System.out.println("Gracias por usar nuestra calculadora.");
					break;
				case 1:
					System.out.println("Inserte los grados celsius: ");
					aux = sc.nextLine();
					grados = Double.parseDouble(aux);
					if (grados > limiteGrados) {
						System.out.printf("Serían: %.2f grados Fahrenheit\n", grados * 1.8 + 32);
					} else {
						throw new AvisoTemperatura("No puede haber temperaturas menores a -273 ºC");
					}
					break;
				}
				
				salida=true;
				
			} catch (NumberFormatException e) {
				System.out.println("No está introduciendo un número");
			} catch (AvisoTemperatura e) {
				System.out.println(e.getMessage());
			} catch (RuntimeException e) {
				System.out.println("Error inesperado");
			}
		} while (!salida);
	}

}
