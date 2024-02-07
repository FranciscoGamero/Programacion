package ejercicio06;

import java.util.Random;

public class Generadora {

	public int generarNum(int desde, int hasta) {
		Random rd = new Random(System.nanoTime());

		return rd.nextInt(hasta - desde + 1) + desde;
	}

	public int generarQuiniela() {
		int desde = 1, hasta = 3, resul;
		Random rd = new Random(System.nanoTime());
		resul = rd.nextInt(hasta - desde + 1) + 1;
		return resul;
	}

	public boolean comprobarQuiniela(int resul, int numElegido) {
		int uno = 1, dos = 2, tres = 3;
		boolean resultado=false;
		if (resul == numElegido) {
			resultado=true;
		} else {
			if (resul == uno) {

			resultado=false;
			} else if (resul == dos) {

				resultado=false;

			} else if (resul == tres) {

				resultado=false;
			}
		}
		return resultado;
	}

	public void mostrarQuiniela(boolean resul) {
		if (resul) {
			System.out.println("¡HAS GANADO!");
		} else {
			System.out.println("Has perdido...");
		}
		
	}

	public int generarParesONones(int num) {
		int desde = 1, hasta = num, resul;
		Random rd = new Random(System.nanoTime());
		resul = rd.nextInt(hasta - desde + 1) + 1;
		return resul;
	}

	public boolean comprobarParesONones(int eleccion, int resul, int numElegido) {
		int impar = 1, dos = 2, suma;
		suma = resul + numElegido;
		if (eleccion == impar) {
			if (suma % dos != 0) {
				return true;
			} else {
				return false;
			}
		} else {
			if (suma % dos == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

	public void mostrarParesONones(boolean resul) {
		if (resul) {
			System.out.println("¡Has ganado!");
		} else {
			System.out.println("Has perdido...");
		}
	}

	public int generarJuegoChinos() {
		int desde = 0, hasta = 3, resul;
		Random rd = new Random(System.nanoTime());
		resul = rd.nextInt(hasta - desde + 1);
		return resul;
	}

	public boolean comprobarJuegoChinos(int resul, int num, int eleccion) {
		if ((num + resul) == eleccion) {
			return true;
		} else {
			return false;
		}
	}
	public void mostrarJuegoChinos(boolean resul) {
		if (resul) {
			System.out.println("¡Has ganado!");
		} else {
			System.out.println("Has perdido...");
		}
	}
	public int generarPrimitiva(int desde, int hasta) {
		int num = 0;

		return num;
	}

}
