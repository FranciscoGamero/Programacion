package ejercicio10;

public class Maquina {
	private Ticket tic;
	private double gananciasTotal;
	private String contraseniaMaquina="maquina132";

	
	public Maquina(Ticket tic) {
		this.tic = tic;
	}
	

	public Maquina() {
	}


	// OPCIONES DE USUARIO // OPCIONES DE USUARIO // OPCIONES DE USUARIO // OPCIONES DE USUARIO // OPCIONES DE USUARIO // OPCIONES DE USUARIO 
	
	public void setTic(Ticket tic) {
		this.tic = tic;
	}


	public boolean comprobarSaldo(double saldo,int cantidad) {
		if (calcularPrecio()>saldo) {
			return true;
		} else {
			return false;
		}
	}
	
	public double calcularPrecio() {
		double subTotal;
		subTotal=tic.getNumPersonas()*tic.getPrecioUnitario();
		return subTotal;
	}

	public double calcularCambio(double saldo) {
		return saldo-calcularPrecio();
	}
	public boolean comprobarPersonas(int cantidad) {
		if (cantidad!=1 && cantidad>1) {
		return true;
		}else {
			return false;
		}
	}

	// OPCIONES DE USUARIO // OPCIONES DE USUARIO // OPCIONES DE USUARIO // OPCIONES DE USUARIO // OPCIONES DE USUARIO // OPCIONES DE USUARIO 
	
	// OPCIONES DE OPERADOR // OPCIONES DE OPERADOR // OPCIONES DE OPERADOR // OPCIONES DE OPERADOR // OPCIONES DE OPERADOR // OPCIONES DE OPERADOR 
	public boolean comprobarContrasenia(String contrasenia) {
		if(contrasenia.equals(contraseniaMaquina)) {
			return 	true;
		} else {
			return false;
		}
	}
	public void sumarRecaudacion(double suma) {
		gananciasTotal+=suma;
	}
	public void mostrarRecaudacion() {
		System.out.printf("La recaudación es de: %.2f€\n",gananciasTotal);
	}
	public void restablecerRecaudación() {
		gananciasTotal=0;
	}
	}
	
