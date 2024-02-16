package EjemploOrdenar;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator<Corredor>{

	@Override
	public int compare(Corredor c1, Corredor c2) {

		// El menos lo que hace es que esté ordenado de forma inversa
		return -(c1.getNombre().toLowerCase().compareTo(c2.getNombre().toLowerCase()));
	}

}
