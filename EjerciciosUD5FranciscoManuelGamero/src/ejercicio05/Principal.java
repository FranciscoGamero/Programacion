package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Persona> lista = new ArrayList<>();
		
		lista.add(new Persona("Candi", "Alcantarilla", "123456789p",22));
		lista.add(new Persona("Pedro", "Barco", "987654321ñ",15));
		lista.add(new Persona("Tomas", "Pérez", "13592563h",26));
		lista.add(new Persona("Marco", "Zarzosa", "92648125a",40));
		lista.add(new Persona("Dario", "Vila", "01783566m",19));
		
		System.out.println("---------------- SIN ORDENAR ----------------");
		for(Persona p : lista) { //Sin ordenar
			System.out.println(p);
		}
		System.out.println("---------------- SIN ORDENAR ----------------\n");
		System.out.println("---------------- POR EDAD ----------------");
		Collections.sort(lista); //Ordenado por edad
		for(Persona p : lista) {
			System.out.println(p);
		}
		System.out.println("---------------- POR EDAD ----------------\n");
		System.out.println("---------------- POR NOMBRE ----------------");
		Collections.sort(lista, new ComparaPorNombre()); //Ordenado por nombre alfabeticamente
		for(Persona p : lista) {
			System.out.println(p);
		}
		System.out.println("---------------- POR NOMBRE ----------------");
		
	}

}
