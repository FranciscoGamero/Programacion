 package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Equipo {

	private List<Jugador> listaJugadores;
	private String nombreEquipo;

	public Equipo(List<Jugador> listaJugadores, String nombreEquipo) {
		super();
		this.listaJugadores = listaJugadores;
		this.nombreEquipo = nombreEquipo;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public void mostrarLista(List<Jugador> l) {

		Iterator<Jugador> it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public List<Jugador> buscarCeroGoles() {
		int cero = 0;
		List<Jugador> sinMarcar = new ArrayList<>();
		Iterator<Jugador> it = listaJugadores.iterator();
		Jugador jugadorAux = null;

		while (it.hasNext()) {
			jugadorAux = it.next();
			if (jugadorAux.getGolesAnotados() == cero) {
				sinMarcar.add(jugadorAux);
			}
		}
		return sinMarcar;
	}

	public Jugador buscarPorCamiseta(int numCamiseta) {
		boolean encontrado = false;
		int i = 0;

		while (i < listaJugadores.size() && !encontrado) {
			if (listaJugadores.get(i).getNumCamiseta() == numCamiseta) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return listaJugadores.get(i);
		} else {
			return null;
		}

		/*
		 * for (Jugador j : listaJugadores) { if(j.getNumCamiseta()==numCamiseta) {
		 * return j; } } return null;
		 */
	}

	public void mostrarJugador(Jugador j) {

		if (j != null) {
			System.out.println(j);
		} else {
			System.out.println("Jugador no encontrado");
		}
	}

	public double calcularMediaGoles() {

		double total = 0.0;
		for (Jugador j : listaJugadores) {
			total += j.getGolesAnotados();
		}
		return total / listaJugadores.size();
	}

	public void modificarPosicion(int numCamiseta, String nuevaPosicion) {

		if (buscarPorCamiseta(numCamiseta) != null) {
			buscarPorCamiseta(numCamiseta).setPosicion(nuevaPosicion);
		}
	}

	public void ordenarPorPosicion() {
		Collections.sort(listaJugadores);
	}

	public void ordenarPorGoles() {
		Collections.sort(listaJugadores, new ComparaPorGoles());
	}
}
