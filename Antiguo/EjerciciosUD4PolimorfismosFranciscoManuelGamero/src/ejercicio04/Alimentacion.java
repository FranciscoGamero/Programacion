package ejercicio04;

public class Alimentacion extends Producto{

	private int tiempoCaducidad;
	private double descuento;
	

	public Alimentacion(int codIden, String nombre, double precioUnitario, int tiempoCaducidad, double descuento) {
		super(codIden, nombre, precioUnitario);
		this.tiempoCaducidad = tiempoCaducidad;
		this.descuento = descuento;
	}

	public int getTiempoCaducidad() {
		return tiempoCaducidad;
	}

	public void setTiempoCaducidad(int tiempoCaducidad) {
		this.tiempoCaducidad = tiempoCaducidad;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Alimentacion [tiempoCaducidad=" + tiempoCaducidad + ", descuento=" + descuento
				+ ", getPrecioUnitario()=" + getPrecioUnitario() + ", getNombre()=" + getNombre() + ", getCodIden()="
				+ getCodIden() + "]";
	}
	public boolean calcularCaducidad() {
		if(tiempoCaducidad<2) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double calcularPrecio() {
		double cien=100;
		if(calcularCaducidad()) {
			return super.getPrecioUnitario()-(super.getPrecioUnitario()*descuento/cien);
		} else {
			return super.getPrecioUnitario();
		}
	}
	
}
