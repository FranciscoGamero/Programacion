package ejemplo_Abstracto;

public class Principal {

	public static void main(String[] args) {
		//Figura f = new Figura(2,3); // Da error porque es abstracta
		Cuadrado c = new Cuadrado(2,3,5); 
		Figura cuadrado = new Cuadrado(1,2,2); // El 1 es la x, el 2 es la y (de la figura), es una figura que se comporta como un cuadrado
		Rectangulo r = new Rectangulo(2,3,9,4);
		//y el segundo 2 es el lado del cuadrado
		
		System.out.println(cuadrado.calcularArea());
		System.out.println(r.calcularArea());
	}

}
