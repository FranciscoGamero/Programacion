package ejercicio02;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Supplier;

public class ListaPalabras {

	private List<Palabra> lista;

	public ListaPalabras(List<Palabra> lista) {
		super();
		this.lista = lista;
	}

	public List<Palabra> getLista() {
		return lista;
	}

	public void setLista(List<Palabra> lista) {
		this.lista = lista;
	}
	
	public void mostrarLista(List<Palabra> listaExterna) {
		listaExterna.forEach(p -> System.out.println(p));
	}
	public List<Palabra> ordenarAlfabeticamente() {
		 Comparator<Palabra> ordenar = Comparator.comparing(Palabra::getPalabra);
		 
		 return lista.stream()
		.sorted(ordenar).toList();
	}
	public List<Palabra> buscarPalabra(String palabraExterna) {
		return lista.stream()
				.filter(p -> p.getPalabra().equalsIgnoreCase(palabraExterna))
				.toList();
	}
	
	//Una lista con las primeras letras y la concatenamos en el collect
	/*public Palabra crearPalabra() {
		return lista.stream()
				.collect(() -> lista.forEach(p -> p.getPalabra().charAt(0)));
	}*/
	public char primerLetra(String palabraExterna) {
		return palabraExterna.charAt(0);
	}
}
