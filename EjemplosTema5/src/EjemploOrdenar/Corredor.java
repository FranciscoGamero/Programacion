package EjemploOrdenar;

public class Corredor implements Comparable<Corredor>{

	private int dorsal;
	private double marca;
	private String nombre;

	public Corredor(int dorsal, double marca, String nombre) {
		super();
		this.dorsal = dorsal;
		this.marca = marca;
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public double getMarca() {
		return marca;
	}

	public void setMarca(double marca) {
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	@Override
	public String toString() {
		return "Corredor [dorsal=" + dorsal + ", marca=" + marca + ", nombre=" + nombre + "]";
	}

	public int compareTo(Corredor c) { // Le pasamos un corredor y lo
		if (this.dorsal < c.dorsal) { // compara con el que estamos llamando
			return -1;
		} else if (this.dorsal > c.dorsal) {
			return 1;
		}
		return 0;
	}
	
}
