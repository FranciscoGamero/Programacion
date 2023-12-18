package repaso_arrays;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam, tam2 = 4, num, pos,contCeros=0, suma = 0;
		String aux;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random(System.nanoTime());
		int hasta, desde;

		// 1.Delcaración de arrays, varias formas

		// a) Dando valores inicialente (a cascaporro) donde no hay que darle un tamaño
		// puesto que es el numero de valores
		int lista[] = { 2, 3, 6 };

		// b) Declarando e instanciando en diferentes lineas

		// Primero se declara (No se puede usar hasta que tenga el tamaño)

		int lista2[];

		// Se pide el tamaño

		System.out.println("Diga el tamaño");
		aux = sc.nextLine();
		tam = Integer.parseInt(aux);

		lista2 = new int[tam]; // Se establece al array tamaño que va a tener.

		// c) Todo en la misma linea, habiendo pedido anteriormente el tamaño

		int lista3[] = new int[tam2];

		// 2. Cargar, rellenar array
		// Varias formas

		// a) Leyendo por teclado

		for (int i = 0; i < lista.length; i++) {
			aux = sc.nextLine();
			num = Integer.parseInt(aux);
			lista[i] = num;
		}
		// b) aleatoriamente
		System.out.println("Introduce desde: ");
		aux = sc.nextLine();
		desde = Integer.parseInt(aux);
		System.out.println("Introduce hasta: ");
		aux = sc.nextLine();
		hasta = Integer.parseInt(aux);
		for (int i = 0; i < lista.length; i++) {
			// Hay que declarar el Random primero para poder usarlo (esta declarado arriba)
			lista[i] = rd.nextInt(hasta - desde + 1) + desde;
		}
		// c) a cascapoora
		int[] lista4 = { 2, 3, 4, 5 };

		// 3 mostrar array

		for (int i = 0; i < lista4.length; i++) {
			System.out.print("  " + lista4[i]);
		}
		// 4 acceso un elemento

		System.out.println("Indique el elemento que desea cambiar");
		aux = sc.nextLine();
		pos = Integer.parseInt(aux) - 1;
		System.out.println("Introduzca el nuevo valor");
		aux = sc.nextLine();
		num = Integer.parseInt(aux);
		lista4[pos] = num;

		// 5 Sumamos elementos

		for (int i = 0; i < lista4.length; i++) {
			suma += lista[i];
		}
		//Operaciones variadas
		
		//Multiplicar los numeros pares por 2
		for (int i = 0; i < lista4.length; i++) {
			
			if(lista[i]%2==0);
				lista4[i]=lista4[i]*2;
		}
		
		//Contar los numeros 0
		for (int i = 0; i < lista4.length; i++) {

			if(lista[i]==0);
				contCeros++;
		}
		
	}

}
