package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String aux, nombre, apellidos, usuario;
		int edad, tam=5,indice=0;
		double saldo1=4500,saldo2=250,saldo3=6340, mantenimiento=20;
		double ingreso,retiro;
		Cliente c1,c2,c3;
		Cuenta cc, cj,ce,lista[]=new Cuenta[tam];
		Oficina o;
		
		//Instancia de los clientes
		c1= new Cliente("Israel","Alcaraz Martínez",25,"isal24");
		c2= new Cliente("Maria","Esther Herrera",16,"maes07");
		c3= new Cliente("Julio", "Vega Martoran",30,"juve75");
		
		//Instancia de las cuentas (1 de cada tipo)
		cc= new CuentaCorriente(c1,saldo1,mantenimiento);
		cj= new CuentaJoven(c2,saldo2);
		ce= new CuentaEmpresa(c3, saldo3);
		
		lista[indice]=cc;
		indice++;
		lista[indice]=cj;
		indice++;
		lista[indice]=ce;
		indice++;
		
		o= new Oficina(lista);
		//Prueba de los ingresos en las 3 cuentas
		System.out.println("Introduzca cuanto desea ingresar:");
		aux=sc.nextLine();
		ingreso=Double.parseDouble(aux);
		cc.ingresarDinero(ingreso);
		System.out.printf("El saldo total es de: %.2f€. Además ha obtenido %.2f puntos\n",cc.getSaldo(),
				((CuentaCorriente)cc).getPuntos());
		cj.ingresarDinero(ingreso);
		System.out.printf("El saldo total es de: %.2f€\n",cj.getSaldo());
		ce.ingresarDinero(ingreso);
		System.out.printf("El saldo total es de: %.2f€\n",ce.getSaldo());
		
		//Prueba de retirar en las 3 cuentas (siendo el saldo mayor que 0)
		System.out.println("Introduzca cuanto desea retirar:");
		aux=sc.nextLine();
		retiro=Double.parseDouble(aux);
		cc.retirarDinero(retiro);
		System.out.printf("El saldo total es de: %.2f€\n",cc.getSaldo());
		cj.retirarDinero(retiro);
		System.out.printf("El saldo total es de: %.2f€\n",cj.getSaldo());
		ce.retirarDinero(retiro);
		System.out.printf("El saldo total es de: %.2f€\n",ce.getSaldo());
		
		//Prueba de los métodos de oficina
		System.out.printf("El dinero total de la oficina es de: %.2f€\n",o.calcularTotalDinero());
		System.out.printf("El dinero gastado en las cuentas jóvenes es de: %.2f€\n",o.calcularGastosJovenes());
		System.out.printf("El dinero ingresado por las cuentas de empresas es de: %.2f€\n",o.calcularIngresosEmpresas());
	}

}
