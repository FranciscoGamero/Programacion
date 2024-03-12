package ejercicio04;

import java.time.LocalDate;
import java.time.LocalTime;

public class Festival implements Comparable<Festival>{

	private String nombre;
	private int id;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	private int cantidadArtistas;
	private double precio;

	public Festival(String nombre, int id, LocalDate fechaInicio, LocalDate fechaFin, LocalTime horaInicio,
			LocalTime horaFin, int cantidadArtistas, double precio) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.cantidadArtistas = cantidadArtistas;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

	public int getCantidadArtistas() {
		return cantidadArtistas;
	}

	public void setCantidadArtistas(int cantidadArtistas) {
		this.cantidadArtistas = cantidadArtistas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

	@Override
	public String toString() {
		return "Festival [nombre=" + nombre + ", id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ",\ncantidadArtistas=" + cantidadArtistas
				+ ", precio=" + precio + "]";
	}

	@Override
	public int compareTo(Festival o) {
		// TODO Auto-generated method stub
		return this.fechaInicio.compareTo(o.getFechaInicio());
	}

}
