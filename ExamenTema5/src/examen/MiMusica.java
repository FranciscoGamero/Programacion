package examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MiMusica {

	private List<Cancion> listaCanciones;

	public MiMusica(List listaCanciones) {
		super();
		this.listaCanciones = listaCanciones;
	}

	public List getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(List listaCanciones) {
		this.listaCanciones = listaCanciones;
	}
	public void buscarGratis() {
		Cancion aux;
		Iterator<Cancion> it = listaCanciones.iterator();
		
		while(it.hasNext()) {
			aux=it.next();
			if(aux.isGratis()) {
				System.out.println(aux);
			}
		}
	}
	public Cancion buscarMayorDuración() {
		Cancion aux= new Cancion();
		for (Cancion c : listaCanciones) {
			if(c.getDuracion()>aux.getDuracion()) {
				aux=c;
			}
		}
		return aux;
	}
	public List<Cancion> crearPlaylistAleatoria(int cantCanciones){
		List<Cancion> nuevaPlaylist = new ArrayList<>();
		Random rd = new Random(System.nanoTime());
		int desde = 0;
		for (int i = 0; i < cantCanciones; i++) {
			nuevaPlaylist.add(listaCanciones.get(rd.nextInt(desde, listaCanciones.size())));
		}
		return nuevaPlaylist;
	}
	public void mostrarTodo() {
		Iterator<Cancion> it = listaCanciones.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
