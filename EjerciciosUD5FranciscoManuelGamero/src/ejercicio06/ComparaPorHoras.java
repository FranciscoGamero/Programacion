package ejercicio06;

import java.util.Comparator;

public class ComparaPorHoras implements Comparator<Trabajador>{
	
	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		if (t1.getHorasTrabajadas()*t1.getSueldo() < t2.getHorasTrabajadas()*t2.getSueldo()) { // compara con el que estamos llamando
			return 1;
		} else if (t1.getHorasTrabajadas()*t1.getSueldo() > t2.getHorasTrabajadas()*t2.getSueldo()) {
			return -1;
		}
		return 0;
	}
}
