package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String aux;
		int opcion, num1;
		double num2,resul;

			do {
				System.out.println("""
						0 - Salir.
						1 - Sumar.
						2 - Restar.
						3 - Multiplicar.
						4 - Dividir.
						5 - Raiz Cuadrada.
						""");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				switch (opcion) {
				case 0:
					System.out.println("Gracias por usar nuestra calculadora.");
					break;
				case 1:
					System.out.println("Inserte el primer número: ");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					System.out.println("Inserte el segundo número: ");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);
					resul = num1 + num2;

					System.out.printf("El resultado de la suma es: %.f",resul);
					break;
				case 2:
					System.out.println("Inserte el primer número: ");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					System.out.println("Inserte el segundo número: ");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);
					resul = num1 - num2;

					System.out.printf("El resultado de la resta es: %.1f",resul);
					break;
				case 3:
					System.out.println("Inserte el primer número: ");
					aux = sc.nextLine();
					num1 = Integer.parseInt(aux);
					System.out.println("Inserte el segundo número: ");
					aux = sc.nextLine();
					num2 = Integer.parseInt(aux);
					resul = num1 * num2;
					
					System.out.printf("El resultado de la multiplicacion es: %.1f",resul);
					break;
				case 4:

					try {

						System.out.println("Inserte el numerador: ");
						aux = sc.nextLine();
						num1 = Integer.parseInt(aux);
						System.out.println("Inserte el denominador: ");
						aux = sc.nextLine();
						num2 = Integer.parseInt(aux);
						resul = num1 / num2;

						System.out.printf("El resultado de la división es: %.1f",resul);

					} catch (ArithmeticException e) {
						System.out.println("Está intentando dividir entre 0");
					}

					break;
				case 5:
					try {
						System.out.println("Inserte el número: ");
						aux = sc.nextLine();
						num1 = Integer.parseInt(aux);
						resul = Math.sqrt(num1);

						System.out.printf("El resultado de la raíz cuadrada es: %.1f",resul);
					} catch (ArithmeticException e) {
						System.out.println("Está intentando hacer la raíz cuadrada de un número negativo");
					}
					break;
					default:
						System.out.println("Opcion no válida.");
						break;
				}
			} while (opcion != 0);
	}

}
