package ejercicio05;

public class Oficina {

	private Empleado lista[];

	public Oficina(Empleado[] lista) {
		super();
		this.lista = lista;
	}

	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	public double calcularSueldoEmpleado(Empleado e) {
		return e.calcularSueldo();
	}

	public double calcularGastos() {
		double total = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				total += calcularSueldoEmpleado(lista[i]);
			}
		}
		return total;
	}

	public void mostrarEmpleados(double objetivo) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				System.out.println((lista[i]) + "Sueldo: " + calcularSueldoEmpleado(lista[i]));
				if (lista[i] instanceof Vendedor) {
					((Vendedor) lista[i]).felicitarVenta(objetivo);
				}
			}
		}
	}
}
