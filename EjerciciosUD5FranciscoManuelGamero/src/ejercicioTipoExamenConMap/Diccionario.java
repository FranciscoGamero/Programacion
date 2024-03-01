package ejercicioTipoExamenConMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class Diccionario {

	private Map<Palabra, String> lista;
	
	public Diccionario(Map<Palabra, String> lista) {
		super();
		this.lista = lista;
	}

	public Map<Palabra, String> getLista() {
		return lista;
	}

	public void setLista(Map<Palabra, String> lista) {
		this.lista = lista;
	}

	public void mostrarPalabras() {
		Iterator<Entry<Palabra, String>> it = lista.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void agregarPalabra(Palabra p, String significado) {
		lista.put(p, significado);
	}

	public Palabra buscarSignificado(String nombre) {
		Palabra aux = null;
		for (Palabra p : lista.keySet()) {
			if (p.getNombreIngles().equalsIgnoreCase(nombre)) {
				aux = p;
			}
		}
		return aux;
	}

	public void mostrarPalabra(Palabra p) {
		System.out.println(p);
	}

	public void modificarSignificado(String nombre, String significado) {
		if (lista.containsKey(buscarSignificado(nombre))) {
			lista.replace(buscarSignificado(nombre), significado);
		}
	}
	public void ordenarPorNombre() {
		
	}
	public void borrarPalabra(String nombre) {
		if (lista.containsKey(buscarSignificado(nombre))) {
			lista.remove(buscarSignificado(nombre));
		}
	}
}
