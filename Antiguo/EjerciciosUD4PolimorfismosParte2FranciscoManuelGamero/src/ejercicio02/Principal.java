package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precioProducto=10.5;
		int porcenIva=20;
		
		Trabajador t = new Trabajador("Pedro", "Zarzosa",1200);
		Producto p= new Producto(2, "Pavo");
		Trabajador t2 = new TrabajadorHoras("Pedro", "Zarzosa",1200,6,7);
		System.out.printf("El sueldo del trabajador: %.2f€\n",t.calculoIrpf(t.getSueldo()));
		System.out.printf("El precio con iva es: %.2f€\n",p.calculoIva(precioProducto, porcenIva));
		System.out.printf("El sueldo del trabajador: %.2f€\n",t2.calculoIrpf(t2.getSueldo()));
	}

}
