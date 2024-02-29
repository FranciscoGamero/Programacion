package ejercicio07;

public class LineaVenta {
	
	private Producto producto;
	private int cantidad;
	private double precioFinal;
	
	public LineaVenta(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	@Override
	public String toString() {
		return producto.getNombre() + " \t\t\t " + producto.getPrecioUnitario() + "€ \t\t\t " + cantidad + " \t\t\t "+ calcularPrecioProducto()+"€";
	}
	public double calcularPrecioProducto() {
		return producto.calcularPrecio()*cantidad;
	}
}
