package For_mejorado;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[]= {1,3,5,7,9,11,13,15,17,19};
		int suma=0;
		
		//En Java no hace falta escribir for each, pero en otros lenguajes si
		//Este array empieza SIEMPRE en el primer elemento y recorre el array entero
		//Se puede poner dentro un if(valor!=null)
		for(int valor : numeros) {
			// Los operadores ? : son como un if else num1 > num2 es? 4(true) : 0(false)
			// valor debe ser del mismo tipo que el array y no se iguala a 0, ya que es una variable auxiliar
			// donde se guardan los números del array
			
			suma+=valor;
			System.out.println(valor);
		}
		System.out.println("La suma es: "+suma);
	}

}
