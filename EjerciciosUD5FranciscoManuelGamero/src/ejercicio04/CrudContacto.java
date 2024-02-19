package ejercicio04;

import java.util.Map;
import java.util.Set;

public class CrudContacto {

	private Map<Contacto, String> lista;

	public CrudContacto(Map<Contacto, String> lista) {
		super();
		this.lista = lista;
	}

	public Map<Contacto, String> getLista() {
		return lista;
	}

	public void setLista(Map<Contacto, String> lista) {
		this.lista = lista;
	}

	public void agregarContacto(Contacto c, String numero) {
		lista.put(c, numero);
	}

	public Contacto buscarContacto(String nombre) {
		Set<Contacto> aux = lista.keySet();
		Contacto encontrado = null;
		for (Contacto c : aux) {
			if (c.getNombre().equalsIgnoreCase(nombre)) {
				encontrado = c;
			}
		}
		return encontrado;
	}

	public void borrarContacto(String nombre) {
		lista.remove(buscarContacto(nombre));
	}

	public void mostrarContacto(String nombre) {
		System.out.println(buscarContacto(nombre) + lista.get(buscarContacto(nombre)));
	}
	public void modificarNombre(String nombre, String Nombre) {
		buscarContacto(nombre).setNombre(nombre);
	}
}
