package ejercicio03;

public class Movil {
	private String marca;
	private String modelo;
	private boolean vendido;
	private boolean estadomov;
	private double precioUnitario;
	public Movil(String marca, String modelo, boolean vendido, boolean estadomov, double precioUnitario) {
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.estadomov = estadomov;
		this.precioUnitario = precioUnitario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public boolean isEstadomov() {
		return estadomov;
	}

	public void setEstadomov(boolean estadomov) {
		this.estadomov = estadomov;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
}
