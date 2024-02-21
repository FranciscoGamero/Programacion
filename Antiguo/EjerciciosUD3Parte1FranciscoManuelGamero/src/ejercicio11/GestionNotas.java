package ejercicio11;

import java.util.Random;

public class GestionNotas {
	private Alumno alumn;

	public GestionNotas(Alumno alumn) {
		this.alumn = alumn;
	}

	public void addNotas(double notas[]) {
		Random rd = new Random(System.nanoTime());
		double desde = 0, hasta = 10;
		for (int i = 0; i < notas.length; i++) {
			notas[i] = rd.nextDouble(hasta - desde + 1) + desde;
			alumn.setNotas(notas);
		}
	}

	public void mostrarNotas(double notas[]) {
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Las notas del alumno son: %.2f", notas[i]);
		}
	}

	public int calcularSuspensos(double notas[]) {
		int cont = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 5) {
				cont++;
			}
		}
		return cont;
	}
	public double calcularMedia(double notas[]) {
		double media,suma=0;
		for (int i = 0; i < notas.length; i++) {
			suma=+notas[i];
		}
		media=suma/notas.length;
		return media;
	}
}
