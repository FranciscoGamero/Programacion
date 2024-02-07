package ejercicio01;

import java.util.List;

public class CrudNotas {

	private List<Nota> lista;

	public CrudNotas(List<Nota> lista) {
		super();
		this.lista = lista;
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudNotas [lista=" + lista + "]";
	}
	public void mostrarLista() {
		for (Nota n : lista) {
			System.out.println(n);
		}
	}
	public Nota buscarPorId(int id) {
		Nota n=null;
		boolean encontrado=false;
		for (int i = 0; i < lista.size() && !encontrado; i++) {
			if(lista.get(i).getId()==id) {
				n=lista.get(i);
				encontrado=true;
			}
		}
		return n;
	}
	public void mostrarNota(Nota n) {
		System.out.println(n);
	}
	public int mostrarNumeroDeNotas() {
		return lista.size();
	}
	public void agregarNota(Nota n) {
		lista.add(n);
	}
	public void borrarNota(Nota n) {
		if(!lista.isEmpty())
		lista.remove(n);
	}
	public void modificarTitulo(int id,String titulo) {
		buscarPorId(id).setTitulo(titulo);
	}
}
