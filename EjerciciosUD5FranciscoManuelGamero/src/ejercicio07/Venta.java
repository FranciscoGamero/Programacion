package ejercicio07;

import java.util.List;

public class Venta {

	private List<LineaVenta> lista;

	public Venta(List<LineaVenta> lista) {
		super();
		this.lista = lista;
	}

	public List<LineaVenta> getLista() {
		return lista;
	}

	public void setLista(List<LineaVenta> lista) {
		this.lista = lista;
	}

	public double calcularTotal() {
		double total = 0;
		if (!lista.isEmpty()) {
			for (LineaVenta lv : lista) {
				total += lv.calcularPrecioProducto();
			}
		}
		return total;
	}

	// Este metodo solo muestra los productos de la lista que no sean nulos a modo
	// de ticket
	public void mostrarLista() {
		int dos = 2;
		System.out.println("Producto \t\t PrecioUnitario \t\t Cantidad \t\t PrecioFinalProducto\n"
				+ "****************************************************************************************************\n");
		if (!lista.isEmpty()) {
			for (LineaVenta lv : lista) {
				if (lv.getProducto() instanceof Alimentacion
						&& ((Alimentacion)lv.getProducto()).getTiempoCaducidad() < dos) {
					System.out.println(lv.getProducto() + "\nSe le aplica un descuento por caducidad (menor a 2 dias)\n");
				} else {
					System.out.println(lv.getProducto() + "\n");
				}
			}
		}
		System.out.println(
				"****************************************************************************************************");
		System.out.printf("\t\t\t\t\t\t\t\t\t\tPRECIO TOTAL: %.2f€", calcularTotal());
	}
	public void mostrarTodo() {
		if(!lista.isEmpty()) {
			for (LineaVenta lv : lista) {
				System.out.println(lv.getProducto());
			}
		}
	}
}
