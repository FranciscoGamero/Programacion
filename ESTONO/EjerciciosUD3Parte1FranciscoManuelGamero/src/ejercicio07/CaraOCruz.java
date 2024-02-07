package ejercicio07;

import java.util.Random;

public class CaraOCruz {

	public int lanzarMoneda() {
		int desde = 1, hasta = 2, resul;
		Random rd = new Random(System.nanoTime());
		resul = rd.nextInt(hasta - desde + 1) + desde;
		if (resul == 1) {
			resul = 1;
		} else {
			resul = 2;
		}
		return resul;
	}

	public boolean comprobarMoneda(int resul, int eleccion) {
		if (eleccion == resul) {
			return true;
		} else {
			return false;
			}
		}
	public void mostrarGanador(boolean resul) {
		if(resul) {
			System.out.println("***************");
			System.out.println("HAS GANADO!");
			System.out.println("***************\n");
			
		} else {
			System.out.println("----------------");
			System.out.println("Siga Jugando");
			System.out.println("----------------\n");

		}
	}
	
}
