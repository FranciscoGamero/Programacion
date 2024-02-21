package gestion;

import model.Producto;

public class GestionProductos {
	private Producto p;
	// solo esta puesto un producto para ver otro ejemplo
	// Debería de haber un array con la lista de productos, como si fuera un
	// "carrito de la compra"

	public GestionProductos(Producto p) {
		this.p = p;
	}

	// A una fila del ticket se le llama línea de pedido o de venta
	public double calcularLinea(int cantidad) {
		double subTotal = 0;
		subTotal = cantidad * p.getPrecioUnitario();
		return subTotal;
	}

	public double calcularConDescuento(double descuento, int cantidad, int tope) {
		// El tope es para hacer un descuento solamente si se lleva mas cantidad del
		// tope
		double cien = 100;
		if (cantidad >= tope) {
			return calcularLinea(cantidad) - calcularLinea(cantidad) * descuento / cien;
		} else {
			return calcularLinea(cantidad);
		}
	}
}
