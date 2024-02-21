package ejercicio04;

public class Venta {

	private LineaVenta[] lista;

	public Venta(LineaVenta[] lista) {
		super();
		this.lista = lista;
	}

	public LineaVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaVenta[] lista) {
		this.lista = lista;
	}

	public double calcularTotal() {
		double total=0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
			total+=lista[i].calcularPrecioProducto();
			}
		}
		return total;
	}
	// Este metodo solo muestra los productos de la lista que no sean nulos a modo de ticket
	public void mostrarLista() {
		int dos = 2;
		System.out.println("Producto \t\t PrecioUnitario \t\t Cantidad \t\t PrecioFinalProducto\n"
				+ "****************************************************************************************************\n");
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getProducto() instanceof Alimentacion
						&& ((Alimentacion) lista[i].getProducto()).getTiempoCaducidad() < dos) {
					System.out.println(lista[i] + "\nSe le aplica un descuento por caducidad (menor a 2 dias)\n");
				} else {
					System.out.println(lista[i]+"\n");
				}
			}
		}
		System.out.println("****************************************************************************************************");
		System.out.printf("\t\t\t\t\t\t\t\t\t\tPRECIO TOTAL: %.2f€",calcularTotal());
	}
}
