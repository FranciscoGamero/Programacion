package EjemploOrdenar;

import java.util.Comparator;

public class ComparaPorMarca implements Comparator<Corredor> {

	public int compare(Corredor c1, Corredor c2) {

		if (c1.getMarca() < c2.getMarca()) {
			return -1;
		} else if (c1.getMarca() > c2.getMarca()) {
			return 1;
		} else {
			return 0;
		}
	}

}
