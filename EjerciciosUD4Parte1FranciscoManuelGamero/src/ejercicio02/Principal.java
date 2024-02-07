package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Documento d=new Documento("Samsung");
		
		TarjetaDeVisita t=new TarjetaDeVisita("Lenovo","Joel Vila Hernández");
		
		Carta c=new Carta("Carrefour","Ismael Silva Herrera", "10/1/2024");
		
		d.mostrarCabecera();
		System.out.println("*************************************");
		t.mostrarCabecera();
		System.out.println("*************************************");
		c.mostrarCabecera();
		
	}

}
