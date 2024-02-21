package ejercicio06;

public abstract class Cuenta {

	private Cliente usuario;
	private double saldo;
	private double mantenimiento;

	public Cuenta(Cliente usuario, double saldo, double mantenimiento) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.mantenimiento = mantenimiento;
	}

	public Cliente getUsuario() {
		return usuario;
	}

	public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public abstract double calcularSaldo();
	public abstract void ingresarDinero(double cantidad);

	public abstract void retirarDinero(double cantidad);
}
