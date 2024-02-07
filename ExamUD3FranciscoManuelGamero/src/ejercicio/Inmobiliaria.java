package ejercicio;

public class Inmobiliaria {

	private Piso lista[];
	private int numPisos;
	private int numVendedores;// Trabajadores en la inmobiliaria

	public Inmobiliaria(Piso[] lista, int numVendedores, int numPisos) {
		this.lista = lista;
		this.numVendedores = numVendedores;
		this.numPisos = numPisos;
	}

	public void agregarPiso(Piso p,int contador) {
		p.setId(contador);
		lista[numPisos] = p;
		numPisos++;
	}
	public void mostrarPisos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	
	public int buscarPorID(int id) {
		int i = 0;
		boolean encontrado = false;
		while (i < numPisos && !encontrado) {
			Piso listaaux = lista[i];
			if (listaaux.getId()== id) {
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
	public double calcularPrecioFinalVenta(int id, int porcen) {
		int cien = 100, cero=0;
		int index = buscarPorID(id);
		if (index>=cero)
			return lista[index].getPrecioVenta() + (lista[index].getPrecioVenta() * porcen / cien);
		else 
			return cero;
	}

	public void mostrarprecioFinal(double precio) {
		System.out.println("");
		System.out.printf("El precio al público del piso es de: %.2f€",precio);
		System.out.println("\n");
	}
	public Piso[] buscarEstados(int estado) {
		int i = 0;
		Piso encontrados[] = new Piso[numPisos];
		while (i < numPisos) {
			Piso listaaux = lista[i];
			if (listaaux.getEstado() == estado) {
				encontrados[i] = lista[i];
			}
			i++;
		}
		return encontrados;
	}

	public void mostrarPisosNuevos(Piso listaaux[]) {		
		System.out.println("Los pisos que estan nuevos son: \n");
		for (int i = 0; i < numPisos; i++) {
			if(listaaux[i] !=null) {
				System.out.println(listaaux[i]+"\n");
			}
		}
	}

	public void modificarPiso(int id, double nuevoPrecio) {
		int cero=0;
		int index = buscarPorID(id);
		if (index>=cero)
			
			lista[index].setPrecioVenta(nuevoPrecio);
	}

	

	public double calcularMetroCuadrado(int id,int porcen) {
		int cero=0;
		int index = buscarPorID(id);
		if (index>=cero)
		return calcularPrecioFinalVenta(id, porcen)/lista[index].getMetrosCuadrados();
		else return cero;
	}
	public void mostrarMetroCuadrado(double precio) {
		System.out.println("");
		System.out.printf("El precio del metro cuadrado en este piso es de: %.2f€",precio);
		System.out.println("\n");
	}
	public double calcularGananciasSeminuevos(Piso seminuevos[]) {
		double ganancias=0;
		
		for (int i = 0; i < numPisos; i++) {
			ganancias+=seminuevos[i].getPrecioVenta();
		}
		return ganancias;
	}
	public void mostrarGananciasSeminuevos(double ganancias) {
		System.out.println("");
		System.out.printf("Las ganancias de vender los pisos seminuevos serían: %.2f€",ganancias);
		System.out.println("\n");
	}
	
	public double calcularGanaciasPorVendedor() {
		double ganancias=0;
		for (int i = 0; i < numPisos; i++) {
			ganancias+=lista[i].getPrecioVenta();
		}
		return ganancias/numVendedores;
	}
	public void mostrarGananciasVendedor(double ganancias) {
		System.out.println("");
		System.out.printf("Cada vendedor ganaría: %.2f€",ganancias);
		System.out.println("\n");
	}
}
