package ejercicio07;

public abstract class Producto {
	
	private int codIden;
	private String nombre;
	private double precioUnitario;

	public Producto(int codIden, String nombre, double precioUnitario) {
		super();
		this.codIden = codIden;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodIden() {
		return codIden;
	}

	public void setCodIden(int codIden) {
		this.codIden = codIden;
	}

	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", codIden=" + codIden + "]";
	}

	//metodo abstracto para calcular el precio de cualquier producto
	public abstract double calcularPrecio();
}
