package principal;

import crud.CrudProducto;
import model.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaramos variables
		
		Producto lista[];
		Producto prod1=new Producto ("1a","Atún",1.6,true);
		Producto prod2=new Producto ("1a","Pan de molde",4.5,true);
		int tam=10;
		lista=new Producto [tam];
		CrudProducto cp;
		cp=new CrudProducto(lista);
		
		// Añadimos variables al crud
		cp.add(prod1, 0);
		cp.add(prod2, 1);
	}

}
