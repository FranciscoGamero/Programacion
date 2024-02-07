package ejercicio03clase;

public class Principal {

	public static void main(String[] args) {
		double porcenMoto=60, porcenCoche=25;
		double impuestoFurgoneta=100;
		
		Motocicleta m=new Motocicleta(10,10,1);
		Furgoneta f=new Furgoneta(20,20,2,impuestoFurgoneta);
		Coche c=new Coche(30,30,3);
		
		System.out.printf("El precio final del impuesto de la motocicleta es: %.2f€\n",m.calcularImpuesto(porcenMoto));
		System.out.printf("El precio final del impuesto de la furgoneta es: %.2f€\n",f.calcularImpuesto(porcenMoto));
		System.out.printf("El precio final del impuesto del coche es: %.2f€\n",c.calcularImpuesto(porcenMoto));
		/*Introducir los porcentajes antes del programa por teclado*/
	}

}
