package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux,textoACopiar;
		int numeroVeces;
		Copiado copia;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("*********************************************************************");
		System.out.println("\nBienvenido, vamos a copiar un texto un número determinado de veces");
		System.out.println("\n*********************************************************************");
		
		
		System.out.println("Introduzca el texto a copiar: ");
		textoACopiar=sc.nextLine();
		copia=new Copiado(textoACopiar);
		
		System.out.println("Introduzca el número de veces que se va a copiar: ");
		aux=sc.nextLine();
		numeroVeces=Integer.parseInt(aux);
		
		copia.mostrarTexto(numeroVeces);
		
		System.out.println("*********************************************************************");
		System.out.println("\nGracias por usar nuestro programa");
		System.out.println("\n*********************************************************************");

	}

}
