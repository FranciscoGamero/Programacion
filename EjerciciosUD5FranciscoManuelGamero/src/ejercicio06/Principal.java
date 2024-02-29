package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ejercicio05.Persona;



public class Principal {

	public static void main(String[] args) {
		
		List<Trabajador> lista = new ArrayList<>();
		
		lista.add(new Trabajador("Candi","123456789p",22,10));
		lista.add(new Trabajador("Pedro","987654321ñ",15,14.2));
		lista.add(new Trabajador("Pedro","987654321i",20,18));
		lista.add(new Trabajador("Tomas","13592563h",26,8.2));
		lista.add(new Trabajador("Marco","92648125a",40,1));
		lista.add(new Trabajador("Dario","01783566m",19,7.3));
		
		System.out.println("---------------- SIN ORDENAR ----------------");
		for(Trabajador t : lista) { //Sin ordenar
			System.out.println(t);
		}
		System.out.println("---------------- SIN ORDENAR ----------------\n");
		System.out.println("---------------- POR SALARIO ----------------");
		Collections.sort(lista); //Ordenado por nombre
		for(Trabajador t : lista) {
			System.out.println(t);
		}
		System.out.println("---------------- POR SALARIO ----------------\n");
		System.out.println("---------------- POR HORAS TRABAJADAS ----------------");
		Collections.sort(lista, new ComparaPorHoras()); //Ordenado por horas trabajadas
		for(Trabajador t : lista) {
			System.out.println(t);
		}
		System.out.println("---------------- POR HORAS TRABAJADAS ----------------");
		//Ordenar por orden alfabetico y despues de mayor a menor
		System.out.println("---------------- POR NOMBRE Y HORAS TRABAJADAS ----------------");
		Collections.sort(lista, new ComparaPorNombreYHoras()); //Ordenado por nombre y salario
		for(Trabajador t : lista) {
			System.out.println(t);
		}
		System.out.println("---------------- POR NOMBRE Y HORAS TRABAJADAS ----------------");
	}

}
