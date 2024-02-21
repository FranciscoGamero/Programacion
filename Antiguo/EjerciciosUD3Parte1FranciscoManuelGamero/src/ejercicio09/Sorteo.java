package ejercicio09;

import java.util.Random;

public class Sorteo {

	private int decimoGanador;
	private int decimoElegido;

	public void generarGanador() {
		//cambiar y poner el hasta y desde como parámetros que se dan desde el Main
		int desde = 1, hasta = 99999, resul;
		Random rd = new Random(System.nanoTime());
		decimoGanador = rd.nextInt(hasta - desde + 1) + desde;
	}

	public int getGanador() {
		return decimoGanador;
	}
	public int getElegido() {
		return decimoElegido;
	}

	public void comprarDecimoElegido(int decimo) {
		decimoElegido=decimo;
	}

	public int comprarDecimoAutomatico() {
		int desde = 1, hasta = 99999;
		Random rd = new Random(System.nanoTime());
		decimoElegido=rd.nextInt(hasta - desde + 1) + desde;
		return decimoElegido;
	}
/*	public boolean comprobarSaldo(float saldo) {
		float precioDecimo=20.0f;
		if(precioDecimo>saldo) {
			return true;
		} else {
			return false;
		}
	}*/
	public boolean comprobarDecimo(int decimo) {
		if (decimo==decimoGanador) {
			return true;
		} else {
			return false;
		}
	}
	// No se usa debido a que hace una comprobación y muestra a la vez, y solo se puede o comprobar o mostrar. Es preferible hacer la muestra en el Main 
	/*public void mostrarResultado(boolean resul) {
		if (resul) {
			System.out.println("¡¡HAS GANADO LA LOTERIA DE NAVIDAD!!");
		} else {
			System.out.println("Tu decimo no ha sido premiado.");
		}
	}*/
}

//CORRECCION DE CLASE // CORRECCION DE CLASE // CORRECCION DE CLASE // CORRECCION DE CLASE // CORRECCION DE CLASE // CORRECCION DE CLASE // CORRECCION DE CLASE // CORRECCION DE CLASE 






