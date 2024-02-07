package ejemplo_polimorfismo;

public class Cuadrado extends Figura {

	private double lado;

	public Cuadrado() {

	}

	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	   
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	public double calcularArea() {
		return lado * lado;
	}

	public double calcularPerimetro() {
		int cuatro = 4;
		return lado * cuatro;
	}
	public void mostrarLado() {
		System.out.println("Solo estoy en la clase Cuadrado porque los demás no tienen lados, en concreto tengo 4 lados ");
	}
}
