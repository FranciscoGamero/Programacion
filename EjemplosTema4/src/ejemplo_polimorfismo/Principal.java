package ejemplo_polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperacionesFiguras op = new OperacionesFiguras();
		Cuadrado c1= new Cuadrado("Cuadrado 1", "Negro", 2);
		Circulo c2 = new Circulo("Circulo 1", "Azul", 2);
		int tam=2;
		
		
		Figura f1 = new Cuadrado ("Figura 1 como cuadrado", "Rojo",4);
		Figura f2 = new Circulo ("Figura 2 como circulo", "Verde", 5);
		Figura lista[];
		
		//ARRAY DE CLASES ABSTRACTAS 
		
		//Deja crear el array pero no un objeto figura, porque en el array se van a 
		//guardar figuras que se instancian de otras formas (cuadrado, circulo)
		lista= new Figura[tam];
		lista[0]= f1; // Solo para ejemplo
		lista[1]=f2;	// Solo para ejemplo
	
		System.out.println(op.sumaAreasConAviso(lista));// Solo para ejemplo
		
		System.out.printf("El área es %.2f\n",op.calcularAreaUnaFigura(c1));
		System.out.printf("El área es %.2f\n",op.calcularAreaUnaFigura(c2));
		System.out.printf("El área es %.2f\n",op.calcularAreaUnaFigura(f1));
		System.out.printf("El área es %.2f\n",op.calcularAreaUnaFigura(f2));
		
		//MÉTODOS NO REESCRITOS
		
		c1.metodoSoloFigura();
		c2.metodoSoloFigura();
		c1.mostrarLado();
		c2.mostrarRadianes();
		/*f1.mostrarLado();	  DA ERROR PORQUE NO SE HEREDA HACIA ARRIBA
		f2.mostrarRadianes(); DA ERROR PORQUE NO SE HEREDA HACIA ARRIBA*/ 
	}

}
