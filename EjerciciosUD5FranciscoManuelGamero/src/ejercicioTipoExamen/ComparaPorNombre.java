package ejercicioTipoExamen;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator<Palabra>{

	@Override
	public int compare(Palabra p1, Palabra p2) {
		return -p1.getNombreIngles().compareToIgnoreCase(p2.getNombreIngles());
	}



}
