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
		/*ges.mostrarLista(ges.getLista());
		System.out.println("\n\n\n  ");
		ges.mostrarLista(ges.ordenarAlfabeticamente());*/
		
		/*
		ges.mostrarLista(ges.buscarPalabra("Coche"));
		ges.mostrarLista(ges.buscarPalabra("sñlkdjklj"));
		*/
		System.out.println(ges.primerLetra("Coche"));
		
		}
}
