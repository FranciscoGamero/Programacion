package ejemplo_polimorfismo;

public class OperacionesFiguras {

	public double calcularAreaUnaFigura(Figura f) { //UN METODO ASI VA A ESTAR CASI SIEMPRE, 
													//PARA PODER CALCULAR ALGO SOBRE LO QUE NO SABEMOS (CLASE ABSTRACTA)
		return f.calcularArea();
	}
	public double sumaAreas(Figura lista[]) {
		double suma=0;
		for (int i = 0; i < lista.length; i++) {
			suma+= calcularAreaUnaFigura(lista[i]);
			//suma+=f[i].calcularArea(); NO SE HACE ASI
		};
		return suma;
	}
	public double sumaAreasConAviso(Figura lista[]) {
		double suma=0;
		for (int i = 0; i < lista.length; i++) {
			suma+= calcularAreaUnaFigura(lista[i]);
			if(lista[i] instanceof Circulo) //Para comprobar si un objeto de la lista es de la clase circulo {
				((Circulo)lista[i]).mostrarRadianes(); //Tiene que estar todo entre parentesis para poder usar los metodos de la clase casteada
			/*	Circulo c= (Circulo)lista[i]; OTRA FORMA DE HACERLO, AMBAS ESTÁN BIEN AUNQUE A FUTURO ES MEJOR LA DE ARRIBA
				c.mostrarRadianes();*/
			}
		return suma;
	}
}
