package EjemploOrdenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*La lista tendria que estar en la clase carrera, 
		 * donde habría una lista de corredores y demás,
		 * Al igual que hacer los crud de corrdedor y atleta*/
		
		Scanner sc= new Scanner(System.in);
		String aux;
		
		int opcion, pos=0;
		List<Corredor> corredores= new ArrayList<Corredor>();
		
		corredores.add(new Corredor(4,1.43, "Jesse Owens"));
		corredores.add(new Corredor(8,1.11, "Ángel Naranjo"));
		corredores.add(new Corredor(3,2.23, "Abel Antón"));
		corredores.add(new Corredor(1,1.12, "Luis Miguel López"));
		corredores.add(new Corredor(6,1.14, "Rafa Villar"));
		corredores.add(new Corredor(5,1.13, "Miguel Campos"));
		corredores.add(new Corredor(7,1.11, "Emil Zatopek"));
		corredores.add(new Corredor(2,2.35, "Carl Lewis"));
		
		/*Mostramos todos los corredores con un for each
		
		for(Corredor con : corredores) {
			System.out.println(con);
		}*/
		/*do {
			System.out.println("""
					
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
		}while(opcion!=0);*/
		
		//Ordena por dorsal (Forma natural)
		Collections.sort(corredores);
		for(Corredor con : corredores) {
			System.out.println(con);
		}
		System.out.println("\nSEPARACION\n\nSEPARACION\n");
		//Ordena la coleccion por marca
		Collections.sort(corredores, new ComparaPorMarca());
		for(Corredor con : corredores) {
			System.out.println(con);
		}
		System.out.println("\nSEPARACION\n\nSEPARACION\n");
		//Ordena la coleccion por nombre de forma inversa
		Collections.sort(corredores, new ComparaPorNombre());
		for(Corredor con : corredores) {
			System.out.println(con);
		}
	}

}
