package ejercicio04;

import java.util.Map;

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
	public Contacto buscarContacto(String nombre)
}
