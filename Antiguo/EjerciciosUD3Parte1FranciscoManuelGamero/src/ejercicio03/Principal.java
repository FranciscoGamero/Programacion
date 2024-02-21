package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux;
		int num,num2;
		boolean resul;
		Operaciones numero=new Operaciones();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("*********************************************************************");
		System.out.println("\nBienvenido, vamos a comprobar el signo de un número y si es par o impar");
		System.out.println("\n*********************************************************************");

		System.out.println("Introduzca el número: ");
		aux=sc.nextLine();
		num=Integer.parseInt(aux);
		
		resul=numero.comprobarSigno(num);
		numero.mostrarSigno(resul);
		
		resul=numero.comprobarPar(num);
		numero.mostrarPar(resul);
		
		System.out.println("*********************************************************************");
		System.out.println("\nGracias por usar nuestro programa");
		System.out.println("\n*********************************************************************");
	}

}