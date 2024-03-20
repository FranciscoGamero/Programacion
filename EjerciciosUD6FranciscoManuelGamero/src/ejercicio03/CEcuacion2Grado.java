package ejercicio03;


public class CEcuacion2Grado {

	public double calcularEcuacion(double a, double b, double c) throws EcuacionDegenerada, DiscriminanteNegativo{
		if(a==0 && b==0) {
			throw new EcuacionDegenerada("La ecuación es degenerada");
		} else if ((Math.pow(b, 2)-4*a*c)<0){
			throw new DiscriminanteNegativo("La raíz cuadrada es negativa");
		}
		else {
			return (-b*(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
		}
	}
}
