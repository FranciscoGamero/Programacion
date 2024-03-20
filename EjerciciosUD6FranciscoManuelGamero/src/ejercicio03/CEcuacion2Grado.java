package ejercicio03;


public class CEcuacion2Grado {

	public void calcularEcuacion(double a, double b, double c) throws EcuacionDegenerada, DiscriminanteNegativo{
		 double discriminante = (Math.pow(b, 2)- 4 * a * c);
		if(a==0 && b==0) {
			throw new EcuacionDegenerada("La ecuación es degenerada");
		} else if (discriminante<0){
			throw new DiscriminanteNegativo("La raíz cuadrada es negativa");
		}
		else {
			System.out.printf("Las soluciones de la ecuacion son: %.2f y %.2f\n",
					(-b + Math.sqrt(discriminante))/(2*a),(-b - Math.sqrt(discriminante))/(2*a)); 
		}
	}
}
