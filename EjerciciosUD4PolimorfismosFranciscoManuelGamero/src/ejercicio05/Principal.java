package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		int tam=3,index=0;
		double objetivo= 1300;
		Empleado e1= new Vendedor("Manuel", "Fuentes Barragan", 1, 1200,40,20);
		Empleado e2= new Gerente("Pedro", "Soto", 2, 1500,10);
		Empleado lista[]= new Empleado[tam];
		
		lista[index]=e1;
		index++;
		lista[index]=e2;
		index++;
		
		Oficina o= new Oficina(lista);
		o.mostrarEmpleados(objetivo);
		o.calcularGastos();
	}

}
