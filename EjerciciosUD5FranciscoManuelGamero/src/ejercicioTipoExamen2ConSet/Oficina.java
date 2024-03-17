package ejercicioTipoExamen2ConSet;

import java.util.HashSet;

public class Oficina {

	private HashSet<Trastero> lista;

	public Oficina(HashSet<Trastero> lista) {
		super();
		this.lista = lista;
	}

	public HashSet<Trastero> getLista() {
		return lista;
	}

	public void setLista(HashSet<Trastero> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + lista + "]";
	}

	public void mostrarLista(HashSet<Trastero> lista) {
		for (Trastero t : lista) {
			System.out.println(t);
		}
	}

	public void agregarTrastero(Trastero t) {
		lista.add(t);
	}

	public HashSet<Trastero> buscarPorPrecio(double precio) {
		HashSet<Trastero> trasterosEncontrados = new HashSet<Trastero>();
		if (!lista.isEmpty()) {
			for (Trastero t : lista) {
				if (t.getPrecio() == precio) {
					trasterosEncontrados.add(t);
				}
			}
		}
		return trasterosEncontrados;
	}

	public Trastero buscarPorNumero(int numeroTrastero) {
		if (!lista.isEmpty()) {
			for (Trastero t : lista) {
				if (t.getNumeroTrastero() == numeroTrastero) {
					return t;
				}
			}
		}
		return null;
	}

	public Trastero buscarMasCaro() {
		Trastero aux = new Trastero();
		if (!lista.isEmpty()) {
			for (Trastero t : lista) {
				if (aux.getPrecio()<t.getPrecio()) {
					aux = t;
				}
			}
		}
		return aux;
	}

	public void eliminarTrastero(int numeroTrastero) {
		if (!lista.isEmpty()) {
			lista.remove(buscarPorNumero(numeroTrastero));
		}
	}

	public void modificarPrecio(int numeroTrastero, double nuevoPrecio) {
		if (!lista.isEmpty()) {
			buscarPorNumero(numeroTrastero).setPrecio(nuevoPrecio);
		}
	}

	public void mostrarNoOcupados() {
		if (!lista.isEmpty()) {
			for (Trastero t : lista) {
				if (!t.isOcupado()) {
					System.out.println(t);
				}
			}
		}
	}
}
