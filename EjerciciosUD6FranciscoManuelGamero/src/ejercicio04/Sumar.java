package ejercicio04;

public class Sumar {

	public double sumarNumeros(double num1, double num2) throws MayorQueDiez{
		if(num1+num2>10) {
			throw new MayorQueDiez("El resultado no puede ser mayor a 10.");
		} else {
			return num1+num2;
		}
	}
}
