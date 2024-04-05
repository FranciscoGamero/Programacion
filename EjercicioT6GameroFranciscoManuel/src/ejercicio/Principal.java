package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		int anioAntiguedad, opcion;
		boolean salir=false;
		Coche c1 = new Coche("11","Francisco",-19.3,6);
		Coche c2 = new Coche("ABC9382", "Candi", 60.7, 5);
		Taller gestor = new Taller();
		do {
			try{
			System.out.println("""
					0 - Salir.
					1 - Comprobar garantia de los coches.
					2 - Comprobar precio arreglo.
					3 - Comprobar matrícula.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion) {
			case 0: 
				System.out.println("Gracias por usar nuestro programa.");
				break;
			case 1:
				System.out.println("Introduzca los años de antigüedad del coche: ");
				aux= sc.nextLine();
				anioAntiguedad=Integer.parseInt(aux);
				gestor.comprobarGarantia(c1, anioAntiguedad);
				gestor.comprobarGarantia(c2, anioAntiguedad);
				break;
			case 2:
				
				gestor.comprobarPrecioArreglo(c1);
				gestor.comprobarPrecioArreglo(c2);
				break;
			case 3:
				gestor.comprobarMatricula(c2);
				break;
			default:
					System.out.println("Opción no válida");
					break;
			}
			} catch(GarantiaPasada e) {
				System.out.println(e.getMessage());
			} catch(PrecioArregloNegativo e) {
				System.out.println(e.getMessage());
			} catch(MatriculaErronea e) {
				System.out.println(e.getMessage());
			//Este sería el genérico, el de los numeros es con NumberFormatException
			} catch(RuntimeException e) {
				System.out.println("No ha introducido un número.");
			}
		} while(!salir);
		sc.close();
	}

}
