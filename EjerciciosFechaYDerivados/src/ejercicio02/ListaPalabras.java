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
	public String crearPalabra() {
	        return lista.stream()
	                .map(palabra -> String.valueOf(palabra.getPalabra().charAt(0)))
	                //"" es el valor inicial, y (agregar, letra) es una función lambda que concatena lo obtenido en el map al valor inicial
	                .reduce("", (agregar, letra) -> agregar + letra); 
	}
	public void borrarImpares() {
		lista.removeAll(lista.stream()
				.filter(p -> p.getPalabra().length()%2!=0)
				.toList());
	}
	public void pasarAMayusculas() {
        lista = lista.stream()
                .map(p -> new Palabra(p.getPalabra().toUpperCase()))
                .collect(Collectors.toList());
	}
}
