package repasoud3completo;

import java.util.Arrays;

public class Tienda {

	private Producto lista[];
	private int numProductos;
	private int numTrabajadores;
	
	public Tienda(Producto[] lista, int numProductos, int numTrabajadores) {
		super();
		this.lista = lista;
		this.numProductos = numProductos;
		this.numTrabajadores = numTrabajadores;
	}
	public Producto[] getLista() {
		return lista;
	}
	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	public int getNumProductos() {
		return numProductos;
	}
	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}
	public int getNumTrabajadores() {
		return numTrabajadores;
	}
	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}
	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + ", numProducto=" + numProductos + ", numTrabajadores="
				+ numTrabajadores + "]";
	}
	//VERBO EN INFINITIVO, SIN "Ñ" NI TILDES, QUE INDIQUE QUE HACE EL MÉTODO, 
	//LA SEGUNDA PALABRA EMPIEZA EN MINÚSCULA Y LA PRIMERA EN MAYÚSCULA SIEMPRE.
	
	public void agregarProducto(Producto p) {
		lista[numProductos]=p;
		numProductos++;
	}
	
	public void mostrarProductos() {
		for (int i = 0; i < numProductos; i++) {
			System.out.println(lista[i]);
		}
	
	}
	
	public void mostrarLista(Producto lista[]) {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				System.out.println(lista[i]);
			}
		}
	}
	public int buscarPorID(int id) {
		int i = 0;
		boolean encontrado=false;
		while (i<numProductos && !encontrado) {
		//	Producto listaaux[] = lista; Para ver que se puede hacer sin usar una lista auxiliar
			if(lista[i].getId()==id){
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
	
	public Producto buscarPorID2(int id) {
		int i = 0;
		boolean encontrado=false;
		while (i<numProductos && !encontrado) {
			Producto listaaux[] = lista;
			if(listaaux[i].getId()==id){
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}
	}
	public Producto[] buscarPorSeccion(int seccion) {
		int i = 0;
		Producto encontrados[]= new Producto[numProductos];
		while (i<numProductos) {
				if(lista[i].getSeccion()==seccion){
				encontrados[i]=lista[i];
			} 
				i++;
			}
		return encontrados;
	}
	public double calcularPrecioAlPublico(int id,int porcen){
		int cien=100;
		Producto p=buscarPorID2(id);
		double nuevoPrecio;
		nuevoPrecio=p.getPrecioFabrica()+(p.getPrecioFabrica()*porcen/cien);
		return nuevoPrecio;
	}
	public void modificarPrecioSeccion(int seccion,double precio) {
		//	Producto cambiarPrecio[]=buscarPorSeccion(seccion);
		for (int i = 0; i < numProductos; i++) {
			if(lista[i].getSeccion()==seccion) {
				lista[i].setPrecioFabrica(precio);
			}
		}
	}
	public double calcularDescuento(int id,int ganancia, int porcen) {
		double cien= 100.0;
		return calcularPrecioAlPublico(id, ganancia)-(calcularPrecioAlPublico(id, ganancia)*porcen/cien);
	}
	//Devuelve el nº de productos "eliminados"
	public int eliminarSeccion(int seccion) {
		int cont=0;
		for (int i = 0; i < numProductos; i++) {
			if(lista[i].getSeccion()==seccion) {
				lista[i].setEnVenta(false);
				cont++;
			}
		}
		return cont;
	}
	public void mostrarActivos() {
		for (int i = 0; i < numProductos; i++) {
			if(lista[i].isEnVenta())
				System.out.println(lista[i]);
		}
	}
}
