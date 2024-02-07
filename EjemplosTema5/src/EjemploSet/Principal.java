package EjemploSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		Set<String> lista = new HashSet<String>();

		lista.add("Uno");
		lista.add("Dos");
		lista.add("Uno");
		lista.add("Tres");
		lista.add("Catorce");

		System.out.println(lista);

		lista.remove("Tres");

		System.out.println(lista);

		System.out.println(lista.contains("Uno"));
		System.out.println(lista.contains("uno"));

	}

}
