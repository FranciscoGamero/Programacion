package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		
		int tam=8, id=2;
		double descuento=20, gastoLimpieza=29.9;
		
		Gestion gestor;
		Habitacion h1 = new Habitacion(250,false,"Pedro",4,4,1);
		Habitacion h2 = new Habitacion(250, true, "Antonio",2,1,2);
		Habitacion s1= new Suite(250, true, "Tomás",5,7,3,100,140.55);
		Habitacion s2= new Suite(250, false, "Dario",3,2,4,50,40.9);
		Habitacion a1 = new Apartamento(250,true,"Marco",14,2,5,true);
		Habitacion a2 = new Apartamento(250,false,"Alejandro",3,3,6,false);
		
		Habitacion lista[]= new Habitacion[tam];
		
		lista[0]=h1; lista[1]=h2; lista[2]=s1; lista[3]= s2; lista[4]= a1; lista[5]=a2;
		
		gestor= new Gestion(lista);
		
		System.out.println(gestor.calcularPrecioCualquierHabitacion(gestor.buscarHabitacionPorId(id), 
				descuento, gastoLimpieza));
		
		System.out.println(gestor.calcularRecaudadoHabitacionesOcupadas(descuento, gastoLimpieza));
		
		gestor.mostrarFactura(gestor.buscarHabitacionPorId(id), descuento, gastoLimpieza);
		
		gestor.mostrarNoOcupadas();
	}

}
