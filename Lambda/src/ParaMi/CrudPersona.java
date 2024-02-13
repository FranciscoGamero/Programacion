package ParaMi;

import java.util.List;

public class CrudPersona{

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
	public void mostrarMenores() {
		IEdad menores=(i)->System.out.println(lista.get(i));
		
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getEdad()<=18) {
				menores.comprobarEdad(i);
			}
		}
		
	}
}
