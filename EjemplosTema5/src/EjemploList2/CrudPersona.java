package EjemploList2;

import java.util.List;

public class CrudPersona {

	private List<Persona> lista;

	public CrudPersona(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + "]";
	}

	public Persona buscarPorDNI(String dni) {
		boolean encontrado = false;
		int i = 0;
		while (i < lista.size() && !encontrado) {
			if (lista.get(i).getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return lista.get(i);
		} else {
			return null;
		}
	}

	public int buscarPorDNIV2(String dni) {
		boolean encontrado = false;
		int i = 0;
		while (i < lista.size() && !encontrado) {
			if (lista.get(i).getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}
	//Un buscar pero con un for
	public Persona buscarPorDNIV3(String dni) {
		Persona p= null;
		boolean encontrado=false;
		for (int i = 0; i < lista.size() && !encontrado; i++) {
			if(lista.get(i).getDni().equalsIgnoreCase(dni)) {
				p= lista.get(i);
				encontrado=true;
			}
		}
		return p;
	} //Al agregar siempre se le pasa el objeto entero y no los parametros para crearlos
	public void agregarPersona(Persona p) {
		lista.add(p);
	}
	public boolean agregarPersonaV2(Persona p) {
		return lista.add(p);
	}
	//Para mostrar todo usar un for each
	public void mostrarListado() {
		for (Persona p : lista) {
			System.out.println(p);
		}
	}
	public void eliminarPersona(Persona p) {
		lista.remove(p);
	}
	public void eliminarPersonaV2(int indice) {
		lista.remove(indice);
	}
	// El modificar es lo mismo que el eliminar pero con un Objeto.set(lo que queramos modificar)
	// Y poniendo como parámetro lo que queramos modificar en ese caso
	public void modificarPersona(Persona p) {
		
	}
}
