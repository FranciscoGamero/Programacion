package EjemploMap2;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//<Número de clase,alumno>
		Map<Integer, Alumno> lista2= new HashMap<>();
		
		Alumno a = new Alumno("Pedro",2,5.5);
		lista2.put(6, new Alumno("Ángel",1, 3.2));
		lista2.put(7, a);
		//System.out.println(lista2);
		a.setNombre("Tomás");// Cambia el nombre del objeto original.
		//System.out.println(lista2);
		//Devuelve solamente las claves
		System.out.println(lista2.keySet());
		//Devuelve solamente los valores
		System.out.println(lista2.values());
		//Devuelve el conjunto clave/valor
		System.out.println(lista2.entrySet());
		
	}

}
