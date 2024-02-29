package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Cancion> lista = new ArrayList<>();
		MiMusica mus = new MiMusica(lista);
		
		lista.add(new Cancion(0, "Echame la Culpa", "Luis Fonsi ft. Demi Lovato", 190, false, 2.53));
		lista.add(new Cancion(2, "A Dios le Pido", "Juanes", 150, true, 3.26));
		lista.add(new Cancion(3, "Dákiti", "Bad Bunny x Jhay Cortez", 210, false, 3.25));
		lista.add(new Cancion(4, "Me Gusta", "Shakira ft. Anuel AA", 180, true, 3.16));
		lista.add(new Cancion(5, "Te Boté", "Nio García, Casper Mágico, Darell", 170, false, 4.28));
		lista.add(new Cancion(6, "Recuérdame", "Carlos Rivera", 130, true, 2.47));

		//mus.buscarGratis();
		//System.out.println(mus.buscarMayorDuración());
		for (Cancion c : mus.crearPlaylistAleatoria(10)) {
			System.out.println(c);
		}
		//mus.mostrarTodo();
	}

}
