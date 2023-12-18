package ejemplo3;

public class Vendedor {
	private String nombre;
	private double ventas;
	private int canVehiculos;
	
	
	//Constructor Source --> Generate Constructor --> Select all --> Generate
	
public Vendedor(String nombre, double ventas, int canVehiculos) {
		
	this.nombre = nombre;
	this.ventas = ventas;
	this.canVehiculos = canVehiculos;
}

// Setters and getters Source --> Generate getters and setters --> Select all --> Generate

	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public double getVentas() {
		return ventas;
	}
	
	
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	
	
	public int getCanVehiculos() {
		return canVehiculos;
	}
	
	
	public void setCanVehiculos(int canVehiculos) {
		this.canVehiculos = canVehiculos;
	}
	
	//(ES UN MÉTODO MÁS) Source --> Generate ToString() --> Select all
	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", ventas=" + ventas + ", canVehiculos=" + canVehiculos + "]";
	}

}
