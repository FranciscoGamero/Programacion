package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion;
		double a, b, c;
		boolean salida = false;
		CEcuacion2Grado ecuacion = new CEcuacion2Grado();
		do {
			try {
				System.out.println("""
						0 - Salir.
						1 - Ecuación de segundo grado.
						""");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				switch (opcion) {
				case 0:
					salida = true;
					System.out.println("Gracias por usar nuestra calculadora.");
					break;
				case 1:
					System.out.println("Introduzca A: ");
					aux=sc.nextLine();
					a=Double.parseDouble(aux);
					System.out.println("Introduzca B: ");
					aux=sc.nextLine();
					b=Double.parseDouble(aux);
					System.out.println("Introduzca C: ");
					aux=sc.nextLine();
					c=Double.parseDouble(aux);
					ecuacion.calcularEcuacion(a, b, c);
					break;
				default:
					System.out.println("Opción no válida.");
					break;
				}
			} catch (DiscriminanteNegativo e) {
				System.out.println(e.getMessage());
			} catch(EcuacionDegenerada e) {
				System.out.println(e.getMessage());
			} catch (RuntimeException e) {
				System.out.println("No ha introducido un número.");
			}
			
		} while (!salida);
	}

}
