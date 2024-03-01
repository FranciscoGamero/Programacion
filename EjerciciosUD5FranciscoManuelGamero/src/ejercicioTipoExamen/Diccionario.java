package ejercicioTipoExamen;

import java.util.Iterator;
import java.util.List;

public class Diccionario {

	private List<Palabra> listaPalabras;

	public Diccionario(List<Palabra> listaPalabras) {
		super();
		this.listaPalabras = listaPalabras;
	}

	public List<Palabra> getListaPalabras() {
		return listaPalabras;
	}

	public void setListaPalabras(List<Palabra> listaPalabras) {
		this.listaPalabras = listaPalabras;
	}

	public void mostrarPalabras() {
		Iterator<Palabra> it = listaPalabras.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public void agregarPalabra(Palabra p) {
		listaPalabras.add(p);
	}

	public Palabra buscarSignificado(String nombre) {
		Palabra aux = null;
		for (Palabra p : listaPalabras) {
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
		if (buscarSignificado(nombre) != null) {

			buscarSignificado(nombre).setSignificado(significado);
		}
	}

	public void borrarPalabra(String nombre) {
		if (buscarSignificado(nombre) != null) {
			listaPalabras.remove(buscarSignificado(nombre).getId());
		}
	}
}
