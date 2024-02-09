package EjemploSet2;

import java.util.Set;

import EjemploList2.Persona;

public class CrudPersona {

	private Set<Persona> lista;

	public CrudPersona(Set<Persona> lista) {
		super();
		this.lista = lista;
	}

	public Set<Persona> getLista() {
		return lista;
	}

	public void setLista(Set<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + "]";
	}

	public void buscarPorDni(String dni) {

	}
}
