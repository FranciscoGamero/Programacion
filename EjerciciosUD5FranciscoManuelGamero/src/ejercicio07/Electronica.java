package ejercicio07;

public class Electronica extends Producto{

	private double porcenImpuesto;


	public Electronica(int codIden, String nombre, double precioUnitario, double porcenImpuesto) {
		super(codIden, nombre, precioUnitario);
		this.porcenImpuesto = porcenImpuesto;
	}

	public double getporcenImpuesto() {
		return porcenImpuesto;
	}

	public void setporcenImpuesto(double porcenImpuesto) {
		this.porcenImpuesto = porcenImpuesto;
	}

	@Override
	public String toString() {
		return "Electronica [porcenImpuesto=" + porcenImpuesto + ", getPrecioUnitario()=" + getPrecioUnitario() + ", getNombre()="
				+ getNombre() + ", getCodIden()=" + getCodIden() + "]";
	}

	@Override
	public double calcularPrecio() {
		double cien=100;
		return super.getPrecioUnitario()+(super.getPrecioUnitario()*porcenImpuesto/cien);
	}
	
	
}
