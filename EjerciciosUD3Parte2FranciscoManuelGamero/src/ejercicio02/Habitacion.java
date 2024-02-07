package ejercicio02;

public class Habitacion {
/*
 * Poner el tipo como string, el precio es base + los añadidos (tipos de habitacion y servicios)*/
	/*Poner un int id y despues hacer un find by id*/
	private int tipoHabitacion;
	private double precioHabitacion;
	private int servicios;
	private String clienteAsignado;
	private int numDias;
	private boolean limpieza;
	private boolean ocupada;
	
	public Habitacion(int tipoHabitacion, int servicios,
			String clienteAsignado,	int numDias, boolean limpieza) {
		
		this.tipoHabitacion = tipoHabitacion;
		this.servicios = servicios;
		this.clienteAsignado = clienteAsignado;
		this.numDias = numDias;
		this.limpieza = limpieza;
		
	}
	public Habitacion() {
	}
	
	
	public int getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(int tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	public double getPrecioHabitacion() {
		return precioHabitacion;
	}
	public void setPrecioHabitacion(double precioHabitacionIndi) {
		this.precioHabitacion = precioHabitacionIndi;
	}

	public int getServicios() {
		return servicios;
	}
	public void setServicios(int servicios) {
		this.servicios = servicios;
	}
	public String getClienteAsignado() {
		return clienteAsignado;
	}
	public void setClienteAsignado(String clienteAsignado) {
		this.clienteAsignado = clienteAsignado;
	}
	public int getNumDias() {
		return numDias;
	}
	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}
	public boolean isLimpieza() {
		return limpieza;
	}
	public void setLimpieza(boolean limpieza) {
		this.limpieza = limpieza;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	@Override
	public String toString() {
		return "Habitacion [tipoHabitacion=" + tipoHabitacion + ", precioHabitacion=" + precioHabitacion
				+ ", servicios=" + servicios + ", clienteAsignado="
				+ clienteAsignado + ", numDias=" + numDias + ", limpieza=" + limpieza + ", ocupada=" + ocupada + "]";
	}
	
	
}
