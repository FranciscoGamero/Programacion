package ejercicios;

public class Parking {

	private Vehiculo listaVehiculos[];
	private String direccion;

	public Parking(Vehiculo[] listaVehiculos, String direccion) {
		super();
		this.listaVehiculos = listaVehiculos;
		this.direccion = direccion;
	}

	public Vehiculo[] getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(Vehiculo[] listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double calcularPrecioUnVehiculo(Vehiculo v, double cantidadFija, double sumaFurgoneta) {
		return v.calcularPrecio(cantidadFija, sumaFurgoneta);
	}

	public Vehiculo buscarPorMatricula(String matricula) {
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < listaVehiculos.length) {
			if (matricula.equalsIgnoreCase(listaVehiculos[i].getMatricula())) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return listaVehiculos[i];
		} else {
			return null;
		}
	}

	public void mostrarListaVehiculos() {
		for (int i = 0; i < listaVehiculos.length; i++) {
			if (listaVehiculos[i] != null) {
				System.out.println(listaVehiculos[i]);
				if (listaVehiculos[i] instanceof Furgoneta) {
					((Furgoneta) listaVehiculos[i]).avisoFurgoneta();
				}
			}
		}
	}

	public double calcularRecaudadoMotos(double cantidadFija, double sumaFurgoneta) {
		double total = 0.0;
		for (int i = 0; i < listaVehiculos.length; i++) {
			if (listaVehiculos[i] != null && listaVehiculos[i] instanceof Moto) {
				total += calcularPrecioUnVehiculo(listaVehiculos[i], cantidadFija, sumaFurgoneta);
			}
		}
		return total;
	}

	public double calcularPrecioUnVehiculoNavidad(Vehiculo v, double cantidadFija, double sumaFurgoneta,
			double sumaNavidad) {
		return calcularPrecioUnVehiculo(v, cantidadFija, sumaFurgoneta) + sumaNavidad;

	}
}
