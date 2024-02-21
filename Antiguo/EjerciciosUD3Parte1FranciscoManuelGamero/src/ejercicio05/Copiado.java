package ejercicio05;


public class Copiado {
	private String textoACopiar;

	public Copiado(String textoACopiar) {
		this.textoACopiar = textoACopiar;
	}
	
	public void mostrarTexto(int numeroCopias) {
		for (int i = 0; i < numeroCopias; i++) {
			System.out.println(textoACopiar+"\n");
		}
	}
}
