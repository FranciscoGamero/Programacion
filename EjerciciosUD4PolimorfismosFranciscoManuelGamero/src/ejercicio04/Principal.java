package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		double impuestoLujo=25, impuestoCaducidad=20; // se pedirian por teclado antes de ejecutar el resto del programa
		int tam=5, indice=0;
		
		LineaVenta lista[]= new LineaVenta[tam];
		Venta todo;
		
		Producto e1= new Electronica(1,"Batería", 10,impuestoLujo);
		Producto e2= new Electronica(2, "Redmi Note 12", 250,impuestoLujo);
		Producto a1= new Alimentacion(3, "Pollo asado", 10, 15,impuestoCaducidad);
		Producto a2= new Alimentacion(4, "Lechuga", 5, 1, impuestoCaducidad);
		
		 //El tamaño tmb se pediría antes
		
		LineaVenta v1= new LineaVenta(a1, 2);
		LineaVenta v2= new LineaVenta(a2, 3);
		LineaVenta v3= new LineaVenta(e1, 4);
		LineaVenta v4= new LineaVenta(e2, 1);
		
		//Por si despues hacemos un menú, poder tener creados unos objetos como prueba y poder seguir con el mismo indice
		lista[indice]= v1;
		indice++;
		lista[indice]= v2;
		indice++;
		lista[indice]= v3;
		indice++;
		lista[indice] =v4;
		indice++;
		
		todo= new Venta(lista);
		todo.mostrarLista();
		
	}

}
