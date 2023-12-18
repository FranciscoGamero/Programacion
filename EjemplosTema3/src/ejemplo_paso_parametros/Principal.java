package ejemplo_paso_parametros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;
		System.out.print("Valores de x e y antes de la modificación: ");
		System.out.println(" x = " + x + "; y = " + y);
		modifyPrimitiveTypes(x, y);
		System.out.print("Valores de x e y después de la modificación: ");
		System.out.println(" x = " + x + "; y = " + y);
		// Aunque en el método cambie los valores de x, y, se muestran sus valores en el main porque estos no se pierden, ya que
		// lo que se envia al método es una copia de esos valores y una vez que se llega al ; de la linea 12 desaparecen los cambios.
	}

	// este metodo es estático para no tener que crear otra clase y crear un objeto (por flojera)
	private static void modifyPrimitiveTypes(int x, int y) {
		x = 5;
		y = 10;
	}

}
