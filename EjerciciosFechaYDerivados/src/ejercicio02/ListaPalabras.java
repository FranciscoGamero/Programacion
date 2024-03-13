package ejercicio02;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
	
	public void mostrarLista() {
		lista.forEach(p -> System.out.println(p));
	}
	public void ordenarAlfabeticamente() {
		Comparator<Palabra> ordenar = Comparator.comparing(Palabra::getPalabra);
		lista.stream().sorted(ordenar);
	}
	public Palabra buscarPalabra(String palabraExterna) {
		return lista.stream()
				.filter(p -> p.getPalabra().equalsIgnoreCase(palabraExterna));
	}
}
