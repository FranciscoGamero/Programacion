package ejemplo_Abstracto;

public class Cuadrado extends Figura{
	private double lado;
	
	public Cuadrado(double x, double y,double lado) {
		super(x, y);
		this.lado=lado;
	}
	public double calcularArea() {
		return lado*lado;
	}
}
