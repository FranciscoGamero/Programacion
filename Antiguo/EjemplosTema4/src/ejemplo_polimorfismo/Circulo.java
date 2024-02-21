package ejemplo_polimorfismo;

public class Circulo extends Figura{

	private double radio;

	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;
	}
	

	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}


	public double calcularArea() {
		int dos=2;
		return Math.PI*Math.pow(radio, dos);
	}

	public double calcularPerimetro() {
		int dos=2;
		return Math.PI*(radio*dos);
	}
	public void mostrarRadianes() {
		System.out.println("Solo estoy en la clase Círculo, porque los demás no pueden tener radianes en concreto tengo 2 pi radianes");
	}
}
