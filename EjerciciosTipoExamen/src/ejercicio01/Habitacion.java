package ejercicio01;

public class Habitacion {

	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int numDiasOcupada;
	private int numOcupantes;
	private int id_habitacion;

	public Habitacion(double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupada, int numOcupantes,
			int id_habitacion) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.numDiasOcupada = numDiasOcupada;
		this.numOcupantes = numOcupantes;
		this.id_habitacion = id_habitacion;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getnumDiasOcupada() {
		return numDiasOcupada;
	}

	public void setnumDiasOcupada(int numDiasOcupada) {
		this.numDiasOcupada = numDiasOcupada;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	
	public int getNumDiasOcupada() {
		return numDiasOcupada;
	}

	public void setNumDiasOcupada(int numDiasOcupada) {
		this.numDiasOcupada = numDiasOcupada;
	}

	public int getId_habitacion() {
		return id_habitacion;
	}

	public void setId_habitacion(int id_habitacion) {
		this.id_habitacion = id_habitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente=" + nombreCliente
				+ ", numDiasOcupada=" + numDiasOcupada + ", numOcupantes=" + numOcupantes + "]";
	}

	public double calcularPrecio(double descuento, double gastoLimpieza) {
		return precioBase*numDiasOcupada;
	}
}
