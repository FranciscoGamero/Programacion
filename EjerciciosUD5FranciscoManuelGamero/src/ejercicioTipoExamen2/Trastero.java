package ejercicioTipoExamen2;

public class Trastero implements Comparable<Trastero>{
	
	private double capacidad;
	private String direccion;
	private int numeroTrastero;
	private double precio;
	private boolean ocupado;

	public Trastero(double capacidad, String direccion, int numeroTrastero, double precio, boolean ocupado) {
		super();
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.numeroTrastero = numeroTrastero;
		this.precio = precio;
		this.ocupado = ocupado;
	}

	
	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroTrastero() {
		return numeroTrastero;
	}

	public void setNumeroTrastero(int numeroTrastero) {
		this.numeroTrastero = numeroTrastero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Trastero [capacidad=" + capacidad + ", direccion=" + direccion + ", numeroTrastero=" + numeroTrastero
				+ ", precio=" + precio + ", ocupado=" + ocupado + "]";
	}
	public int compareTo(Trastero t) {
		if(this.numeroTrastero > t.getNumeroTrastero()) {
			return 1;
		} else if (this.numeroTrastero < t.getNumeroTrastero()) {
			return -1;
		} else {
			return 0;
		}
	}

}
