package ejercicio02;


public class Club {

	private CrudSocio cs;

	public Club(CrudSocio cs) {
		super();
		this.cs = cs;
	}

	public CrudSocio getCs() {
		return cs;
	}

	public void setCs(CrudSocio cs) {
		this.cs = cs;
	}

	@Override
	public String toString() {
		return "Club [cs=" + cs + "]";
	}
	public double calcularPrecioPista(double precio,int id,int hora) {
		return cs.buscarSocioPorId(id).getCuota()+(hora*precio);
	}
}
