package ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionEventos{

	private List<Festival> lista;

	public GestionEventos(List<Festival> lista) {
		super();
		this.lista = lista;
	}

	public List<Festival> getLista() {
		return lista;
	}

	public void setLista(List<Festival> lista) {
		this.lista = lista;
	}

	public void mostrarLista(List<Festival> listaExterna) {
		for (Festival f : listaExterna) {
			System.out.println(f);
		}
	}

	public void agregarFestival(Festival f) {
		if (f != null) {
			lista.add(f);
		}
	}
	public Festival buscarPorId (int id) {
		boolean encontrado = false;
		int i=0;
		while(i<lista.size() && !encontrado) {
			if(lista.get(i).getId()==id) {
				return lista.get(i);
			} else {
				i++;
			}
		}
		return null;
	}
	public void mostrarHorarioFestival(Festival f) {
		if(f!=null) {
			System.out.print(f.getFechaInicio());
			System.out.print(f.getFechaFin());
			System.out.println("");
			System.out.println(f.getHoraInicio());
			System.out.println(f.getHoraFin());
		}
	}
	public void modificarArtistas(Festival f, int cantArtistas) {
		if(f!=null) {
			f.setCantidadArtistas(cantArtistas);
		}
	}
	public List<Festival> duracionMasDeUnDia(){
		List<Festival> listaAux = new ArrayList<>();
		for (Festival f : lista) {
			if (f.getFechaFin().isBefore(f.getFechaInicio().plusDays(1))) {
				listaAux.add(f);
			}
		}
		return listaAux;
		}
	public void ordenarPorFecha() {
		Collections.sort(lista);
	}
}
