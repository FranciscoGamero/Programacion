package repasoud3completo;

public class Producto {

	private String nombre;
	private double precioFabrica;
	private int seccion;
	int id;
	private boolean enVenta;
	
	public Producto(String nombre, double precioFabrica, int seccion,int id, boolean enVenta) {
		super();
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.seccion = seccion;
		this.id = id;
		this.enVenta = enVenta;
	}
	public Producto() {
		
	}
	/*Los getters and setters sirven para acceder a los atributos de un objeto de una clase desde otra clase*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioFabrica() {
		return precioFabrica;
	}
	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}
	public int getSeccion() {
		return seccion;
	}
	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}
	public boolean isEnVenta() {
		return enVenta;
	}
	public void setEnVenta(boolean enVenta) {
		this.enVenta = enVenta;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioFabrica=" + precioFabrica + ", seccion=" + seccion + ", id=" + id
				+ ", enVenta=" + enVenta + "]";
	}

	
}
