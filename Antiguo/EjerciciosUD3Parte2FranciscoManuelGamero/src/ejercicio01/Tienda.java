package ejercicio01;

import java.util.Arrays;

public class Tienda {

	private Producto lista[];
	private int nPd; // Número de productos que hay
	private double gastosProductos;
	private double ganancias;

	public Tienda(Producto[] lista, int nPd, double gastosProductos, double ganancias) {
		this.lista = lista;
		this.nPd = nPd;
		this.gastosProductos = gastosProductos;
		this.ganancias = ganancias;
	}

	public Producto[] getLista() {
		return lista;
	}

	public int getnPd() {
		return nPd;
	}

	public void agregarProducto(Producto p) {
		lista[nPd] = p;
		nPd++;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + ", nPd=" + nPd + "]";
	}

	public void mostrarDatoProdcutos() {
		System.out.print("Código del producto"+" "+"Nombre del producto"+" "+"Precio fabricación"+" "+
	"Precio coste "+" "+" Fragilidad\n");
		for (int i = 0; i < nPd; i++) {
			System.out
					.print(lista[i].getCodigoProducto() + " " + lista[i].getNombre() + " " + lista[i].getPrecioFabrica()
							+ "€ " + lista[i].getPrecioCoste() + "€ " + lista[i].isFragil() + "\n");
		}
	}

	public boolean comprobarFragilidad(Producto p) {
		if (p.isFragil()) {
			return true;
		} else {
			return false;
		}
	}

	public double calcularGastos() {
		for (int i = 0; i < nPd; i++) {
			gastosProductos += lista[i].getPrecioCoste();
		}
		return gastosProductos;
	}

	public void mostrarGastos() {
		System.out.printf("Los gastos totales en productos: %.2f€", gastosProductos);
	}

	public int encontrarPorCodigo(String cod) {
		int i = 0;
		boolean encontrado = false;
		while (i < lista.length && !encontrado) {
			Producto delista = lista[i];
			if (delista.getCodigoProducto().equalsIgnoreCase(cod)) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}

	public boolean comprobarfragil(String cod) {
		int pos;
		pos= encontrarPorCodigo(cod);
		if(lista[pos].isFragil()) {
			return true;
		} else {
			return false;
		}
	}
	public void mostrarFragilidad(boolean resul) {
		if (resul) {
			System.out.println("El producto es fragil.");
		} else {
			System.out.println("El producto no es fragil");
		}
	}
	public double calcularPVP(int porcen, String cod) {
		int cien = 100;
		double preciopvp;
		preciopvp = lista[encontrarPorCodigo(cod)].getPrecioCoste()
				+ (lista[encontrarPorCodigo(cod)].getPrecioCoste() * porcen / cien);
		ganancias += preciopvp;
		return preciopvp;

	}

	public double calcularGanancias() {
		double pfinal;
		pfinal = ganancias - gastosProductos;
		return pfinal;
	}
}
