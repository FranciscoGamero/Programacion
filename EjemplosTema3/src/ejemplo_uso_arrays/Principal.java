package ejemplo_uso_arrays;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String aux;
		int desde, hasta,tam;
		int lista[];
		Listas listado=new Listas();
		
		System.out.println("Diga tamaño lista");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		lista= new int [tam];
		System.out.println("Diga desde");
		aux=sc.nextLine();
		desde=Integer.parseInt(aux);
		System.out.println("Diga hasta");
		aux=sc.nextLine();
		hasta=Integer.parseInt(aux);
		
		listado.rellenarArray(desde, hasta, lista);
		
		listado.mostrarArray(lista);
		
		System.out.println();
		
		listado.mostrarArray(listado.trucarLista(lista));
		
		
	}

}
