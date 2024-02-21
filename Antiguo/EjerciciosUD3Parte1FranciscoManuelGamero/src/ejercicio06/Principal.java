package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String aux;
		Generadora quiniela = new Generadora();
		Generadora parOImpar = new Generadora();
		Generadora juegoChinos = new Generadora();
		Generadora primitiva = new Generadora();
		int num, eleccion, opcion,numMonedas;
		int desdeP=1, hastaP=49,numP=6;
		boolean resul;
		System.out.println("Bienvenido al programa generador");
		
		do {
			System.out.println("\n-------------------------------------");
			System.out.println("Pulse 1 para jugar a la quiniela.");
			System.out.println("-------------------------------------");
			System.out.println("Pulse 2 para jugar a pares o nones.");
			System.out.println("-------------------------------------");
			System.out.println("Pulse 3 para jugar a 'los chinos'.");
			System.out.println("-------------------------------------");
			System.out.println("Pulse 4 para jugar a la primitiva.");
			System.out.println("-------------------------------------");
			System.out.println("Pulse 0 para salir.");

			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 1:
				System.out.println("Introduzca 1 si desea elegir el equipo A");
				System.out.println("Introduzca 2 si desea elegir empate");
				System.out.println("Introduzca 3 si desea elegir al equipo B");
				aux = sc.nextLine();
				num = Integer.parseInt(aux);
				resul=quiniela.comprobarQuiniela(quiniela.generarQuiniela(), num);
				quiniela.mostrarQuiniela(resul);
				break;
			case 2:
				 System.out.println("Introduzca su número:"); aux=sc.nextLine();
				 
				 num=Integer.parseInt(aux);
				 
				 System.out.println("Introduzca 1 si desea elegir impar");
				 System.out.println("Introduzca 2 si desea elegir par"); 
				 aux=sc.nextLine();
				 
				 eleccion=Integer.parseInt(aux); 
				 parOImpar.generarParesONones(num);
				 resul=parOImpar.comprobarParesONones(eleccion, parOImpar.generarParesONones(num), num);
				 parOImpar.mostrarParesONones(resul);
				

				 break;
			case 3:
				 System.out.println("Introduzca un número de 0 al 3 de las monedas que quieres enseñar: "); 
				 aux=sc.nextLine(); 
				 num=Integer.parseInt(aux); 
				 
				 System.out.println("Introduzca cuantas monedas cree que va a haber en total: ");
				 aux=sc.nextLine(); eleccion=Integer.parseInt(aux);
				 numMonedas=Integer.parseInt(aux);
				 resul=juegoChinos.comprobarJuegoChinos(juegoChinos.generarJuegoChinos(), num, numMonedas);
				 juegoChinos.mostrarJuegoChinos(resul);
				  break;
			case 4:
				for (int i = 0; i < numP; i++) {
					System.out.print(" "+primitiva.generarNum(desdeP,hastaP)); 
				}
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
