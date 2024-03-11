package ejercicio;

import java.util.Comparator;

public class ComparaPorGoles implements Comparator<Jugador> {

	@Override
	public int compare(Jugador j1, Jugador j2) {
		return -Integer.compare(j1.getGolesAnotados(), j2.getGolesAnotados());
	}

}
