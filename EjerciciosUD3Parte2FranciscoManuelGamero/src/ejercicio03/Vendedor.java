package ejercicio03;

public class Vendedor {
	private Movil lista[];
	private int nMov;
	private double totalVendido;

	public Vendedor(Movil[] lista, int nMov, double totalVendido) {
		super();
		this.lista = lista;
		this.nMov = nMov;
		this.totalVendido = totalVendido;
	}

	public Movil[] getLista() {
		return lista;
	}

	public void setLista(Movil[] lista) {
		this.lista = lista;
	}

	public double getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}

	public void agregarMovil(Movil v) {
		lista[nMov] = v;
		nMov++;
	}

	public int comprobarNoVendidos() {
		int cont = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isVendido() == false) {
				cont++;
			}
		}
		return cont;
	}

	public int encontrarPorNombre(String nombre) {
		int i = 0;
		boolean encontrado = false;
		while (i < nMov && !encontrado) {
			Movil delista = lista[i];
			if (delista.getModelo().equalsIgnoreCase(nombre)) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}
	public boolean comprobarestado(int encontrado) {
		if(lista[encontrado].isEstadomov()) {
			return true;
		} else {
			return false;
		}
	}
	public double calcularPrecio(boolean estado,double precio,int porcen) {
		int cien=100;
		if (estado) {
			return precio;
		} else {
			return precio-(precio*porcen/cien);
		}
	}
	public void mostrarPrecio(double precio) {
		System.out.printf("El precio total por el móvil es de: %.2f€",precio);
	}
	public double calcularGanancias() {
		for (int i = 0; i < lista.length; i++) {
			totalVendido+=lista[i].getPrecioUnitario();
		}
		return totalVendido;
	}
	public void mostrarGanancias(double ganancias) {
		System.out.printf("Las posibles ganancias de los móviles es de: %.2f",totalVendido);
	}
}
