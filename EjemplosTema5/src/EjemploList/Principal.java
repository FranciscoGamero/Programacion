package EjemploList;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// No poner list al nombre para evitar confusiones
		List<String> listado = new ArrayList<String>();
		listado.add("Ángel");
		listado.add("Luismi");

		System.out.println(listado);
		System.out.println(listado.size());
		System.out.println(listado.contains("Luismi"));
		System.out.println(listado.contains("Rafa"));
		listado.remove(1); // Aunque normalmente vamos a borrar con objeto
							// o haciendo un buscar que devuelva el indice y lo borramos
		System.out.println(listado);
		System.out.println(listado.size()); // Da el tamaño en el momento que lo llamo (Cantidad de elemento)

	}

}
