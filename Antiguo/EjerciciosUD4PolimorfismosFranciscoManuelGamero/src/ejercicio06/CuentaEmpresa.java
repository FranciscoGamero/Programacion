package ejercicio06;

public class CuentaEmpresa extends Cuenta {

	private int extra;
	
	public CuentaEmpresa(Cliente usuario, double saldo) {
		super(usuario, saldo, 0);
	}
	
	
	public int getExtra() {
		return extra;
	}
	public void setExtra(int extra) {
		this.extra = extra;
	}
	public double calcularSaldo() {
		return getSaldo();
	}
	
	public void ingresarDinero(double cantidad) {
		double total = 0;
		total = getSaldo() + cantidad;
		setSaldo(total);
		/*setSaldo(getSaldo() + cantidad)*/
	}

	public void retirarDinero(double cantidad) {
		double total = 0;
		
		if (cantidad < getSaldo()) {
			extra+=1;
			total = getSaldo() - (cantidad + 1);
			setSaldo(total);
			/*setSaldo(getSaldo() - (cantidad + 1));*/
		} /*else {
			System.out.println("No puede retirar mas de lo que hay en la cuenta"); No se puede hacer esto, el else sobra
		}*/
	}
}
