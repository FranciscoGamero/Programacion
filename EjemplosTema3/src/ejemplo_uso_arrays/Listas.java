package ejemplo_uso_arrays;

import java.util.Random;

public class Listas {
	
	public void rellenarArray(int desde, int hasta,int lista1[]) {
		Random rd= new Random(System.nanoTime());
		
		for (int i = 0; i < lista1.length; i++) {
			lista1[i]=rd.nextInt(hasta - desde +1)+desde;
		}
	}
	public void mostrarArray(int lista1[]) {
		for (int i = 0; i < lista1.length; i++) {
			System.out.print(lista1[i]+" ");
		}
	}
	//Podriamos hacer dos versiones, una pasando la lista como parametro
	// Y otra instanciando la lista dentro del método
	public int[] trucarLista(int lista1[]) {
		for (int i = 0; i < lista1.length; i++) {
			lista1[i]=10;
		}
		return lista1;
	}
}
