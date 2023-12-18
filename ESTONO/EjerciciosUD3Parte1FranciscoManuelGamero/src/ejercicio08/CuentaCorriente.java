package ejercicio08;

public class CuentaCorriente {
	private double saldo;
	private String nombreTitular;
	
	public CuentaCorriente(double saldo, String nombreTitular) {
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
	}

	// No es obligatorio usar todos los getters and setters
	public double getSaldo() {
		return saldo;
	}

	public void ingresarSaldo(double ingresado) {
		saldo+=ingresado;
		//Nunca se ponen asignaciones en el return (saldo+=ingresado;)		
		
		//return saldo; Si no sabes si tiene que devolver o no por ahora ponlo para devolver
		//no todo s los voids tienenque ser
	}
	
	// Para comprobar 
	public void retirarSaldo(double retirado) {
		if (retirado>saldo) {
			System.out.println("No se puede realizar la operación, ha insertado una cantidad más alta que su saldo actual.");
		} else {
			saldo-=retirado;
		}
	}
	public double pasarADolares(double cambio) {
		double dolares;
		dolares=saldo*cambio;
		return dolares;
	}
	public void mostrarSaldo() {
		System.out.printf("El saldo actual es de %.2f €", saldo);
	}
}
