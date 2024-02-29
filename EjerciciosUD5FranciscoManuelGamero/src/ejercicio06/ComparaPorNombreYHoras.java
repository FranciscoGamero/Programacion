package ejercicio06;

import java.util.Comparator;

public class ComparaPorNombreYHoras implements Comparator<Trabajador>{

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		/*
		 * Para poder ordenar por horas si el nombre es igual, si fuera por otro criterio sería:
		 * 
			if (t1.getNombre().compareToIgnoreCase(t2.getNombre()) == 0) {
				return o.compare(t1, t2);
			} else {
				return t1.getNombre().compareTo(t2.getNombre());
			}
			
		 */
		ComparaPorHoras o = new ComparaPorHoras();
		
        if(t1.getNombre().equalsIgnoreCase(t2.getNombre()))
            return o.compare(t1, t2);
        else 
            return t1.getNombre().compareTo(t2.getNombre());
    }

}
