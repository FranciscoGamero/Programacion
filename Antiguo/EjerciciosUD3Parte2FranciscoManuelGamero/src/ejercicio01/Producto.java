package ejercicio01;

public class Producto {
	private double precioFabrica;
	private double precioCoste;
	private String nombre;
	private String codigoProducto;
	private boolean fragil;
	
	public Producto(double precioFabrica, String nombre, String codigoProducto, boolean fragil) {
		this.precioFabrica = precioFabrica;
		this.nombre = nombre;
		this.codigoProducto = codigoProducto;
		this.fragil = fragil;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public double getPrecioCoste() {
		return precioCoste;
	}

	public void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}
	public double calcularPrecioCoste(int porcen) {
		int cien=100;
		precioCoste=precioFabrica+(precioFabrica*porcen/cien);
		return precioCoste;
	}
	
}
