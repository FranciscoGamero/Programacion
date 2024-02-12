package EjemploMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Principal {

	public static void main(String[] args) {
		
		Map<String, String> lista= new HashMap<String, String>();
		
		//Para guardar todas las claves
		Set<String> listaClaves = lista.keySet();
		//Para guardar todos los valores y hay que poner que tipo es (los<>)
		Collection<String> listaValores = lista.values();
		
		lista.put("Uno", "One");
		//No permite dos claves iguales, pero si si cambia la clave. Reemplaza el valor
		//De la primera clave
		lista.put("Uno", "One");
		lista.put("Uno", "Ten");
		lista.put("Dos", "Two");
		lista.put("Tres", "Three");
		
		System.out.println(lista);
		System.out.println(listaClaves);
		System.out.println(listaValores);
	}

}
