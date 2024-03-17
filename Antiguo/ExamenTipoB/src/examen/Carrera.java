package examen;

import java.util.Arrays;

public class Carrera {

	private Corredor listaCorredores[];
	private double distancia;
	private int numCorredores;

	public Carrera(Corredor[] listaCorredores, double distancia, int numCorredores) {
		super();
		this.listaCorredores = listaCorredores;
		this.distancia = distancia;
		this.numCorredores = numCorredores;
	}

	public Corredor[] getListaCorredores() {
		return listaCorredores;
	}

	public void setListaCorredores(Corredor[] listaCorredores) {
		this.listaCorredores = listaCorredores;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	@Override
	public String toString() {
		return "Carrera [listaCorredores=" + Arrays.toString(listaCorredores) + ", distancia=" + distancia + "]";
	}

	public void agregarCorredor(Corredor c, int i) {
		listaCorredores[i] = c;
		numCorredores++;
	}

	public void mostrarLista() {
		for (int i = 0; i < numCorredores; i++) {
			System.out.println(listaCorredores[i]);
		}
	}

	// Muestra cualquier lista, no solo la de la clase
	public void mostrarListaV2(Corredor lista[]) {
		for (int i = 0; i < numCorredores; i++) {
			System.out.println(lista[i]);
		}
	}

	public Corredor buscarPorDorsal(int dorsal) {
		int i = 0;
		boolean encontrado = false;

		while (i < numCorredores && !encontrado) {
			if (listaCorredores[i].getDorsal() == dorsal) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return listaCorredores[i];
		} else {
			return null;
		}
	}

	public double calcularTiempo(int dorsal, double factor) {
		Corredor p = buscarPorDorsal(dorsal);
		return p.getTiempo() / factor;
	}

	public Corredor[] buscarSeccion(int seccion) {
		Corredor listaaux[] = new Corredor[numCorredores];
		for (int i = 0; i < numCorredores; i++) {
			if (listaCorredores[i].getCategoria() == seccion) {
				listaaux[i] = listaCorredores[i];
			}
		}
		return listaaux;
	}

	public void modificarTiempo(int dorsal, double tiempo) {
		Corredor p = buscarPorDorsal(dorsal);
		p.setTiempo(tiempo);
	}

	public double calcularMedia(int dorsal) {
		Corredor p = buscarPorDorsal(dorsal);
		return p.getTiempo() / distancia;
	}

	public double sumarTiempo(Corredor lista[]) {
		double total = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				total += lista[i].getTiempo();
			}
		}
		return total;
	}

	public Corredor buscarGanador() {
		Corredor c = listaCorredores[0];
		for (int i = 0; i < numCorredores; i++) {
			if (listaCorredores[i].getTiempo() < c.getTiempo()) {
				c = listaCorredores[i];
			}
		}
		return c;
	}
}
