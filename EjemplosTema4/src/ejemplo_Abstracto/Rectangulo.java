package ejemplo_Abstracto;

public class Rectangulo extends Figura{

	private double altura,base;

	public Rectangulo(double x, double y, double altura, double base) {
		super(x, y);
		this.altura = altura;
		this.base = base;
	}
	public double calcularArea() {
		return base*altura;
	}
}
