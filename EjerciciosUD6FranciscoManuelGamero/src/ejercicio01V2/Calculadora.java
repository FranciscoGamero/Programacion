package ejercicio01V2;

public class Calculadora {

	public int sumarEnteros(int num1, int num2) throws ArithmeticException {
		return num1 + num2;
	}

	public int restarEnteros(int num1, int num2) throws ArithmeticException {
		return num1 - num2;
	}

	public int dividirEnteros(int num1, int num2) throws ArithmeticException {
		return num1 / num2;
	}

	public int multiplicarEnteros(int num1, int num2) throws ArithmeticException {
		return num1 * num2;
	}

	public double calcularRaizCuadrada(int num) throws RaizCuadradaNegativo {
		if (num < 0) {
			throw new RaizCuadradaNegativo();
		} else {
			return Math.sqrt(num);
		}
	}
}
