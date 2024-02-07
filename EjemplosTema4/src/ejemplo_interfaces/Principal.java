package ejemplo_interfaces;

public class Principal {

	public static void main(String[] args) {

		Animal a= new Animal("Asno",4);
		Persona p = new Persona("Luismi",34);
		a.cazar(a);
		p.localizar(a);
		a.huir();
	}

}
