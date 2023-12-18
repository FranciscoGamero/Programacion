package crud;

import java.util.Arrays;

import model.Producto;

public class CrudProducto {

	private Producto lista[];

	/*
	 * Constructor para crear un objeto de esta clase pasando como parámetro una
	 * lista que ya puede tener tamañado dado por el usuario en el main
	 */

	public CrudProducto(Producto lista[]) {
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}

	/*
	 * Pasamos un producto y una posición y se añade dicho producto en dicha
	 * posición. No se comprueba nada, se pierde lo que había
	 */
	public void add(Producto p, int posicion) {
		lista[posicion] = p;
	}

	/*
	 * En este método, se pide en el main por teclado el código y el precio después
	 * se busca con el findByIdV2 el código que le demos y por último se setea el
	 * nuevo precio
	 */
	public void editPrecio(String codigo, double precioN) {
		int index = findByIdV2(codigo);
		if (index >= 0) {
			lista[index].setPrecioUnitario(precioN);
		}
	}

	// este find devuelve el producto
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;
		// Mientras no encuentre la id, seguirá siendo falso
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo)) { // equalsIgnoreCase sirve para comparar lo que hay
																// dentro
				encontrado = true; // Cuando encuentra la id se vuelve verdadero y salimos del bucle
			} else {
				i++;
			}
		}
		if (encontrado) { // Si es verdadero devuelve el producto, sino devuelve null
			return lista[i];
		} else {
			return null;
		}
	}

	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo)) {

				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return i; // Si es verdadero devuelve la posición del producto

		} else {
			return -1; // Si es falso devuelve una posición que nunca va a estar ocupada (en este caso
						// -1)
		}
	}

	/*public void delete(Producto p) {
		int index = findProduct(p);
		if (index >=0)
			lista[index].setActivo(false);
	}*/

	public void imprimirTodosLosProductos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i + 1) + ". " + lista[i]);
		}
	}

	public void imprimirSoloActivos() {
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].isActivo()) {
				System.out.println((i + 1) + ". " + lista[i]);
			}
		}
	}
}
