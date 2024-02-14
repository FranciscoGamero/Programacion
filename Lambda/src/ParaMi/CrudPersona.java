package ParaMi;

import java.util.List;
import java.util.function.Predicate;

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

	public void mostrarMenores() {
		Predicate<Persona> menores = (Persona pe) -> pe.getEdad() >=18;
		for (int i = 0; i < lista.size(); i++) {
			if (menores.test(lista.get(i))) {
				System.out.println("Puede entrar");
			} else {
				System.out.println("No puede entrar");
			}

		}

	}
}
