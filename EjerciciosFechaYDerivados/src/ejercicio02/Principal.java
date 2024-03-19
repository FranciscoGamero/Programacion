package ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Palabra> lista = new ArrayList<>();
		lista.add(new Palabra("Coche"));
		lista.add(new Palabra("Gato"));
		lista.add(new Palabra("Árbol"));
		lista.add(new Palabra("Electrodomestico"));
		lista.add(new Palabra("Dromedario"));
		lista.add(new Palabra("Puente"));
		lista.add(new Palabra("Lagarto"));
		lista.add(new Palabra("Zamora"));
		
		ListaPalabras ges = new ListaPalabras(lista);
		ges.mostrarLista(ges.getLista());
		
		System.out.println("ORDENAR ALFABETICAMENTE ORDENAR ALFABETICAMENTE ORDENAR ALFABETICAMENTE ORDENAR ALFABETICAMENTE");
		ges.mostrarLista(ges.ordenarAlfabeticamente());
		
		System.out.println("ORDENAR ALFABETICAMENTE ORDENAR ALFABETICAMENTE ORDENAR ALFABETICAMENTE ORDENAR ALFABETICAMENTE\n\n");

		System.out.println("BUSCAR UNA PALABRA BUSCAR UNA PALABRA BUSCAR UNA PALABRA BUSCAR UNA PALABRA BUSCAR UNA PALABRA");
		ges.mostrarLista(ges.buscarPalabra("Coche"));
		ges.mostrarLista(ges.buscarPalabra("sñlkdjklj"));
		
		System.out.println("BUSCAR UNA PALABRA BUSCAR UNA PALABRA BUSCAR UNA PALABRA BUSCAR UNA PALABRA BUSCAR UNA PALABRA\n\n");

		System.out.println("CREAR PALABRA CREAR PALABRA CREAR PALABRA CREAR PALABRA CREAR PALABRA CREAR PALABRA CREAR PALABRA ");
		lista.add(new Palabra(ges.crearPalabra()));
		ges.mostrarLista(ges.getLista());

		System.out.println("CREAR PALABRA CREAR PALABRA CREAR PALABRA CREAR PALABRA CREAR PALABRA CREAR PALABRA CREAR PALABRA\n\n");
		
		System.out.println("ELIMINAR IMPARES ELIMINAR IMPARES ELIMINAR IMPARES ELIMINAR IMPARES ELIMINAR IMPARES ELIMINAR IMPARES ");
		ges.borrarImpares();
		ges.mostrarLista(ges.getLista());
	
		System.out.println("ELIMINAR IMPARES ELIMINAR IMPARES ELIMINAR IMPARES ELIMINAR IMPARES ELIMINAR IMPARES ELIMINAR IMPARES\n\n");
		
		System.out.println("PASAR A MAYUSCULAS PASAR A MAYUSCULAS PASAR A MAYUSCULAS PASAR A MAYUSCULAS PASAR A MAYUSCULAS PASAR A MAYUSCULAS");
		
		ges.pasarAMayusculas();
		ges.mostrarLista(ges.getLista());
		
		System.out.println("PASAR A MAYUSCULAS PASAR A MAYUSCULAS PASAR A MAYUSCULAS PASAR A MAYUSCULAS PASAR A MAYUSCULAS PASAR A MAYUSCULAS\n\n");
		}
}
