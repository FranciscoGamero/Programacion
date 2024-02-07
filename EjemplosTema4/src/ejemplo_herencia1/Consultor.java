package ejemplo_herencia1;

public class Consultor extends Trabajador {

	private int horas;
	private double tarifa;
	
	public Consultor(String nombre, String puesto, String dni, int horas, double tarifa) {
		super(nombre, puesto, dni);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	
	public Consultor(String dni, int horas, double tarifa) {
		super(dni);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double calcularPago() {
		return tarifa*horas;
	}
	public double calcularPagoV2() {
		return super.calcularPagoV2()+(tarifa*horas);
	}
	public double calcularPagoV3(double fijo)/*A la clase hija siempre hay que pasarle como parámetro 
	si se esta reescribiendo el mismo método que el de la madre (tener la misma firma)*/ {
		return super.calcularPagoV3(fijo)+(tarifa*horas);
	}
	public void mostrarAviso() {
		if(horas>40) {
			System.out.println("Las horas trabajada por el consultor son mas de 40");	
		}
	}
	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}
	
}
