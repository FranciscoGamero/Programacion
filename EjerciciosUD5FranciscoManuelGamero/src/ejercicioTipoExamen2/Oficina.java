package ejercicioTipoExamen2;

import java.util.ArrayList;
import java.util.List;

public class Oficina{

	private List<Trastero> lista;

	public Oficina(List<Trastero> lista) {
		super();
		this.lista = lista;
	}

	public List<Trastero> getLista() {
		return lista;
	}

	public void setLista(List<Trastero> lista) {
		this.lista = lista;
	}

	public void agregarTrastero(Trastero t) {
		lista.add(t);
	}

	public void mostrarLista() {
		for(Trastero t : lista) {
			System.out.println(t);
		}
	}
	public List<Trastero> buscarPorPrecio(double precio) {
		
		List<Trastero> aux = new ArrayList<>();
		if (!lista.isEmpty()) {
			for (Trastero t : lista) {
				if (t.getPrecio() == precio) {
					aux.add(t);
				}
			}
		}
		return aux;
	}

	
	public Trastero buscarPorNumero(int numero) {
		
		Trastero aux = null;
		if (!lista.isEmpty()) {
			for (Trastero t : lista) {
				if (t.getNumeroTrastero() == numero) {
					aux = t;
				}
			}
		}
		return aux;
	}
	
	public Trastero buscarElMasCaro() {
		Trastero aux = null;
		if (!lista.isEmpty()) {
			for (Trastero t : lista) {
				if (aux.getPrecio()<t.getPrecio()) {
					aux = t;
				}
			}
		}
		return aux;
	}
	
	public void eliminarTrastero(int numero) {
		
		if(!lista.isEmpty()) {
			lista.remove(buscarPorNumero(numero));
		}
	}
	
	public void modificarPrecio(int numero, double precio) {
		
		if(!lista.isEmpty()) {
			buscarPorNumero(numero).setPrecio(precio);
		}
	}
	
	public void mostrarNoOcupados() {
		
		for(Trastero t: lista) {
			if(!t.isOcupado()) {
				System.out.println(t);
			}
		}
	}
}
